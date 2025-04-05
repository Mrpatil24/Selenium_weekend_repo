package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByDependentandIndependentElement {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input[@value='Add to cart']")).click();
		
		
	}

}
