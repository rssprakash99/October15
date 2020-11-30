package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public static WebDriver ldriver;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtpwd;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")
	WebElement lginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement lgoutbtn;
	
	public loginpage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void setusername(String uname) {
		
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
	}
	
	public void clicklogin() {
		
		lginbtn.click();
	}
	
	public void clicklogout() {
		
		lgoutbtn.click();
	}
}
