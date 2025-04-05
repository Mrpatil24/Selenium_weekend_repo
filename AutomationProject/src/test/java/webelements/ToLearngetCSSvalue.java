package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCSSvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String	color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
		System.out.println(color);
	String	fontfamily = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
		System.out.println(fontfamily);
	}

}
