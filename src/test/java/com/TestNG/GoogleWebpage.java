package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 12/03/2017.
 */
public class GoogleWebpage {

    @Test
    public void verifyLogin() {
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.google.com");

            String actual = driver.getTitle();

            String expected = "Google";

            //Assert class available in the - org.testng.Assert helps in comparing actual against expected.

            //Note: Testng does not require a main method.

            //For Testng to understand the program, you need to specify the annotation which is - @Test

            // Then run the program as TestNG Test.

            Assert.assertEquals(actual, expected);
        }

    }
}
