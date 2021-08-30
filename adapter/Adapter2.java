package com.study.mybatisdemo.adapter;

/**
 * @author zh
 * @description
 * @date 2021年08月20日 23:10
 */

// 适配器类，直接关联被适配类，同时实现标准接口
public class Adapter2 implements Target {
    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    // 这里是使用委托的方式完成特殊功能
    public void request() {
        this.adaptee.specificRequest();
    }
}
