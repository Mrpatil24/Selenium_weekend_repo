package demo;


import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {

	public static void main(String[] args) throws InterruptedException {
		
		// launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Pre-Condition MAX
		driver.manage().window().maximize();
		
		//trigger the URL
		driver.get("https://www.flipkart.com/");
		
		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//trigger the URL
		driver.get("https://www.meesho.com/");
		
		//capture the all the window id's
	Set<String> allWids =driver.getWindowHandles();
	
		//number of windows
	System.out.println(allWids.size());
	for(String Wid:allWids) {
		String urlWid = driver.switchTo().window(Wid).getCurrentUrl();
		
		if(urlWid.equals("https://www.flipkart.com/")) {
			//parent window
			System.out.println("No actions need to be performed");
			
		}
		else if(urlWid.endsWith("https://www.meesho.com/"))
		{
			//child window
			String MeeshoTitle = driver.getTitle();
			System.out.println("MeeshoTitle :"+ MeeshoTitle);
			
			//capture the size and position 
			//size - Height
		int	childWindowHeight =driver.manage().window().getSize().getHeight();
		System.out.println("childWindowHeight :"+ childWindowHeight);
		
		//size - Width
	int	childWindowWidth =driver.manage().window().getSize().getWidth();
		System.out.println("childWindowWidth :" + childWindowWidth);
		
		//Position  X-Axis
	int	xAxisofChildWindow=driver.manage().window().getPosition().getX();
		System.out.println("xAxisofChildWindow :"+ xAxisofChildWindow);
		
		//position Y-Axis
		int yAxisofChildWindow=driver.manage().window().getPosition().getY();
			System.out.println("yAxisofChildWindow :"+ yAxisofChildWindow);
			Thread.sleep(3000);
			
			//set the Size of the Child Window
			Dimension preDefinedSize = new Dimension(600,800);
			driver.manage().window().setSize(preDefinedSize);
			Thread.sleep(3000);
			
			//set the Position of the Child window
			Point	preDefinedPoint = new Point(200, 300);
			driver.manage().window().setPosition(preDefinedPoint);
			Thread.sleep(3000);
		
			// Only one window will be closed which is under the control
			//driver.close();
			
		}
	}
		
	//close All the Window ------- terminates the session.
	//driver.quit();
	}

}
