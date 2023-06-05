package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Snapdeal {

    public static void main(String[] args) {

        System.setProperty("web.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://www.snapdeal.com";

        driver.get(url);
        Actions actions = new Actions(driver);


        WebElement user_login = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
        WebElement click_login = driver.findElement(By.xpath("//a[normalize-space()='login']"));

        Action click_user_login = actions.moveToElement(user_login).click(click_login).build();
        click_user_login.perform();




        String loginframe="loginIframe";
        driver.switchTo().frame(loginframe);

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhijitjadav619@gmail.com");
       driver.findElement(By.xpath("//button[@id='checkUser']")).click();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//button[@id='loginUsingOtp']")).click();

        driver.switchTo().defaultContent();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





        driver.findElement(By.id("inputValEnter")).sendKeys("dell laptop");
        driver.findElement(By.className("searchTextSpan")).click();

        List<WebElement> search_result = driver.findElements(By.className("product-title"));
    int count=0;
        for ( WebElement sr: search_result)
        {

            String Names= sr.getAttribute("title");
            if (Names.contains("KALARKARI Laptop"))
            {
                sr.click();
            }
        }//for loop execution stops

    String MainWindow= driver.getWindowHandle();
        List<String>windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(0));
        String window_title= driver.getTitle();
        if (window_title.contains("Buy KALARKARI")) // validation for product page clicked
        {
            System.out.println("Switched to new tab & product page verified");
        }
else
        {
            System.out.println("page not found");
        }


    }
}
