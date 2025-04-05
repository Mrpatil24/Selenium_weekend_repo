package demo;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//trigger the url
		driver.get("https://www.facebook.com/");
		
		
	}

}
