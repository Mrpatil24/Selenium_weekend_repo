package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
WebElement	latestclass	= driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		Actions act = new Actions(driver);
		act.scrollToElement(latestclass).perform();
		
		Thread.sleep(2000);
		
		act.scrollByAmount(0, 500).perform(); 
		act.scrollByAmount(400, 0).perform();
		
	}

}
