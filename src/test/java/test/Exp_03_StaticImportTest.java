package test;

import com.exp.source.MainInformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals; // static import

/**
 * Created by MadMax on 1/1/2017.
 */
public class Exp_03_StaticImportTest {

    WebDriver driver;

    @Test
    public void hardCoding()
    {
        driver = new ChromeDriver();

        driver.get(MainInformation.baseUrl());

        System.out.println(MainInformation.DOMAIN);
        System.out.println(MainInformation.PORT);

        // If import static don't need to write Assert before assertEquals
        assertEquals(MainInformation.PORT, "67", "Port should be 67");
        assertEquals(MainInformation.DOMAIN, "192.123.0.3", "Domain should be 192.123.0.3");
    }
}
