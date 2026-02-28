package systemscenarios.ex03_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Katalon {
    @Owner("Sameena")
    @Description("Go - https://katalon-demo-cura.herokuapp.com/\n" +
            "Click on the Make appointment button, enter the username , password given\n" +
            "Verify that the URL and 'Make Appointment' display")
    @Test
    public void selenium_katalon_make_appointment(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment_link = driver.findElement(By.linkText("Make Appointment"));
        make_appointment_link.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();

       // Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        WebElement make_appointment_display = driver.findElement(By.linkText("Make Appointment"));
        System.out.println(make_appointment_display.getText());

        Assert.assertEquals(make_appointment_display.getText(), "Make Appointment");

        driver.quit();



    }
}
