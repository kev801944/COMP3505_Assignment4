package my.domain.name.FBlogin.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class CreateAccountSteps {
    WebDriver driver;

    @Given("I navigate to the JPetStore registration page")
    public void i_navigate_to_registration_page() {
        driver.get("http://your-jpetstore-url.com/register");
    }

    @When("I enter valid account details")
    public void i_enter_valid_account_details() {
        driver.findElement(By.name("username")).sendKeys("testUser123");
        driver.findElement(By.name("password")).sendKeys("testPass123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("testPass123");
        
        driver.findElement(By.name("account.firstName")).sendKeys("Michael");
        driver.findElement(By.name("account.lastName")).sendKeys("Tandyo");
        driver.findElement(By.name("account.email")).sendKeys("michael@example.com");
        driver.findElement(By.name("account.phone")).sendKeys("1234567890");
        driver.findElement(By.name("account.address1")).sendKeys("123 Street NW");
        driver.findElement(By.name("account.address2")).sendKeys("Apt 4");
        driver.findElement(By.name("account.city")).sendKeys("Calgary");
        driver.findElement(By.name("account.state")).sendKeys("AB");
        driver.findElement(By.name("account.zip")).sendKeys("T2X 0L3");
        driver.findElement(By.name("account.country")).sendKeys("Canada");
        driver.findElement(By.name("newAccount")).click();
        Thread.sleep(5000);
    }

    @And("I submit the form")
    public void i_submit_the_form() {
        driver.findElement(By.name("register")).click();
    }

    @Then("I should see an account creation confirmation message")
    public void i_should_see_confirmation_message() {
        boolean isCreated = driver.findElement(By.id("confirmation")).isDisplayed();
        assert isCreated;
        driver.quit();
    }
}
