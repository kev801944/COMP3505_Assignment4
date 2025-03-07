package my.domain.name.FBlogin.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("I open Chrome browser")
	public void i_open_chrome_browser() throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	@Given("I go to Facebook page")
	public void i_go_to_facebook_page() {
		driver.get("http://www.facebook.com");
	}
	
	@When("I enter valid {string} and {string} combination")
	public void i_enter_valid_and_combination(String string, String string2) {
		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("pass")).sendKeys(string2);
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() throws Throwable {
		try {
			WebElement element = driver.findElement(By.linkText("Home"));
			assertTrue(true);
		} catch (Exception e) {
			fail();
		} finally {
			driver.quit();
		}
	}
}
