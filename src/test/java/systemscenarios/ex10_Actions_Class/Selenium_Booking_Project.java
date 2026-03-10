package systemscenarios.ex10_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import systemscenarios.WaitHelpers;

public class Selenium_Booking_Project {
    @Test
    public void test_booking_dot_com()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();

        WaitHelpers.checkVisibility(driver, By.xpath("//button[@aria-label='Dismiss sign-in info.']"));

        //Step 1
        WebElement close_popup = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
        close_popup.click();

        WaitHelpers.waitJVM(2000);
        //Step 2

        WaitHelpers.checkVisibility(driver, By.xpath("//a[@id='flights']"));
        WebElement flights_option = driver.findElement(By.xpath("//a[@id='flights']"));
        flights_option.click();

        //Step 3

        WaitHelpers.checkVisibility(driver, By.xpath("(//span[text()='Going to'])[1]"));
        WebElement going_to = driver.findElement(By.xpath("(//span[text()='Going to'])[1]"));
        going_to.click();

        WebElement input_box = driver.findElement(By.xpath("//input[@data-ui-name='input_text_autocomplete']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(input_box).sendKeys("delhi" + Keys.TAB + Keys.ENTER );

        //Step 4
        WaitHelpers.checkVisibility(driver, By.xpath("//button[@data-ui-name='button_search_submit']"));
        WebElement search = driver.findElement(By.xpath("//button[@data-ui-name='button_search_submit']"));
        search.click();

        WaitHelpers.waitJVM(5000);
        driver.quit();


    }
}
