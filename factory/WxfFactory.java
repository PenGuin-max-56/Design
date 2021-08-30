package com.study.mybatisdemo.factory;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 22:48
 */
public class WxfFactory {
    public static Wyf Sing(){
        return new WxfSing();
    }

    public static  Wyf Jump(){
        return new WyfJump();
    }
}
