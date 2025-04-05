package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetSize {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Dimension size = driver.findElement(By.xpath("//input[@value='Subscribe']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		 Point position = driver.findElement(By.xpath("//input[@value='Subscribe']")).getLocation();
		System.out.println(position.getX());
		System.out.println(position.getY());
		System.out.println(position);
		
		driver.quit();
	}

}
