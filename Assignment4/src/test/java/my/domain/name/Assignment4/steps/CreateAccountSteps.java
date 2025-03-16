package steps;

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
        driver.findElement(By.name("password")).sendKeys("SecurePass123");
        driver.findElement(By.name("confirmPassword")).sendKeys("SecurePass123");
        driver.findElement(By.name("firstName")).sendKeys("John");
        driver.findElement(By.name("lastName")).sendKeys("Doe");
        driver.findElement(By.name("email")).sendKeys("test@example.com");
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
