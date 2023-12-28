package DevTool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.emulation.Emulation;

import java.util.HashMap;
import java.util.Optional;

public class GeoLocationTest {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

       // devTools.send(Emulation.setGeolocationOverride(Optional.of(40),Optional.of(3),Optional.of(1)));

        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("latitude",40);
        map.put("longitude",3);
        map.put("accuracy",1);

        driver.executeCdpCommand("Emulation.setGeolocationOverride",map);

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Netflix", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
        String title = driver.findElement(By.cssSelector(".e9eyrqp5 h1")).getText();
        System.out.println("Title: "+title);

    }
}
