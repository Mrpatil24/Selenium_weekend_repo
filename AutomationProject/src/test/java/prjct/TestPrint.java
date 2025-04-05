package prjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestPrint {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(02,TimeUnit.SECONDS);
		
		driver.get("http://10.188.106.253/login");
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("123456");
		driver.findElement(By.id("login-btn")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Tool']")).click();
		driver.findElement(By.xpath("//a[@href='/testprint']")).click();
		
		//select by visible text
		WebElement dropdown1 = driver.findElement(By.name("TP_PRINT_CONDTN_PRNT_SPEED"));
		Select select1 = new Select(dropdown1);
		select1.selectByVisibleText("3 inch/sec");
		
		//select by Index
		WebElement dropdown2 = driver.findElement(By.name("TP_PRINT_CONDTN_ISSUE_MODE"));
		Select select2 = new Select(dropdown2);
		select2.selectByIndex(1);
		
		//select by value
		WebElement dropdown3 = driver.findElement(By.name("TP_PRINT_CONDTN_PRNT_MTD"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("1");
		
		driver.findElement(By.xpath("//button[text()='Test Print']")).click();
		
		driver.quit();
		
	}

}
