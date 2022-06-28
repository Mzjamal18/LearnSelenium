package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetCircle {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target circle functionality should work properly;
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
     * Scenario 1:  In target home page, "Target Circle" should click properly
     */

    @Test
    public static void circleClickable() throws InterruptedException {

//        User should be able to click on "Target circle"

        driver.findElement(By.xpath("//*[@id=\"utilityNav-circle\"]")).click();

//         Verify Target circle successfully clickable
        String expectedText = "Let's get started";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.cssSelector("#__next > section.styles__CallToActionContainer-sc-oyghmr-1.cLuZQf > h2")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "Target circle doesn't open");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 : In target circle, "Offer" button should work properly
     */

    @Test
    public static void clickable() throws InterruptedException {

//        In target homepage, user should be able to click on "Target circle"

        driver.findElement(By.xpath("//*[@id=\"utilityNav-circle\"]")).click();
        Thread.sleep(3000);

//        InTarget Circle, user should be able to click on "Offer"
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/a[2]")).click();


//            Verify Offer button successfully clickable
        String expectedText = "Unlock offers tailored to you";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.cssSelector("#__next > div.styles__FeaturedOffersWrapper-sc-tzmqk3-0.grEqvu > div > div.styles__Overlay-sc-1n9os68-0.eBihNy > div > span")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "Offer page doesn't open");
        Thread.sleep(3000);
        driver.close();
    }

    }

