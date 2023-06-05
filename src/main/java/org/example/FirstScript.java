package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://gmail.com");

        String title=driver.getTitle();
        if (title.equals("Gmail"))
        {
            System.out.println("Expected title is Gmail");

        }
        else
        {
            System.out.println("Actual title is  " +title);
        }
    }

}
