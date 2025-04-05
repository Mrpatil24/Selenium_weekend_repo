package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//To fetch  WebPage Screenshot
		String timespan = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(timespan);
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+timespan+".png");
		FileHandler.copy(temp, dest);
		
//To fetch webElement Screenshot		
		String timespan2 = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(timespan2);
		File temp1 = driver.findElement(By.xpath("//input[@value='Subscribe']")).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/" + timespan2 + ".png");
		FileHandler.copy(temp1, dest1);
	}
}
