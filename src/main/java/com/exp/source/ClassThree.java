package com.exp.source;

/**
 * Created by MadMax on 1/1/2017.
 */
public class ClassThree {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String baseUrl()
    {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
