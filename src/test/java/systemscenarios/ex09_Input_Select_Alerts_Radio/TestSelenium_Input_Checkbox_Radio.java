package systemscenarios.ex09_Input_Select_Alerts_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Input_Checkbox_Radio {
    @Test
    public void test_HTMLTags(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("the testing academy");

        //Radio Box
        WebElement radiobox = driver.findElement(By.id("sex-1"));
        radiobox.click();

        //Check Box
        WebElement checkbox = driver.findElement(By.id("profession-1"));
        checkbox.click();
    }
}
