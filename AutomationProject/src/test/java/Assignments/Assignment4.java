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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@href='/141-inch-laptop']/../..//input[@value='Add to cart']")).click();
		
		WebElement content = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
		 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='The product has been added to your ']")));
		
		 String timespan = LocalDateTime.now().toString().replace(":", "-");	
			// To takeScreenshot of full webpage 	
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/"+timespan +".png");
			FileHandler.copy(temp, dest);
		 
	
	String timespan1 = LocalDateTime.now().toString().replace(":", "-");
	//To takeScreenshot of perticular message
		 File temp1 = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getScreenshotAs(OutputType.FILE);
		 File dest1 = new File("./Screenshot/"+timespan1+".png");
		 FileHandler.copy(temp1, dest1);
		 
		 
		
		 driver.quit();
		
		
		
		
		

	}

}
