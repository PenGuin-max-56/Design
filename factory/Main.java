package com.study.mybatisdemo.factory;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 20:53
 */
public class Main {
    public static void main(String[] args) {
        Cxk cxk = CxkFactory.Jump();
        cxk.Cxks();
        Cxk cxk1 = CxkFactory.Sing();
        cxk1.Cxks();
        System.out.println("===================================");
        Wyf wyf =WxfFactory.Jump();
        wyf.Wyfs();
        Wyf wyf1 = WxfFactory.Sing();
        wyf1.Wyfs();

    }
}
