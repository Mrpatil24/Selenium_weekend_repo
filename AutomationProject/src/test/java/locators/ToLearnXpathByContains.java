package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Email')]")).sendKeys("7090558092");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(text(),'Email')]")).sendKeys("1234567890");
	}

}
