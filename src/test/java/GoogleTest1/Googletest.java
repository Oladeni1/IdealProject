package GoogleTest1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by user on 13/03/2017.
 */

class GoogleTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://maven.apache.org/");

        //Chrome driver is the class implementing the webdriver interface
        //WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        String actual= driver.getTitle(); // From the webpage during run time by selenium

        String expected = "Google";//From manual Testcase

        if(actual.equals(expected))
        {
            System.out.println("Verify Title testcase is passed");
        }
        else
        {
            System.out.println("Verify title testcase is failed.");
        }

    }
}

