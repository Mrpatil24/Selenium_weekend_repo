package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrigerCompleteURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Complete URL
		driver.navigate().to("https://www.zomato.com/partner-with-us/new/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
