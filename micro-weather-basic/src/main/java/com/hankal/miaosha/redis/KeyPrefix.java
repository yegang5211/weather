package com.hankal.miaosha.redis;

/**
 * Created by yegang5211 on 2018/2/10.
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();
}
