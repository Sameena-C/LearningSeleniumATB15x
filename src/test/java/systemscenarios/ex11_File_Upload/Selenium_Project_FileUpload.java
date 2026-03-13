package systemscenarios.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import systemscenarios.WaitHelpers;

public class Selenium_Project_FileUpload {
    @Test
    public void test_fileupload()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("D:\\sameena cv\\Sameena_9.3YOE_Manual+AutomationTesting.pdf");

        WaitHelpers.waitJVM(5000);
        driver.quit();
    }
}
