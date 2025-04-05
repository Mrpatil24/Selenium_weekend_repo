package prjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_tool {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//Using ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://10.188.106.183/login");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
//To perform send file operation in Tool screen.
				driver.findElement(By.xpath("//button[text()='Tool']")).click();
				//<a> tag
				driver.findElement(By.xpath("//a[@href='/tool']")).click();
				
				driver.quit();		
		

	}

}
