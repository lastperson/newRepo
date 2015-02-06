package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Oleksii on 2/4/2015.
 */
public class TestHelper {
    public static WebDriver driver;

    public static WebElement findElement(String xPath) {
        return null;
    }

    public static void assertValue(String xPath, String expectedValue) {

    }

    public static void init() {
        System.setProperty("webdriver.chrome.driver",
                "C:/MyWork/AUT5/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void fancyCleanUp() {
        driver.quit();
    }
}
