package prjct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(02,TimeUnit.SECONDS);
	
		Robot robot = new Robot();
		
		driver.get("http://10.188.106.253/login");
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("123456");
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.xpath("//button[text()='Tool']")).click();
		driver.findElement(By.xpath("//a[@href='/tool']")).click();
		
	StringSelection	sendfile = new StringSelection("C:\\Users\\rabhishekpatil\\Desktop\\BASIC\\TPCL.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sendfile, null);
		
		
		driver.findElement(By.xpath("//button[text()='Send File']")).click();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	driver.quit();
		
	}

}
