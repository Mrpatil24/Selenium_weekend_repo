package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register test case executed",true);
	
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login test case executed",true);
	
}
	@Test(dependsOnMethods = {"register","login"})
	public void cart() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/25-virtual-gift-card");
		Reporter.log("Item added to the Cart",true);
	
}

}
