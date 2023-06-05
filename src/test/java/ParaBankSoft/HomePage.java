package ParaBankSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.setProperty("hello.iam . abhi", "drivers/chromedriver.exe");

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String title = driver.getTitle();
        if (title.equals("ParaBank | Welcome | Online Banking"))
        {
            System.out.println("Title Matched");

        } else
        {
            System.out.println("Title Not Matched");
        }

   driver.findElements(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[1]")).contains("Solutions");

    }
}
