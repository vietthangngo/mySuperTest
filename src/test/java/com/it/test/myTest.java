package com.it.test;


import com.it.utils.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest extends BaseTest {
    @Test
    public void test1() throws Exception {
        UserFactory.getRandomUsers(10)
                .forEach(System.out::println);
        app.login.login(validUser.getLogin(),validUser.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(),validUser.getEmail());

    }
}
