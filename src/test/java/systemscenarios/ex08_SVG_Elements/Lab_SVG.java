package systemscenarios.ex08_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import systemscenarios.CommonToAll;
import systemscenarios.WaitHelpers;

import java.util.List;

public class Lab_SVG extends CommonToAll {
    ChromeDriver driver;
    @Description("Verify that the on search with svg icon results are visible.")
    @Test
    public void test_FlipKart_Search_SVG_Icon()
    {
        driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search");

        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        WaitHelpers.checkVisibility(driver, By.xpath("//div[contains(@data-id, 'CPU')]/div/a[2]"));

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, 'MP')]/div/a[2]"));
        for(WebElement title : titleResults)
        {
            System.out.println(title.getText());
        }
        WaitHelpers.waitJVM(5000);
        closeBrowser(driver);

    }

}
