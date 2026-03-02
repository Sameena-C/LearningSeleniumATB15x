package systemscenarios.ex04_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject_TTA_Bank {
    @Owner("Sameena")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Create account on TTK Bank website, Transfer - 5000, Comeback to dashboard - $45,000.00  ")
    @Test
    public void create_account() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signup.click();

        // Creating account on TTK Bank website
        WebElement fullname = driver.findElement(By.xpath("//input[@type='text']"));
        fullname.sendKeys("Sameena C");

        WebElement email_address = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
        email_address.sendKeys("sam@ttkbank.com");

        WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        password.sendKeys("$am123");

        WebElement create_acc = driver.findElement(By.xpath("//button[text()='Create Account']"));
        create_acc.click();

        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.xpath("//span[@class='text-2xl font-bold tracking-tight']"));
        System.out.println(logo.getText());
        Assert.assertEquals(logo.getText(), "TTA Bank");

        WebElement trans_fund = driver.findElement(By.xpath("//button[text()='Transfer Funds']"));
        trans_fund.click();

        Thread.sleep(2000);

        //Transferring 5000 as Rent

        WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
        amount.sendKeys("5000");

        WebElement note = driver.findElement(By.xpath("//input[@type='text']"));
        note.sendKeys("Rent");

        WebElement cont = driver.findElement(By.xpath("//button[text()='Continue']"));
        cont.click();

        Thread.sleep(2000);

        WebElement cnfrm_trans = driver.findElement(By.xpath("//button[text()='Confirm Transfer']"));
        cnfrm_trans.click();

        Thread.sleep(2000);

        WebElement dashbrd = driver.findElement(By.xpath("//button[text()='Dashboard']"));
        dashbrd.click();

        WebElement total_bal = driver.findElement(By.xpath("//h3"));
        System.out.println(total_bal.getText());

        //Verifying the Total Balance
        Assert.assertEquals(total_bal.getText(), "$45,000.00");

        Thread.sleep(2000);

        //Quit
        driver.quit();
    }
}
