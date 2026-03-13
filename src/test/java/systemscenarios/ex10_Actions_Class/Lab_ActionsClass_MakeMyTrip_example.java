package systemscenarios.ex10_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import systemscenarios.CommonToAll;
import systemscenarios.WaitHelpers;

import java.util.List;

public class Lab_ActionsClass_MakeMyTrip_example extends CommonToAll {
    @Test
    public void test_makemytrip_flights()
    {
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://www.makemytrip.com/");

        WaitHelpers.checkVisibility(driver, By.xpath("//span[@data-cy='closeModal']"), 5);

        WebElement signup_model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        signup_model.click();

        WaitHelpers.checkVisibility(driver, By.xpath("//img[@alt='minimize']"), 5);

        WebElement aibot = driver.findElement(By.xpath("//img[@alt='minimize']"));
        aibot.click();

        //just to remove the transparent layer

        WebElement background_element = driver.findElement(By.tagName("body"));
        background_element.click();

        WaitHelpers.waitJVM(3000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));

        WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().build().perform();

        WaitHelpers.waitJVM(2000);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        WaitHelpers.waitJVM(3000);

        try {
            List<WebElement> list_auto_complete_dropdown = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
            for (WebElement suggestion : list_auto_complete_dropdown)
            {
                if(suggestion.getText().contains("Chandigarh"))
                {
                    suggestion.click();
                }

            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        actions.moveToElement(toCity).click().sendKeys("DEL").build().perform();

        WaitHelpers.waitJVM(3000);

        try {
            List<WebElement> list_auto_complete_dropdown = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
            for (WebElement suggestion : list_auto_complete_dropdown)
            {
                if(suggestion.getText().contains("Del"))
                {
                    suggestion.click();
                }

            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
