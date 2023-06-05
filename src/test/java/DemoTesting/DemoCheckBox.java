package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoCheckBox {

    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://mslk.com/reactions/great-fake-ecommerce-website/";

        driver.get(url);
        List<WebElement>checkbox=driver.findElements(By.xpath("//input[@class='gfield-choice-input']"));
        for (WebElement cbox:checkbox )
        {
            String choice= cbox.getAttribute("name");
            System.out.println(choice);
            if (choice.equals("input_9.1") || choice.equals("input_9.4"))
            {
                cbox.click();
            }

        }
    }
}
