package systemscenarios.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
       // uploadFileInput.sendKeys("C:\\Users\\samee\\IdeaProjects\\LearningSeleniumATB15x\\src\\test\\java\\systemscenarios\\ex11_File_Upload\\data.json");
        String user_dir_path = System.getProperty("user.dir");
        System.out.println(user_dir_path);
        uploadFileInput.sendKeys(user_dir_path + "/src/test/java/systemscenarios/ex11_File_Upload/data.json");


        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
    }
}
