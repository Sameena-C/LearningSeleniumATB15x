package systemscenarios.ex12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lab_Windows_Part1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);

        WebElement link_parent = driver.findElement(By.xpath("//a[.='Click Here']"));
        link_parent.click();

        Set<String> window_handle_ids = driver.getWindowHandles();

        for (String window : window_handle_ids)
        {
            System.out.println(window);
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window"))
            {
                System.out.println("Test Passed!!");
            }
        }

        // In the end, I am switching back to parent
        driver.switchTo().window(parent_id);



    }
}
