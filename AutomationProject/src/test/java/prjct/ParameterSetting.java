package prjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterSetting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("http://10.188.106.183/login");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
//To Enter the Values in Standard screen.
		
				driver.findElement(By.xpath("//button[text()='Parameter Setting']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.partialLinkText("Standard")).click();
				//Thread.sleep(2000);
				driver.findElement(By.name("STD_INFO_LOCATION")).sendKeys("Bengalure");
				//Thread.sleep(2000);
				driver.findElement(By.name("STD_INFO_CONTACT_INFO")).sendKeys("9876543210");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				//Thread.sleep(2000);
				driver.switchTo().alert().dismiss();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Reset']")).click();
				//Thread.sleep(2000);
				driver.switchTo().alert().accept();
				//Thread.sleep(2000);
				driver.navigate().refresh();
	}

}
