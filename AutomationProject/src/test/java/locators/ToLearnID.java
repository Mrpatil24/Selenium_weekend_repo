package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Pre condition Max
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("Abhishek");
	}

}
