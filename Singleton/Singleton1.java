package com.study.mybatisdemo.design;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 10:22
 * 懒汉单例模式：内部类实现
 */
public class Singleton1 {
    /*私有构造方法防止实例化*/
    private  Singleton1(){
    }

    /*使用内部类维护单例*/
    public static class SingletonFactory {
       private static Singleton1 singleton1 = new Singleton1();
    }


    /*获取实例*/
    public static Singleton1 lazy(){
        return SingletonFactory.singleton1;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object read(){
        return  lazy();
    }

}
