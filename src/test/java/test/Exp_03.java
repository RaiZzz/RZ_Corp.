package test;

import com.exp.source.ClassThree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
    }
}
