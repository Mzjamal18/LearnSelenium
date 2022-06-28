package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Deals {
    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target "Deals" button should work properly
     */
    @BeforeTest
    public static void SetUp() throws InterruptedException {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
        driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    /**
     * Scenario 1:  In target home page, "Deals" button should clickable
     */

    @Test
    public static void topDealsButton() throws InterruptedException {
//        User should be able to click on Dealsgit
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__PrimaryHeaderDealsLinkContainer-sc-17dxxwu-9.fzcojK > a")).click();
Thread.sleep(6000);
//        User cam click top deals
        driver.findElement(By.cssSelector("#overlay-3157 > ul > li:nth-child(1) > a > div > span")).click();

        // Verification successfully work
//        String expectedText = "Top Deals";
//        Thread.sleep(3000);
//        String actualText = driver.findElement(By.xpath("/html/body/div[7]/div/div/ul/li[1]/a/div/span")).getText();
//        Thread.sleep(2000);
//        System.out.println("Actual Text : " + actualText);
//        Thread.sleep(2000);
//        System.out.println("Expected Text :" + expectedText);
//        Thread.sleep(3000);
//        Assert.assertEquals(actualText, expectedText, "Categories drop down menu doesn't open");
//        Thread.sleep(3000);
//        driver.close();

    }

    /**
     * Scenario 2 : Order pickup search box should work properly
     */

    @Test
    public static void lookUp() throws InterruptedException {
//        user should be able to click on "Pickup & Delivery" in target homePage
        driver.findElement(By.className("styles__PrimaryHeaderLink-sc-17dxxwu-4 styles__SpacedPrimaryHeaderLink-sc-17dxxwu-6 kBMAuO jnZOWp h-hidden-md-down")).click();

//        user should be able to click on "Order pickup" in target homePage
        driver.findElement(By.className("CellSkinny__TextWrapper-sc-117d15w-0 bcbdds")).click();

//        user should be able to type on order pickup searchbar in target homePage
        driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[1]/div[2]/div[1]/form/input")).sendKeys("Mask");


        // Verification successfully work
//        String expectedText = "Clothing, Shoes & Accessories";
//        Thread.sleep(3000);
//        String actualText = driver.findElement(By.className("Heading__StyledHeading-sc-1mp23s9-0 kmgmYA")).getText();
//        System.out.println("Actual Text : " + actualText);
//        System.out.println("Expected Text :" + expectedText);
//        Thread.sleep(3000);
//        Assert.assertEquals(actualText, expectedText, "Categories drop down menu doesn't open");
//        Thread.sleep(3000);
//        driver.close();
    }
}
