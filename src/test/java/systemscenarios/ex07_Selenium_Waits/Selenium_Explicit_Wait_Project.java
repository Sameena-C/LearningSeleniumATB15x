package systemscenarios.ex07_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Explicit_Wait_Project {
    @Owner("Sameena")
    @Description("VWO Login using Explicit waits")
    @Test
    public void test_vwo_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.cssSelector("#login-username"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-username")));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.cssSelector("input[name='password']"));
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("button#js-login-btn"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#js-login-btn")));
        buttonSubmit.click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".notification-box-description"));
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessage, "Your email, password, IP address or location did not match"));

        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

        driver.quit();

    }
}
