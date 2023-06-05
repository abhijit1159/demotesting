package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioMethod {
    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.automationtesting.in/my-account/");


 String val= driver.findElement(By.xpath("//input[@name='email' and @id='reg_email']")).getAttribute("class");

        System.out.println("attrib= " +val);

    }
}