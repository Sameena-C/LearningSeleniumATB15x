package systemscenarios.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium04_WebDriverHierarchy {
    public static void main(String[] args) {
        // WebDriver Hierarchy
        // SearchContext(I) -> (2) -> WebDriver(I) (~10) -> RemoteWebDriver(C) (~15)
        // -> ChromiumDriver(C) ~25 -> EdgeDriver(C) (~45)

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        //SearchContext driver = new SearchContext(); //cannot create an object of Interface
        //SearchContext driver = new WebDriver(); //cannot create an object of Interface
       // SearchContext driver = new RemoteWebDriver(); //not possible

//        SearchContext driver = new ChromeDriver(); //Possible
//        SearchContext driver = new FirefoxDriver(); //Possible
//        SearchContext driver = new EdgeDriver(); //Possible
//
//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//        ChromeDriver driver2 = new ChromeDriver();

        //Scenarios
        // 1. Do you want to run TC only in Chrome or Edge?
        ChromeDriver driver2 = new ChromeDriver();
        //driver2 = new FirefoxDriver();

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver(); // 97% -
        driver = new FirefoxDriver(); // 97% -
        driver = new SafariDriver(); // 97% -


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


    }

}
