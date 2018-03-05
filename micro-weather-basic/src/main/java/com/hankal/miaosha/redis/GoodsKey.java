package com.hankal.miaosha.redis;

/**
 * Created by yegang5211 on 2018/2/17.
 */
public class GoodsKey extends BasePrefix {


    public GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
    public static GoodsKey getMiaoshaGoodsStock= new GoodsKey(0, "gs");
}
