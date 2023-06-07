package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {

    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Actions actions = new Actions(driver);
        WebElement profile_dropdown= driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        Action click_profile_dropdown =actions.moveToElement(profile_dropdown).click(profile_dropdown).build();
        click_profile_dropdown.perform();
String username_verification=       driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
// login verification
if (username_verification.equals("YINNtmylcA Collings"))
{
    System.out.println("username " +username_verification+ " verified & login successfull"  );
}
else
{
    System.out.println("username " +username_verification+" does not match login failed");

} // login verification ends



    }
}
