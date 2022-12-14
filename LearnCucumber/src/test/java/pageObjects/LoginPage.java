package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement Loginbtn;
	
	@FindBy(linkText= "Logout")
	@CacheLookup
	WebElement Logoutbtn;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	public void setUserPassword(String upassword) {
		txtpassword.clear();
		txtpassword.sendKeys(upassword);
		
	}
	public void Login() {
		Loginbtn.click();
	}
	public void Logout() {
		Logoutbtn.click();
	}

}
