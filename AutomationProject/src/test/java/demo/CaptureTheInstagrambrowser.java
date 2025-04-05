package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheInstagrambrowser {

	public static void main(String[] args) throws InterruptedException {
		//To launch the Browser
		WebDriver driver = new ChromeDriver();
	
			Thread.sleep(3000);
	
		//Pre-condition  --MAximise
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Triger Instagram Url
		driver.get("http://10.188.106.81/login");
		Thread.sleep(3000);
		
		//To get current url
		String Webprinterurl =driver.getCurrentUrl();
		System.out.println("WebprinterUrl = "+ Webprinterurl);
		
		//To get current window Title
		String WebprinterpageTitle = driver.getTitle();
		System.out.println("WebprinterpageTitle ="+ WebprinterpageTitle);
		Thread.sleep(3000);
		
		//post-condition -- minimise
		driver.manage().window().minimize();

	}

}
