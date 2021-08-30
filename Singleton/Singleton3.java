package com.study.mybatisdemo.design;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 10:48
 * 饿汉式单例模式
 */
public class Singleton3 {

    private static final Singleton3 singleton3 =new Singleton3();

    private  Singleton3(){

    }


    //静态工厂方法
    public static Singleton3 Hungry(){
        return singleton3;
    }




    private String name;

    public String getName(){
        return name;
    }


    public void setName(java.lang.String name) {
        this.name = name;
    }



    public void printInfo() {
        System.out.println("the name is " + name);
    }

}
