package prjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaitenanceSummary {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(02,TimeUnit.SECONDS);
		
// To Perform Auto Refresh toggle to set ON.	
				driver.get("http://10.188.106.183/login");
				driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("123456");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='ms-5 toggle-dark toggle-shift']")).click();
				driver.switchTo().alert().accept();

//To perform the Feed Operation from maintenance summary screen.				
				
				driver.findElement(By.xpath("//button[text()='Feed']")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
	}

}
