package systemscenarios.ex06_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Table_Project1 {

        @Test

        public void testTable() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
            input_username.sendKeys("admin");
            WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            input_password.sendKeys("Hacker@4321");
            WebElement button = driver.findElement(By.xpath("//button"));
            button.click();
            Thread.sleep(2000);

            //To get the name of the employee who got terminated:

        WebElement name = driver.findElement(By.xpath("//div[@role='row'][.//div[text()='Terminated']]//div[@role='cell'][3]//div"));
        System.out.println(name.getText());


            //div[@role= 'row'] <--- Find the row
            // [.//div[text()='Terminated']] <--- that contains Terminated
            // div[text() = 'Akshay Dilip'] <--- go up // div and then trace down to text that conatins the intended emp name

            WebElement employee = driver.findElement(By.xpath("//div[@role='row'][.//div[text()='Terminated']]"));
            driver.findElement(By.xpath("(//i[@class = 'oxd-icon bi-trash'])[3]")).click();

            Thread.sleep(5000);

            driver.quit();
        }
    }

