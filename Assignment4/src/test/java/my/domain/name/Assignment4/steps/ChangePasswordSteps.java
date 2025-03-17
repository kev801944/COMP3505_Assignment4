package my.domain.name.Assignment4.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChangePasswordSteps {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\micha\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
        	driver.get("http://130.211.202.212:8080/jpetstore/actions/Catalog.action");
        	WebElement signInLink = driver.findElement(By.xpath("//a[contains(@href, 'signonForm')]"));
        	signInLink.click();
        	Thread.sleep(2000); 
        	WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        	usernameField.clear();
        	usernameField.sendKeys("testUser123");
        	WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        	passwordField.clear();
        	passwordField.sendKeys("testPass123");
        	WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        	loginButton.click();
        	driver.findElement(By.xpath("//a[@href='/jpetstore/actions/Account.action?editAccountForm=']")).click();
        	driver.findElement(By.name("password")).sendKeys("newPass456");
        	driver.findElement(By.name("repeatedPassword")).sendKeys("newPass456"); 
        	driver.findElement(By.name("editAccount")).click(); 
        	Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

        

            driver.quit();

        }

    }

}