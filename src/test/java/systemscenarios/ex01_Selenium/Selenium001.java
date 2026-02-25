package systemscenarios.ex01_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium001 {
    public static void main(String[] args) {

        // Source Code here ->
        // Converted -> JSON Wire Protocol | HTTP Request | API request
        // Browser Driver | Server (application running on a particular port )
        // Browser Driver -> Real Driver

        // Selenium 3
        // Download the driver binary
        // System.getProperty ---- start the binary

        // Selenium 4
        // Selenium manager (application)
        // Selenium will automatically download the drivers and start

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
