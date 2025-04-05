package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

//declaration
	
		@FindBy (linkText = "Log in")
		private WebElement loginlink;
		
//initialization (ctrl + Space for constructor)
		
public WelcomePage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	
}
//getter (right click-source-generate getters and setters-select getters-generate)

public WebElement getLoginlink() {
	return loginlink;
}

	}


