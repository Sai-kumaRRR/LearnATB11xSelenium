package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class TestSelenium10_DefaultMethod {


    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

//        driver.manage().window().maximize();
//        driver.manage().window().minimize();



        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        driver.quit();


    }
}


