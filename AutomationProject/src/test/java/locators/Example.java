package locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/account/login");
	
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	
		String flpkrtTitle = driver.getTitle();
		System.out.println(flpkrtTitle);
		
	}

}
