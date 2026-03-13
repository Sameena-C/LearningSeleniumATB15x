package systemscenarios.ex08_SVG_Elements;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import systemscenarios.CommonToAll;
import systemscenarios.WaitHelpers;

import java.util.List;

public class Selenium_SVG_Project_Flipkart extends CommonToAll {

    @Owner("Sameena")
    @Description("")
    @Test
    public void test_cheap_macmini(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search?q=macmini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

//        WebElement search_input = driver.findElement(By.name("q"));
//        search_input.sendKeys("macmini");
//
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

      //  clickElementFound("//div[text()='Price -- Low to High']");

        WaitHelpers.checkVisibility(driver, By.xpath("//div[contains(@data-id, 'CPU')]/div/a[2]"));

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, 'MP')]/div/a[2]"));
        System.out.println(titleResults.size());

        for(WebElement title : titleResults)
        {
            if(title.getText().contains("Apple Mac Mini")) {
                String Title1 = title.getText();
                System.out.println(Title1);
                List<WebElement> priceResults = driver.findElements(By.xpath("//div[@class='QiMO5r']/div[1]"));
                System.out.println(priceResults.size());
            }
        }

//        List<WebElement> priceResults = driver.findElements(By.xpath("//div[@class='QiMO5r']/div[1]"));
//        System.out.println(priceResults.size());
//
//        for (WebElement price : priceResults)
//        {
//            String Price1 = price.getText();
//            System.out.println(Price1);
//
//        }
//
//        System.out.println("Found " + titleResults.size() + " titles  |  "
//                + priceResults.size() + " prices");

        waitJVM(5000);
        closeBrowser(driver);
    }

}
