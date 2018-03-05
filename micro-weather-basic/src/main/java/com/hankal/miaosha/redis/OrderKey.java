package com.hankal.miaosha.redis;

import com.hankal.miaosha.redis.BasePrefix;

public class OrderKey extends BasePrefix {

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");

}