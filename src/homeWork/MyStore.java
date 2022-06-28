package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyStore {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Home page functionality should work properly;
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    /**
     * Scenario 1:  In target home page, "My store" should work properly
     */

    @Test
    public static void myStoreButton() throws InterruptedException {

//        User should be able to click on my store
        driver.findElement(By.xpath("//*[@id=\"web-store-id-msg-btn\"]/div[1]/span[1]")).click();

        //               Verify successfully work"
        String expectedText = "Use my current location";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[1]/div/div[2]/div/div/button/span[2]")).getText();
       Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "My store button doesn't work");
        Thread.sleep(3000);
        driver.close();

    }

    /**
     * Scenario 2 : In target home page, "lookUp" button should work properly
     */

    @Test
    public static void lookUp() throws InterruptedException {

//        user able to click on  My store
        driver.findElement (By.xpath("//*[@id=\"web-store-id-msg-btn\"]/div[1]/span[1]")).click();
Thread.sleep(2000);

// user able to type on zipcode box
        driver.findElement(By.xpath("//*[@id=\"zip-or-city-state\"]")).sendKeys("30046");
        Thread.sleep(5000);

//        User able to click on Lookup
        driver.findElement(By.className("BaseButton-sc-3v3oog-0 ButtonPrimary-sc-9wgfzx-0 xuSzc hcoLgH h-padding-h-wide h-padding-v-tight")).click();


        //               Verify successfully work
//        String expectedText = "Select a store";
//        Thread.sleep(3000);
//        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[1]/div/div[1]/h2")).getText();
//        System.out.println("Actual Text : " + actualText);
//        System.out.println("Expected Text :" + expectedText);
//        Thread.sleep(4000);
//        Assert.assertEquals(actualText, expectedText, "Lookup button doesn't work");
//        Thread.sleep(3000);
//        driver.close();

    }



}
