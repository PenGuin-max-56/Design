package com.study.mybatisdemo.adapter;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author zh
 * @description
 * @date 2021年08月19日 23:31
 */
public class main {
    public static void main(String[] args) {
        // 使用普通功能类
        Target target =new ConcreteTarget();
        target.request();


        // 使用特殊功能类，即适配类
        // 需要先创建一个被适配类的对象作为参数
        Target target1=new Adapter2(new Adaptee());
        target1.request();

    }
}
