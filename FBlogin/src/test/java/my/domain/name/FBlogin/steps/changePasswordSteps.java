package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class ChangePasswordSteps {
    WebDriver driver;

    @Given("I am logged in")
    public void i_am_logged_in() {
        driver.get("http://your-jpetstore-url.com/login");
        driver.findElement(By.name("username")).sendKeys("j2ee");
        driver.findElement(By.name("password")).sendKeys("j2ee");
        driver.findElement(By.name("login")).click();
    }

    @When("I navigate to the account settings")
    public void i_navigate_to_account_settings() {
        driver.findElement(By.id("settings")).click();
    }

    @And("I update the password to {string}")
    public void i_update_password(String newPassword) {
        driver.findElement(By.name("newPassword")).sendKeys(newPassword);
        driver.findElement(By.name("confirmPassword")).sendKeys(newPassword);
        driver.findElement(By.name("updatePassword")).click();
    }

    @Then("I should see a password change confirmation message")
    public void i_should_see_password_change_confirmation() {
        boolean isChanged = driver.findElement(By.id("successMessage")).isDisplayed();
        assert isChanged;
        driver.quit();
    }
}
