package test;

import org.testng.annotations.Test;

/**
 * Created by MadMax on 1/3/2016.
 */
public class Exp_07_IHaveNoIdeaHowItWork {

    @Test
    public int test(int n, int k)
    {
        // Basically it is delete k-th bit from n-th number (In binary format) TODO Understand how it work !!!
        return n & ~(1 << (k - 1));
    }
}
