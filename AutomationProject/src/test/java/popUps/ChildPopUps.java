package popUps;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();//Capture all window Id's
		
		for(String id:allWindowIds) {
		driver.switchTo().window(id);   // Switching to Each window by passing id
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(2000);
		if(currenturl.contains("flipkart")) {
			driver.close();
		}
			
		}
	}

}
