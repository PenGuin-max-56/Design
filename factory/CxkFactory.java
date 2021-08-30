package com.study.mybatisdemo.factory;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 22:45
 */
public class CxkFactory {
    public static Cxk Sing(){
        return new CxkSing();
    }


    public static Cxk Jump(){
        return new CxkJump();
    }
}
