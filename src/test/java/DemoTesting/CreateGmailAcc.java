package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmailAcc  {

    public void SignUp( String fristName, String lastName)
    {  WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com&dsh=S-1911912228%3A1682015573768878&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&authuser=0");
        driver.findElement(By.id("firstName")).sendKeys("");
        driver.findElement(By.id("lastName")).sendKeys("");
    /*    driver.findElement(By.id("username")).sendKeys("rkoorton344");
        driver.findElement(By.name("Passwd")).sendKeys("Randy@255");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Randy@255");
 /*     if(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).isEnabled());
        {
            driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
*/

    }
    }

