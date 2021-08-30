package com.study.mybatisdemo.factory;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 21:17
 */
public class SendFactory2 {

    public static Cxk produceSing(){
        return new Sing();
    }

    public static Cxk produceJump(){
        return new Jump();
    }
}
