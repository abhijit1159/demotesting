package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinalProject {

    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","drivers/msedgedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url=" http://tutorialsninja.com/demo/ ";
        driver.get(url); //site url
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='My Account']")).click();

String page_source=driver.getPageSource();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
String login =driver.findElement(By.xpath("//strong[text()='I am a returning customer']")).getText();

       if (login.equals("I am a returning customer"))
        {
            System.out.println("login page verified");
        }
        else {
            System.out.println("page not found");
        }


        String id_email="input-email";
        String id_password="input-password";
        String xpath_login_button="//input[@class='btn btn-primary']";
        driver.findElement(By.id(id_email)).sendKeys("sallu4131@gmail.com");
        driver.findElement(By.id(id_password)).sendKeys("Salman@4131");
        driver.findElement(By.xpath(xpath_login_button)).click();
       String login_check=driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
       if(login_check.equals("My Account"))
       {
           System.out.println("login successfull");
       }
       else
       {
           System.out.println("login failed");
       }

        WebElement Laptop_Notebook=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));

WebElement showall_laptop= driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Long.parseLong("10"),TimeUnit.SECONDS);

        actions.moveToElement(Laptop_Notebook).moveToElement(showall_laptop).click(showall_laptop).build().perform();
String HP = driver.findElement(By.xpath("//a[text()='HP LP3065']")).getText();

if (HP.equals("HP LP3065"))
{
driver.findElement(By.xpath("//button[@onclick=\"cart.add('47', '1');\"]")).click();

}

else
{
    System.out.println("product  HP not found");
}


driver.findElement(By.xpath("//button[@id='button-cart']")).click();

String Success =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
if (Success.contains(" HP LP3065"))
{
    System.out.println("product  HP LP3065 added to cart" );
}

/*String MacBook=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
if (MacBook.equals(MacBook))
{
    driver.findElement(By.xpath("//button[@onclick=\"cart.add('43', '1');\"]")).click();
}

else
{
    System.out.println("product mackbook not found");
}*/


    //hp button //button[@onclick="cart.add('47', '1');"]





        String pagecode=driver.getPageSource();
        System.out.println(pagecode);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.close();
    }
}
