package DevTool;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.net.URI;
import java.util.List;
import java.util.function.Predicate;


public class ConsoleLogCapture {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularAppdemo");
        driver.findElement(By.linkText("Browse Products")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.cssSelector("button.add-to-cart")).click();
        driver.findElement(By.linkText("Cart")).click();
        driver.findElement(By.id("exampleInputEmail1")).clear();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");

        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> log = entry.getAll();
        for(LogEntry l:log)
        {
            System.out.println(l.getMessage());
        }


    }
}
