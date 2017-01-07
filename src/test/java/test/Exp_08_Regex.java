package test;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by MadMax on 1/4/2017.
 */
public class Exp_08_Regex {

    @Test
    public void main()
    {
        String x = "       Super     Staff    !!!!!   ";
        String y = x.trim();
        System.out.println(y);

        /////////////////////////

        String use = "%s %s towards %d large %s";
        assertThat(String.format(use, "Bob", "ran", 6, "onions"),is("Bob ran towards 6 large onions"));

        //Simple Temp file
        File tempFile = new File("d:\\tempFile.txt");
    }
}
