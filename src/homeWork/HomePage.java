package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {

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
        Thread.sleep(3000);
    }

    /**
     * Scenario 1:  In target home page, "Pickup & Delivery" drop down menu should work properly
     */

    @Test
    public static void weeklyAddClick() throws InterruptedException {

        //        In target homepage, user should be able to click on "Get the deal button"
                driver.findElement(By.xpath("//*[@id=\"utilityNav-weeklyAd\"]")).click();

        //               Verify successfully work"
        String expectedText = "Weekly Ads & Catalogs";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/section/div/div/div/section/div[1]/div[1]/h3")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(2000);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "My store button doesn't work");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 : In target home page, ""Get the deals" button should work properly
     */

    @Test
    public static void getTheDealButton() throws InterruptedException {


//        In target homepage, user should be able to click on "Get the deal button"
        driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[2]/div/div/div/div/a/div[2]/div/button/span")).click();


        //               Verify successfully work
        String expectedText = "Top Deals";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[1]/div/div[1]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(2000);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "Get the deal button doesn't work");
        Thread.sleep(3000);
        driver.close();
    }

}
