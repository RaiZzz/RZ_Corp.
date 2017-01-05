package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maksim on 12/28/2015.
 */
public class Exp_01 {
    WebDriver driver;
    String baseUrl = "http://google.com/";
    String search = "cat";

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void googleSearch() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//*[@id='lst-ib']"));
        element.clear();
        element.sendKeys(search);
        element.submit();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]/div/h3/a")).getText().toLowerCase().contains(search));
    }

    @AfterClass
    public void breakDown()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
