package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//write A script for traverse four windows.
public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		//Pre-Condition MAX
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//first window
		//trigger the URL
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//Open Second window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Trigger the URL
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		
		//Open the Third window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Trigger the URL
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(2000);
		
		//open the fourth window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//trigger the window
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		
		//Capture the All windows ID's
		Set<String>	allWindIds =driver.getWindowHandles();
		System.out.println("allWindIds :"+ allWindIds);
		
		for(String Wid:allWindIds) {
			String urlWId =driver.switchTo().window(Wid).getCurrentUrl();
			
			if(urlWId.equals("https://www.flipkart.com/")) {
				
//Case - 1 Capture the Title and URL of FirstWindow.
				
			String firstWinTitle =driver.getTitle();
			System.out.println("firstWinTitle :"+ firstWinTitle);
				String	firstWinUrl =driver.getCurrentUrl();
				System.out.println("firstWinUrl :" +firstWinUrl);
				
			}
		
			else if(urlWId.equals("https://www.meesho.com/"))
			{
//case - 2 capture the Size and position of Second Window.
			int	secondWindHeight = driver.manage().window().getSize().getHeight();
			System.out.println("secondWindHeight :" + secondWindHeight);
			int secondWindWidth = driver.manage().window().getSize().getWidth();
			System.out.println("secondWindWidth :" + secondWindWidth);
			
			int	secondWindXpoint = driver.manage().window().getPosition().getX();	
			System.out.println("secondWindXpoint :" +secondWindXpoint);
			
			int secondWindYpoint = driver.manage().window().getPosition().getY();
			System.out.println("secondWindYpoint :" +secondWindYpoint );
			
			}
			
			else if(urlWId.equals("https://www.swiggy.com/restaurants")) {
				
//case - 3 Set the Size and position of Third window
					
					Dimension thirdWindSize = new Dimension(300,600);
					driver.manage().window().setSize(thirdWindSize);
					System.out.println("thirdWindSize :"+ thirdWindSize );
					Thread.sleep(2000);
					
					Point thirdWindPosition = new Point(15, 20);
					driver.manage().window().setPosition(thirdWindPosition);
					System.out.println("thirsWindPosition :"+ thirdWindPosition);
					
			}
			
			else if(urlWId.endsWith("https://www.zomato.com/")) {
//case -4 close the Fourth Window only				
				Thread.sleep(2000);
					driver.close();
			}
			
		}	
//Terminate the Session
		//driver.quit();
		
	}

}
