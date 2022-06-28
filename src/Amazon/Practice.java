package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target cart functionality should work properly;
     */

    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    /**
     * Scenario 1:  In target home page, "cart" button should work properly.
     */

    @Test
    public static void cartButtonClickable() throws InterruptedException {

// As a target user, cart button should be clickable.
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
//        Thread.sleep(4000);

        // Verify successful login
//        String expectedText = "Your cart is empty";
//        Thread.sleep(2000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[1]/div/div/div[2]/h1")).getText();
//        System.out.println("Actual Text : " + actualText);
//        System.out.println("Expected Text :" + expectedText);
//
//        Thread.sleep(5000);
//        Assert.assertEquals(actualText, expectedText, "cart doesn't navigate to next page");
    }
}
