package com.thetestingacademy.ex04_Selenium_CloseVsQuit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestQuitBrowser {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


//        Thread.sleep(5000);
//        driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null


        Thread.sleep(5000);

        driver.quit();
        // It will close all the tabs. - session id == null


    }
}

