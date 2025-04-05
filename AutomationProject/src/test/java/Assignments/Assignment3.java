package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//a[@href='login.php?type=login']")).click();
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//label[text()='Keep me logged in']/..//input[@type='checkbox']")).click();
		WebElement checkbx = driver.findElement(By.xpath("//label[text()='Keep me logged in']/..//input[@type='checkbox']"));
		System.out.println(checkbx.isSelected());
		
		driver.findElement(By.className("login_Btn")).submit();
		
		String timespan = LocalDateTime.now().toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+timespan+".png");
		FileHandler.copy(temp, dest);
		
		driver.quit();
		
	}

}
