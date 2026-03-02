package systemscenarios.ex04_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18_MiniProject {
    @Owner("Sameena")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_Login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // //input[@name='username'] can also be writing as //*[@name='username']
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");

        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");

        //WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();

        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));

        Assert.assertEquals(h6.getText(), "PIM");

        driver.quit();




    }
}
