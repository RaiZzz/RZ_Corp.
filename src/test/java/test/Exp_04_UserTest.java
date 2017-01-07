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
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
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
