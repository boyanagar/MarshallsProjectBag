/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Boiana
 */
public class AddBagTest {

    private WebDriver driver;
    private String baseUrl;

    public AddBagTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(priority = 1)
    public void testAddBag() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/shop/women/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//img[@alt=' ']")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/women-women-handbags/Love-Is-Juicy-Backpack/4000221752?colorId=NS4154762&pos=1:1&N=3758044351");
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("View Bag")).click();
        driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
        driver.quit();
    }

    @Test(priority = 2)
    public void testAddBag2() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/shop/new-arrivals/home/_/N-842114098+2241537684?ln=6:1");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//img[@alt='4pc Emma Bath Towel Set']")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/home/new-arrivals/4pc-Emma-Bath-Towel-Set/4000227295?colorId=NS4155173&pos=1:1&N=842114098+2241537684");
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("Keep Shopping")).click();
        driver.get("https://www.marshalls.com/us/store/shop/new-arrivals/home/_/N-842114098+2241537684?ln=6:1");
        driver.findElement(By.xpath("//img[@alt='Hand Soap And Hand Lotion On Cutting Board']")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/home/new-arrivals/Hand-Soap-And-Hand-Lotion-On-Cutting-Board/4000233397?colorId=NS4155481&pos=1:2&N=842114098+2241537684");
        driver.findElement(By.id("quantity-4000233397")).click();
        new Select(driver.findElement(By.id("quantity-4000233397"))).selectByVisibleText("3");
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("View Bag")).click();
        driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
        driver.quit();
    }

    //@Test(priority = 3)
    public void testRemove() throws Exception {
    driver.manage().window().maximize();
    driver.get("https://www.marshalls.com/us/store/shop/beauty-accessories/_/N-2063148638?tn=5");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,450)", "");
    driver.findElement(By.xpath("//img[@alt='Detangler For Thick Hair']")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/beauty-accessories/Detangler-For-Thick-Hair/4000250402?colorId=NS4154949&pos=1:5&N=2063148638");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("View Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    driver.findElement(By.xpath("//form[@id='cartUpdateForm']/ul/li[3]/div[2]/span[3]/a")).click();
    driver.findElement(By.id("quantity")).click();
    new Select(driver.findElement(By.id("quantity"))).selectByVisibleText("0");
    driver.findElement(By.name("removeAndAddItemToOrder")).click();
     driver.quit();
  }

}
