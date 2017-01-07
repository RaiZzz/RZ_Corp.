package test;

import org.testng.annotations.Test;

/**
 * Created by MadMax on 1/2/2017.
 */
public class Exp_06_ILoveJavaReverse {

    @Test
    public void iLoveJava()
    {
        // Reverse by Words
        String love = "I love Java";
        String[] words = love.split(" ");
        for (int i=0; i<words.length; i++)
            System.out.print(words[words.length-i-1]+" ");

        // Reverse by Letters
        char[]letters = love.toCharArray();
        for (int i = 0; i<letters.length; i++)
            System.out.print(letters[letters.length-i-1]);
    }
}
