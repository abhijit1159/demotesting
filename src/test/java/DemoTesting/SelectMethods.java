package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMethods {

    public static void main(String[] args) {
        System.setProperty("web.chorme.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
        driver.get(url);

      WebElement element =driver.findElement(By.xpath("//select[1]"));
      Select select = new Select(element);
      List< WebElement > options= select.getOptions();

        for ( WebElement e: options
             ) {
            System.out.println(e.getText());
        }
WebElement firstoption =select.getFirstSelectedOption();


select.selectByIndex(2);


    }
}









