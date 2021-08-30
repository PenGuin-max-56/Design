package com.study.mybatisdemo.design;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 10:40
 */
public class main {
    public static void main(String[] args) {
        Singleton3 sr1 = Singleton3.Hungry();
        sr1.setName("张三");

        Singleton3 sr2 = Singleton3.Hungry();
        sr2.setName("李四");

        sr1.printInfo();
        sr2.printInfo();

        if(sr1==sr2){
            System.out.println("创建的是同一个实例");
        }else {
            System.out.println("创建的不是同一个实例");
        }

    }
}
