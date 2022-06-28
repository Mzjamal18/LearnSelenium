package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PickupAndDelivery {
    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target "pickup and delivery" button should work properly
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }

    /**
     * Scenario 1:  In target home page, "Pickup & Delivery" button should clickable
     */

    @Test
    public static void pickUpButton() throws InterruptedException {

//        In Target home page, pickup & delivery button should be clickable

        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[5]/a")).click();


        //         Verify successful click on "Pickup & Delivery"
        String expectedText ="Order Pickup";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-12\"]/ul/li[1]/a/div/span")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "Pickup & delivery button doesn't work properly");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 : Order pickup search box should work properly
     */

    @Test
    public static void lookUp() throws InterruptedException {
//        user should be able to click on "Pickup & Delivery" in target homePage
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[5]/a")).click();

        Thread.sleep(5000);
//        user should be able to click on "Order pickup" in target homePage
        driver.findElement(By.xpath("//*[@id=\"overlay-2448\"]/ul/li[1]/a/div")).click();

        Thread.sleep(2000);
//        user should be able to type on order pickup searchbar in target homePage
        driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[1]/div[2]/div[1]/form/input")).sendKeys("Mask");


        //         Verify successful click on "Pickup & Delivery"
        String expectedText ="mask";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[1]/div[2]/div[1]/form/input")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "Order pickup search button doesn't work");
        Thread.sleep(3000);
        driver.close();
    }

}
