package com.java_hero.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogle {
    private WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.out.println("OpenGoogle.openBrowser");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void openGoogleMainPage(){
        System.out.println("OpenGoogle.openGoogleMainPage");
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("OpenGoogle.closeBrowser");
        driver.quit();
    }
}
