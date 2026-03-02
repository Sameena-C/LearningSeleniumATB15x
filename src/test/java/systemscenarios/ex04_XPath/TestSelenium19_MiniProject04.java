package systemscenarios.ex04_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium19_MiniProject04 {
    @Owner("Sameena")
    @Description("Verify login is working")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_CURA_Login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        make_appointment.click();

        driver.quit();


    }
}
