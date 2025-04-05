package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/account/login");
		
	WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	 Actions act = new Actions(driver);
	 act.moveToElement(electronics).perform();
	 
WebElement apple = driver.findElement(By.xpath("//a[text()='Apple']"));
	act.moveToElement(apple).click().perform();
	
	 
		
	}

}
