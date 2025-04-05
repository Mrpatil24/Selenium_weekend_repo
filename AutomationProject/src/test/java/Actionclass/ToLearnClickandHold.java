package Actionclass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickandHold {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("userName")).sendKeys("Abhishek");
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		//to perform click and hold mouse actions
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).pause(2000).release();//pause is using for clickandhold for particular time 
		act.clickAndHold(eyeIcon).pause(2000).release();
	}

}
