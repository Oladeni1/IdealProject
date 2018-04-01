package com.SimpleTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 11/03/2017.
 */
public class SimpleTest {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://maven.apache.org/");



    }
}
