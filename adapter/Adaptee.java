package com.study.mybatisdemo.adapter;

/**
 * @author zh
 * @description
 * @date 2021年08月19日 23:16
 */
//已存在的、具有特殊功能、但不符合我们既有的标准接口的类
public class Adaptee {
    public void specificRequest(){
        System.out.println("我的功能很特殊，好像不适合你哦");
    }
}
