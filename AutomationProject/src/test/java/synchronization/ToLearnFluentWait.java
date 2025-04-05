package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToLearnFluentWait {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/23");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkbtn = driver.findElement(By.id("Check"));
		
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(20));
		
		fwait.pollingEvery(Duration.ofMillis(200));
		fwait.until(ExpectedConditions.elementToBeClickable(checkbtn));
	
		checkbtn.click();

	}

}
