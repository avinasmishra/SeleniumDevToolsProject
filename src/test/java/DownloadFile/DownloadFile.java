package DownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

public class DownloadFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avinash\\IdeaProjects\\Software\\chromedriver\\chromedriver.exe");

        String downoadFilePath = System.getProperty("user.dir");
        HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downoadFilePath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.learningcontainer.com/sample-pdf-files-for-testing/");
        //Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.wpdm-download-link")));
        driver.findElement(By.cssSelector("a.wpdm-download-link")).click();
        Thread.sleep(5000);
        File f = new File(downoadFilePath+"/sample-pdf-file.pdf");
        if(f.exists())
        {
            System.out.println("File Found");
            if(f.delete())
            {
                System.out.println("File Deleted");
            }

        }
        //driver.close();
    }
}
