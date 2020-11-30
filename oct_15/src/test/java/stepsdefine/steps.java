package stepsdefine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.loginpage;

public class steps {
	
	loginpage lp;
	public static WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   lp = new loginpage(driver);
	   
	   WebDriverManager.chromedriver().setup();
	   
	   driver = new ChromeDriver();
	}

//	@When("User open url {string}")
//	public void user_open_url(String url) {
//	    // Write code here that turns the phrase above into concrete actions
//	 driver.get(url);
//	}

	@And("User enter emailid {string} and password {string}")
	public void user_enter_emailid_and_password(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
   lp.setusername(uname);
   
   lp.setpassword(pwd);
   
	}

	@And("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
   lp.clicklogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@And("Click on logout")
	public void click_on_logout() {
	    // Write code here that turns the phrase above into concrete actions
	  lp.clicklogout(); 
	}
	@And("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit(); 
	}

}
