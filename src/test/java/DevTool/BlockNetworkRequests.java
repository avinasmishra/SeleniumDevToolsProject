package DevTool;

import com.google.common.collect.ImmutableList;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;

import java.util.Optional;

public class BlockNetworkRequests {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        //whenever we use Network first we enable method/domain
        //Here - if we want to not display images/css in your UI because its not required and won't increase the time for execute
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));

        long startTime = System.currentTimeMillis();
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.linkText("Browse Products")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.cssSelector("button.add-to-cart")).click();
        System.out.println(driver.findElement(By.cssSelector("p.sp")).getText());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
