package DemoTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class MouseClick {


    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://flipkart.com");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.name("q")).sendKeys("samsung");
WebElement button=  driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
Actions act = new Actions(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
act.moveToElement(button).click(button).sendKeys(button, "samsung").doubleClick(button).contextClick(button).build().perform();


    }
}