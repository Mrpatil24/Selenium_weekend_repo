package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		//Pre-condition -- MAX
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//capture the ThewindowID
		String windowID=driver.getWindowHandle();
		System.out.println("the windowID is:"+ windowID);
		
		//capture the URL
		String facebookpageUrl=driver.getCurrentUrl();
		System.out.println("facebookUrl = "+ facebookpageUrl);
		
		String facebookPageTitle = driver.getTitle();
		System.out.println("facebookPageTitel "+ facebookPageTitle);
		Thread.sleep(3000);
		
		//post-condition -- MIN
		driver.manage().window().minimize();
			
	}

}
