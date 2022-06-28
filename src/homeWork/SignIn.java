package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {

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
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    /**
     * Scenario 1:  In target home page, "SignIn" functionality should work properly
     */

    @Test
    public static void SignInWorking() throws InterruptedException {

//        User able to click on sign In button
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span")).click();
        Thread.sleep(2000);

//          User able to click on sign In.
        driver.findElement(By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span")).click();
        Thread.sleep(2000);

//        User should be able to type email.
        driver.findElement(By.cssSelector("#username")).sendKeys("orpi1971@gmail.com");

//        User should be able to type password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qwert12345");

        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#login > span")).click();


        //         Verify successful login
//        String expectedText = "Get ready for school & college";
//        Thread.sleep(5000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[10]/div/div[1]/h2/span")).getText();
//        System.out.println("Actual Text : " + actualText);
//        System.out.println("Expected Text :" + expectedText);
//        Thread.sleep(2000);
//        Assert.assertEquals(actualText, expectedText, "Sign In page doesn't navigate to home page");
//        Thread.sleep(3000);
//        driver.close();


    }

}
