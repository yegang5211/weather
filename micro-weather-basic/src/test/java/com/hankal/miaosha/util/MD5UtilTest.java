package com.hankal.miaosha.util;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by yegang5211 on 2018/2/10.
 */
public class MD5UtilTest {
    @Autowired
    MD5Util util;

    @Test
    public void inputPassToDbPass() throws Exception {
        String password = "123456";
        String saltDB = "1a2b3c4d";
        String passwordToDb = "b7797cce01b4b131b433b6acf4add449";
        Assert.assertEquals(util.inputPassToDbPass(password, saltDB), passwordToDb);
    }

}