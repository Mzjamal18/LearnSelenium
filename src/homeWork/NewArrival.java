package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewArrival {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target New arrival functionality should work properly;
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    /**
     * Scenario 1:  In target what's new, men's new arrival button should be clickable
     */

    @Test
    public static void newArrivalButton() throws InterruptedException {

//        user able to click on new arrival button
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[4]/a")).click();

//               Verify successful click on "Pickup & Delivery"
        String expectedText = "Explore What's New";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-3038\"]/ul/li[1]/a/div/span")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "What's new button doesn't work");
        Thread.sleep(3000);
        driver.close();

    }

    /**
     * Scenario 2:  In target men's new arrival, filter button should be clickable
     */

    @Test
    public static void filterButton() {

        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[4]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"overlay-10\"]/ul/li[7]/a/div/span")).click();

    }


}
