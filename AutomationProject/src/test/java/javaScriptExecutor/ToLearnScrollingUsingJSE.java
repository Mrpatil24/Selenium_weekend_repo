package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollingUsingJSE {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000); 
		
		WebElement element = driver.findElement(By.xpath("//a[@href='/search']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		//js.executeScript("window.scrollTo(0,+document.body.scrollHeight)");
		
		//Thread.sleep(2000);
		

		//scrollIntoView Method 
		js.executeScript("arguments[0].scrollIntoView(true)", element);
			
	}

}
