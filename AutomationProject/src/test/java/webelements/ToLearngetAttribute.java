package webelements;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetAttribute {


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/account/login");
		
		
		String Value = driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println(Value);
		

	}

}
