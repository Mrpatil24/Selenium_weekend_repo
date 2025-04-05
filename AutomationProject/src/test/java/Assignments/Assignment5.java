package Assignments;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
	WebElement Photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
	driver.switchTo().frame(Photoframe);
	
WebElement	img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
WebElement	img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
WebElement  img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
WebElement  trash = driver.findElement(By.xpath("//div[@id='trash']"));

	Actions act = new Actions(driver);
	act.dragAndDrop(img1, trash).perform();
	act.dragAndDrop(img2, trash).perform();
	act.dragAndDrop(img3, trash).perform();
	

	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,+document.body.scrollHeight)");
	
	Thread.sleep(2000);
	
	String timespan = LocalDateTime.now().toString().replace(":", "-");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/"+timespan+".png");
	
	FileHandler.copy(temp, dest);
	
	driver.quit();
	
	
	
	}

}
