package systemscenarios.ex12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lab_Windows_Part2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://app.vwo.com/#/login";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);

        WebElement link_parent = driver.findElement(By.xpath("//span[.='Start a FREE TRIAL']"));
        link_parent.click();

        Set<String> window_handle_ids = driver.getWindowHandles();

        for (String window : window_handle_ids)
        {
            System.out.println(window);
            driver.switchTo().window(window);
            // Whatever you want to verify in the child, now you can.
        }

        // In the end, I am switching back to parent
       // driver.switchTo().window(parent_id);



    }
}
