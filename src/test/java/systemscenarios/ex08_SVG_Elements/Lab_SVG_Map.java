package systemscenarios.ex08_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import systemscenarios.WaitHelpers;

import java.util.List;

public class Lab_SVG_Map {
    @Description("Find Tripura on the Map and click on it")
    @Test
    public void verifyStatesInSVG()
    {
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitJVM(3000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state : states)
        {
            System.out.println(state.getDomAttribute("aria-label"));
            // state.getAttribute("") // Deprecated
            if(state.getDomAttribute("aria-label").contains("Tripura"))
            {
                state.click();
            }
        }

        waitHelpers.waitJVM(5000);
        driver.quit();

    }
}
