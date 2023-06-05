package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wait {


    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String url = "https://www.amazon.in/s?k=tv&crid=1P8Y0VSO0MGF8&sprefix=t%2Caps%2C301&ref=nb_sb_noss_2";
      driver.get(url);
    String Brands = driver.findElement(By.xpath("//div[@id='brandsRefinements']")).getText();
        System.out.println("return" +Brands);

      List<WebElement> els = driver.findElements(By.xpath("//div[@id='brandsRefinements']"));

        for ( WebElement e: els
             ) {
            if (!e.isSelected() )
            {
             e.click();
            }
        }
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
