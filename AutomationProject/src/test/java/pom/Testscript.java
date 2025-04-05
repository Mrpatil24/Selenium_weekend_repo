package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailId().sendKeys("Abhishek@gamil.com");
		lp.getPassword().sendKeys("9876543210");
		lp.getLogin().click();
				
		StalePom st = new StalePom(driver);
		st.getSearchTF().sendKeys("mobile",Keys.ENTER);
		st.getSearchTF().sendKeys("selenium");
		

	}

}
