package DevTool;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.emulation.Emulation;

import java.util.HashMap;
import java.util.Optional;

public class MobileEmulationTest {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Avinash/SeleniumTraining/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        //First Way
        devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty()));

/*
        //Second Way- Here we direct use executeCdpCommand() method- in the map we only pass required parameters
        HashMap<String, Object> map = new HashMap<String,Object>();
        map.put("width",600);
        map.put("height",1000);
        map.put("deviceScaleFactor",50);
        map.put("mobile",true);

        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",map);
*/

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.manage().window().maximize();
        driver.findElement(By.className("navbar-toggler-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Library")).click();


    }
}
