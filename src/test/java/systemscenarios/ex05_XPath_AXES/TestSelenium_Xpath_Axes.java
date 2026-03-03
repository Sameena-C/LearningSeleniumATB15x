package systemscenarios.ex05_XPath_AXES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestSelenium_Xpath_Axes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        driver.manage().window().maximize();

        WebElement self = driver.findElement(By.xpath("//div[@class='Mammal']"));
        System.out.println(self.getText());

        System.out.println("-------------------------------");

        WebElement ancestor = driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::div"));
        System.out.println(ancestor.getText());
        System.out.println("-------------------------------");

        List<WebElement> following_sibling = driver.findElements(By.xpath("//div[@class='Mammal']/following-sibling::div"));
        System.out.println(following_sibling.size());
        System.out.println(following_sibling.get(0).getText());
        System.out.println("-------------------------------");

        List<WebElement> preceding_sibling = driver.findElements(By.xpath("//div[@class='Mammal']/preceding-sibling::div"));
        System.out.println(preceding_sibling.size());
        System.out.println(preceding_sibling.get(0).getText());

        System.out.println("-------------------------------");
        WebElement parent = driver.findElement(By.xpath("//div[@class='Mammal']/parent::div"));
        System.out.println(parent.getText());

        System.out.println("-------------------------------");

        WebElement child = driver.findElement(By.xpath("//div[@class='Mammal']/child::div"));
        System.out.println(child.getText());

        driver.quit();

    }
}
