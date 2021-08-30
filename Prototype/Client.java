package com.study.mybatisdemo.Prototype;

/**
 * @author zh
 * @description
 * @date 2021年08月15日 22:37
 */
public class Client extends  ConcretePrototype {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }



}
