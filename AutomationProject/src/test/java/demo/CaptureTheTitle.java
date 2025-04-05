package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CaptureTheTitle {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	String	facebookPageUrl=driver.getCurrentUrl();
	System.out.println("facebookPageUrl = "+ facebookPageUrl);
	//Capture the Title
			String facebookPageTitel = driver.getTitle();
		    System.out.println("facebookPageTitle =" + facebookPageTitel);
			
			
	

	}

}
