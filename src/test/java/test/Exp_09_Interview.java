package test;

import com.github.javafaker.Faker;

/**
 * Created by MadMax on 2/7/2017.
 */
public class Exp_09_Interview {

    public static void main(String[] args)
    {
        Faker faker = new Faker();

        for (int i = 0; i<1000; i++)
        {
            System.out.println(faker.number().numberBetween(0,11));
        }
    }
}
