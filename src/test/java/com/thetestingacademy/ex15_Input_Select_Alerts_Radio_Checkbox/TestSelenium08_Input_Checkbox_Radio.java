package com.thetestingacademy.ex15_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium08_Input_Checkbox_Radio {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();


    }
}
