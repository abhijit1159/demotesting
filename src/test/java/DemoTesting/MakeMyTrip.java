package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","drivers/msedgedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();


  }
}

