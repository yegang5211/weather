package com.hankal.miaosha.redis;

/**
 * Created by yegang5211 on 2018/2/26.
 */
public class AccessKey extends BasePrefix{

    private AccessKey( int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static AccessKey withExpire(int expireSeconds) {
        return new AccessKey(expireSeconds, "access");
    }
}
