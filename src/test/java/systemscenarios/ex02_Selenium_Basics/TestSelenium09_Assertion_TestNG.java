package systemscenarios.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {

    @Test
    public void test_Selenium_01(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        // TestNG
      //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com"); //Fails because CurrentURL contains time which changes every second

        Assert.assertEquals(driver.getTitle(), "Google");


        //AssertJ - Fluent assertion
        assertThat(driver.getTitle())
                .isNotEmpty()
                .isNotBlank()
                .isNotNull()
                .isEqualTo("Google");

        driver.quit();

    }
}
