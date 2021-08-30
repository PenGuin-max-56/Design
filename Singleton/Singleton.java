package com.study.mybatisdemo.design;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 10:00
 * 懒汉式单例模式:双重检查锁定
 */
public class Singleton {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static   Singleton instance = null;

    //私有构造方法防止实例化
    private Singleton(){

    }


    /* 静态工程方法，创建实例 */
    public static Singleton lazy(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printf(){
        System.out.println("name:"+name);
    }
}
