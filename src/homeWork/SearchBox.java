package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBox {

    static WebDriver driver;
    static String actualText;

    /**
     * Test Case: Target search box functionality should work properly;
     */
    @BeforeTest
    public static void SetUp() {
        String driverPath = "../LearnSelenium/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

//        To open browse
         driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
    }



    /**
     * Scenario 1: Search box should be type able with valid product name
     */

    @Test
    public static void searchBoxTypeAble() throws InterruptedException {

//        Target user should be able to type on searchBox
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Mask");



        //         Verify successful login
        String expectedText = "Mask";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.className("styles__SearchInput-sc-17dxxwu-13 gbZEQs")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "Sign In page doesn't navigate to home page");
        Thread.sleep(3000);
        driver.close();
    }

    /**
     * Scenario 2 : Search box should be clickable
     */

    @Test
    public static void SearchBoxClickable() throws InterruptedException {

//        user should be able to click on searchBox
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Mask");

//        User able to click on faceMusk
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button")).click();

//        User able to click on searchBox
        driver.findElement(By.xpath("//*[@id=\"typeahead\"]/li[3]/div/a")).click();


//         Verify successful login
        String expectedText = "Popular Filters";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.cssSelector("#pageBodyContainer > div:nth-child(1) > div > div:nth-child(4) > div > div.styles__StyledRow-sc-1nuqtm0-0.goXowJ > div.styles__StyledCol-sc-ct8kx6-0.kakpde > div > div.styles__FacetsStyledContainer-sc-y0hm-0.iHGdCe.h-margin-b-default > div.h-margin-b-tight > h3")).getText();
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text :" + expectedText);
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expectedText, "Search button isn't work properly");
        Thread.sleep(3000);
        driver.close();

    }


}
