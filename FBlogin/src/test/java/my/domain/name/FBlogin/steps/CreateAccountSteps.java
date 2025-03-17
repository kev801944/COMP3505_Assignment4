package my.domain.name.FBlogin.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class CreateAccountSteps {
    WebDriver driver;

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\micha\\Downloads\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    try {

        driver.get("http://130.211.202.212:8080/jpetstore/actions/Account.action?newAccountForm=");
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
    } catch (Exception e) {

        e.printStackTrace();

    } finally {
        driver.quit();
    }

}

}


