package browsertesting;
/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Forgot your password?’ link.
 * 7. Print the current URL.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email in the email field.
 * 11. Enter the password in the password field.
 * 12. Click on the Login Button.
 * 13. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Get page Title
        System.out.println(driver.getTitle());

        //Print the current URL
        System.out.println(driver.getCurrentUrl());

        // Print the Page source
        System.out.println("Page source is: " + driver.getPageSource());

        // Click on the ‘Forgot your password?’ link
        WebElement forgotPasswordLink = driver.findElement(By.className("orangehrm-login-forgot-header"));
        forgotPasswordLink.click();

        // Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // Navigate back to the login page
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Refresh the page
        driver.navigate().refresh();

        // Enter the username in the Username field
        WebElement usernameField = driver.findElement(By.id("Username"));
        usernameField.sendKeys("Admin");

        // Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("admin123");

        // Click on the Login Button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // Close the browser
        driver.quit();


    }

}
