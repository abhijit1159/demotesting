package DemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethods {

    public static void main(String[] args) {
        String s = System.setProperty("web.chrome.driver", "drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://google.com");
    driver.navigate().to("https://gmail.com");
    driver.navigate().back();
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("ijcrta.org");
    driver.navigate().refresh();


    }





}
