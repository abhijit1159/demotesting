package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {

    public static void main(String[] args) {

        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://tutorialsninja.com/demo/index.php?route=account/register";
        driver.manage().window().maximize();
        driver.get(url);

        String id_FirstName = "input-firstname";
        String id_LastName = "input-lastname";
        String id_Email = "input-email";
        String id_Telephone = "input-telephone";
        String id_Password = "input-password";
        String id_ConfirmPwd = "input-confirm";
        String xpath_Newsletter = "(//input[@name='newsletter'])[1]";
        String name_Agree = "agree";
        String xpath_Continue = "//input[@value='Continue']";
        String xpath_Text = "//div[@id='content']//p";

     driver.findElement(By.id(id_FirstName)).sendKeys("sharukh");
     driver.findElement(By.id(id_LastName)).sendKeys("khan");
     driver.findElement(By.id(id_Email)).sendKeys("sharukh@gmail.com");
     driver.findElement(By.id(id_Telephone)).sendKeys("78678678666");
     driver.findElement(By.id(id_Password)).sendKeys("Sharukh@123");
     driver.findElement(By.id(id_ConfirmPwd)).sendKeys("Sharukh@123");
     driver.findElement(By.xpath(xpath_Newsletter)).click();
     driver.findElement(By.name(name_Agree)).click();
     driver.findElement(By.xpath(xpath_Continue)).click();

    }
}
