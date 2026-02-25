package systemscenarios.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_DriverChange {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }
}
/*
IQ: Can we change the driver in between? Yes if we are using WebDriver
 */