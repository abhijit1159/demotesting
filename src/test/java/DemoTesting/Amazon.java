package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://flipkart.com");

     //   driver.findElement(By.className("_1_3w1N")).click();


        Actions actions = new Actions(driver);
        WebElement login_button=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        Action click_login_button=actions.moveToElement(login_button).click(login_button).sendKeys(login_button,"abhijitjadhav619@gmail.com").sendKeys(Keys.ENTER).build();
        click_login_button.perform();


WebElement search_box=driver.findElement(By.name("q"));
//actions.moveToElement(search_box).click(search_box).sendKeys(search_box,"dell laptop").sendKeys(Keys.ENTER).build();
//Action search_box_product=actions.moveToElement(search_box).click(search_box).sendKeys(search_box,"dell laptop").sendKeys(Keys.ENTER).build();
//search_box_product.perform();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
List<WebElement> product_search=driver.findElements(By.xpath("//a[contains(@class,'_1fQZEK')]"));


        for ( WebElement sr : product_search)
        {
         String tag =sr.getAttribute("href");
            if (tag.contains("dell-core-i3"))
            {
                sr.click();
            }

        } // for loop execution stops



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String parent = driver.getWindowHandle();
        List<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        String title =driver.getTitle();
        System.out.println(title);
//            driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();

    }

    }


