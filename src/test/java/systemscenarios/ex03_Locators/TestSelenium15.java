package systemscenarios.ex03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium15 {
    @Test
    public void test_app_vwo_com() throws InterruptedException {
        // Driver Managing
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        // Locators
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password and enter the 1234.
        // Step 3 - Find the Submit and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

        // <input - open tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID"
        // > - close tag

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        // Step 2 - Find the Password and enter the 1234.
        // <input
        // type="password"
        // class="text-input W(100%) Pend(36px)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password">

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("wrongpass@123");

        // Step 3 - Find the Submit and click on the button.
        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(24px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica">
        // <span
        // class="icon loader D(n)"
        // data-qa="zuyezasugu">
        // </span> <span
        // data-qa="ezazsuguuy"
        // vwo-html-translate="login:signIn">Sign in</span> </button>

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        // Step 4 - Wait some time.
        Thread.sleep(5000);

        // Step 5 - Verify the message error message.

        // <div class="notification-box-description" id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div> </div> </div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        // Assertions
        // error_message - AR
        // "Your email, password, IP address or location did not match" - ER

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        // Quit
        driver.quit();
    }
}
