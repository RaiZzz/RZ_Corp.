package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by MadMax on 12/30/2015.
 */
public class Exp_02_SevaTest {

    WebDriver driver;
    String time = "0:10";

    @Test
    public void sevaTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://experiencevr360.blogspot.com/2016/11/testing-assignment.html?m=1");

        Thread.sleep(6000);

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='envrmnt_124ad178-1b96-4b68-ae36-9251386dc779']")));

        WebElement element = driver.findElement(By.xpath("//*[@id='video-wrapper']/div/div[2]/div/div[4]/div[1]/span[1]"));
        while (true)
        {
            if (element.getText().equals(time))
            {
                driver.findElement(By.xpath("//*[@id='play-pause-container']/div[1]")).click();
                break;
            }
        }
        Assert.assertEquals( element.getText(), time);

        driver.quit();
    }
}
