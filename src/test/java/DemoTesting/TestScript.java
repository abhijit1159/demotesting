package DemoTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        String title =driver.getTitle();
        String url=driver.getCurrentUrl();
      String source=  driver.getPageSource();

        System.out.println("url of page" +url);
        System.out.println("source of page" +source);
        System.out.println("url of page " +driver.getCurrentUrl());

        if (source.contains("this.gbar_"))
        {
            System.out.println("text matched");
        }
        else {
            System.out.println("error");
        }

        driver.quit();
    }
}
