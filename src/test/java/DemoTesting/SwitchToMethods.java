package DemoTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SwitchToMethods {

    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://demo.automationtesting.in/Alerts.html";
        driver.get(url);

       driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
     driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().dismiss();

    }
}
