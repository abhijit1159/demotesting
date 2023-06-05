package DemoTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Flipkart {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.in";

        driver.get(url);

        WebElement singup_button=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
       WebElement sign_in_button=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
        Actions actions = new Actions(driver);
        Action signup=actions.moveToElement(singup_button).click(sign_in_button).build();
        signup.perform();

        //validating signIn page
      String signin_title=  driver.getTitle();
      if (signin_title.equals("Amazon Sign In"))
      {
          System.out.println("Sign In page verified ");
      }

      else
      {
          System.out.println("sign in page not found");
      }


    WebElement signin_id=driver.findElement(By.id("ap_email"));
      Action singin=actions.click(signin_id).sendKeys(signin_id,"sallu4131@gmail.com").sendKeys(Keys.ENTER).build();
      singin.perform();

      WebElement Password=driver.findElement(By.id("ap_password"));
      Action enter_password=actions.click(Password).sendKeys(Password,"SalmanS4131").sendKeys(Keys.ENTER).build();
      enter_password.perform();

//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    String username=    driver.findElement(By.xpath("//span[contains(.,'Hello, Salman')]")).getText();
       if (username.contains("Hello, Salman"))
       {
           System.out.println("login successful");
       }
else
{
    System.out.println("login failed");
}


    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell latop");

    driver.findElement(By.id("nav-search-submit-button")).click();

List<WebElement >result = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal' and contains(text(),'Dell')]"));
        for ( WebElement r : result
             )
        {

        String Names = r.getText();


        if (Names.equals("Dell Inspiron 3520 Laptop,12th Gen Intel Core i5-1235U, Windows 11 + MSO'21, 8GB, 1TB HDD + 256GB SSD, 15.6\" (39.62Cms) FHD WVA AG 120Hz 250 nits, 15 Month McAfee, Black, 1.65Kgs"))
            {
                r.click();
            }

        }

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        String parent = driver.getWindowHandle();
        List<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

// Inside the tab window

        List <WebElement> addtoCartButton = driver.findElements(By.id("add-to-cart-button"));
        if (addtoCartButton.size() == 1 ) {

            driver.findElement(By.id("add-to-cart-button")).click();
        }
// do something
else {
            System.out.println("Failed to to add product in cart ");
            }


// do whatever you want in the new tab and if you want to switch back then:

        //    driver.switchTo().window(parent);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String Success_message=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
        if (Success_message.equals("Added to Cart"))
        {
            System.out.println("product added to cart successfully");
        }

        else
        {
            System.out.println("add to cart failed");
        }


        driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();

    }


        }







