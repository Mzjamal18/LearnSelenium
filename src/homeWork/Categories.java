package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Categories {
    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target Categories functionality should work properly;
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
     * Scenario 1: In target homepage, categories drop down menu should work.
     */

    @Test
    public static void dropDownMenuClickable() throws InterruptedException {

//        user should be able to click on categories in target homePage
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__PrimaryLinkHeaderCategoriesLinkContainer-sc-17dxxwu-8.gfjhOG > a")).click();

        // Verify successful login
        String expectedText = "All Categories";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-3\"]/div[1]/div/div/div[1]/span/h3")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Categories drop down menu doesn't open");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 : As a target user, user should be able to click "Explore all" in Categories
     */

    @Test
    public static void exploreAllClickable() throws InterruptedException {

        Thread.sleep(3000);
//        user should be able to click on categories in target homePage
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).click();

        Thread.sleep(5000);
//        user should be able to click on "Clothing and Accessories Deals " in target homePage
        driver.findElement(By.xpath("//*[@id=\"overlay-366\"]/div[1]/div/div/a[2]/div/span")).click();


        Thread.sleep(2000);
//        user should be able to click on "Explore All" in target homePage
        driver.findElement(By.className("BaseButton-sc-3v3oog-0 ButtonPrimary-sc-9wgfzx-0 gcGvjK hcoLgH h-display-flex")).click();

        // Verify successful login
        String expectedText = "Clothing, Shoes & Accessories";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.className("Heading__StyledHeading-sc-1mp23s9-0 kmgmYA")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Categories drop down menu doesn't open");
        Thread.sleep(3000);
        driver.close();

    }
}