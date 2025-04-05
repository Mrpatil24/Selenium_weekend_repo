package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//initialize 
	@FindBy (id="Email")
	private WebElement emailId;
	
	@FindBy(name="Password")
	private WebElement password;
	
	@FindBy (xpath ="//input[@value='Log in']")
	private WebElement login;
	
	//declare constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

//getters
	public WebElement getEmailId() {
		return emailId;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	
	

}
