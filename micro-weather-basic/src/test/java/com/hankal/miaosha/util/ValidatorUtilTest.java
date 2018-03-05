package com.hankal.miaosha.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yegang5211 on 2018/2/11.
 */
public class ValidatorUtilTest {
    @Test
    public void isMobile() throws Exception {
        Assert.assertEquals(ValidatorUtil.isMobile("18912341234"),true);
        Assert.assertEquals(ValidatorUtil.isMobile("1891234123"),false);
    }

}