package systemscenarios.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
## **Practice Selenium Project #1 **
1. Open the URL -> (https://katalon-demo-cura.herokuapp.com/)
2. Verify the Text in the Page source -> CURA Healthcare Service

 */
public class TestSelenium07_Selenium_Commands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
