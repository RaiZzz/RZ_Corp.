package com.exp.source;

/**
 * Created by MadMax on 1/1/2016.
 * I was really Mad, I learned this on January 1
 */

public class User {

    private String username;
    private String password;

    /**
     * By default SetUp: "username", "password".
     */
    public User()
    {
        this("username","password");
    }

    public User(String username, String password)
    {
     this.username = username;
     this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
