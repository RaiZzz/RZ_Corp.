package test;

import com.exp.source.User;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by MadMax on 1/1/2017.
 */
public class Exp_04_UserTest {

    User user = new User();

    @Test
    public void useUser()
    {
        assertEquals( "username", user.getUsername(),"default username expected");
        assertEquals( "password", user.getPassword(),"default password expected");
    }

    @Test (priority = 1)
    public void userAdmin()
    {
        User admin = new User("Admin", "123456");
    }

    @Test (priority = 2)
    public void userSetter()
    {
        user.setPassword("qwerty");
    }
}
