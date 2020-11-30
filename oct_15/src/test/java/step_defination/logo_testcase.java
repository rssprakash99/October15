package step_defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logo_testcase {
	
	public static WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
	 
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}

	@When("I open orangeHRM home page")
	public void i_open_orangeHRM_home_page() {
	   
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("Verify logo present on home page")
	public void verify_logo_present_on_home_page() {
	    
		boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		
		Assert.assertTrue(status);
	}

	@And("Close the browser")
	public void close_the_browser() {
	    
		driver.quit();
	}



}
