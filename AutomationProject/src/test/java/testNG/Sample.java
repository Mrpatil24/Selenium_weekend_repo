package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test(priority = 1,invocationCount = 1,enabled = false)
	public void register() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register test case executed",true);
	
	}
	@Test(priority = 2,invocationCount = 3, threadPoolSize = 3)
	public void login() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login test case executed",true);
	
}

}