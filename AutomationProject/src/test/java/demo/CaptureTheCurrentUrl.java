package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheCurrentUrl {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		//trigger the current url
		driver.get("https://www.facebook.com/");
		//capture the current url
	String facebookUrl = driver.getCurrentUrl();		
	System.out.println("facebookUrl = "+ facebookUrl);
	
		}

}
