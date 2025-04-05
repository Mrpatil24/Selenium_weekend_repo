package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		
	WebElement textbx = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(textbx.isDisplayed());
		System.out.println(textbx.isEnabled());
	}

}
