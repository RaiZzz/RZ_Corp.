package test;

import com.exp.source.ClassThree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals; // static import

/**
 * Created by MadMax on 1/1/2017.
 */
public class Exp_03 {

    WebDriver driver;

    @Test
    public void hardCoding()
    {
        driver = new ChromeDriver();

        driver.get(ClassThree.baseUrl());

        System.out.println(ClassThree.DOMAIN);
        System.out.println(ClassThree.PORT);

        // If import static don't need to write Assert before assertEquals
        assertEquals(ClassThree.PORT, "67", "Port should be 67");
        assertEquals(ClassThree.DOMAIN, "192.123.0.3", "Domain should be 192.123.0.3");
    }
}
