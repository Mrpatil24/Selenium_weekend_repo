package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForToStringUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prodapt.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.prodapt.com/service/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.prodapt.com/success-stories-landing/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.prodapt.com/insights/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://www.prodapt.com/contact-us/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();		

	}

}
