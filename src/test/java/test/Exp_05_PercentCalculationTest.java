package test;

import org.junit.Test;

/**
 * Created by MadMax on 1/1/2017.
 */
public class Exp_05_PercentCalculationTest {

    @Test
    public void calculationTest()
    {
        double sum = 565.16;
        double stack = 565.16;
        double percent = 1.06;
        
        System.out.println(sum);
        for (int i = 0; i<30; i++)
        {
            sum = stack + sum*percent;
            System.out.println(sum);
        }
    }
}
