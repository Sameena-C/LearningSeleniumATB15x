package systemscenarios.ex08_SVG_Elements;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import systemscenarios.CommonToAll;
import systemscenarios.WaitHelpers;

import java.util.List;

public class Selenium_SVG1_Project_Flipkart extends CommonToAll {

    @Owner("Sameena")
    @Description("")
    @Test
    public void test_cheap_macmini(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search?q=Apple%20mac%20mini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

//        WebElement search_input = driver.findElement(By.name("q"));
//        search_input.sendKeys("Apple mac mini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        waitJVM(5000);

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, 'MP')]/div/a[2]"));
        System.out.println(titleResults.size());

        for(WebElement title : titleResults)
        {
            String Title1 = title.getText();
            System.out.println(Title1);
        }


        List<WebElement> priceResults = driver.findElements(By.xpath("//div[@class='hZ3P6w']"));
        System.out.println(priceResults.size());

        int min_price = Integer.MAX_VALUE;
        for (WebElement price : priceResults) {
           String Price1 = price.getText();

           Price1 = Price1.replace("₹", "").replace(",", "");
           System.out.println("Prices are: " + Price1);

           int Price2 = Integer.parseInt(Price1);
           if (Price2 < min_price) {
                    min_price = Price2;
                }
            }
            System.out.println("Mac mini with cheapest price: " + min_price);

/*
        WaitHelpers.checkVisibility(driver, By.xpath("//div[contains(@data-id, 'CPU')]/div/a[2]"));

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, 'MP')]/div/a[2]"));
        System.out.println(titleResults.size());


        for(WebElement title : titleResults)
        {
                String Title1 = title.getText();
                System.out.println(Title1);
        }

        waitJVM(5000);
        closeBrowser(driver);

 */
    }
}
