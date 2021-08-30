package com.study.mybatisdemo.factory;

/**
 * @author zh
 * @description
 * @date 2021年08月14日 20:48
 */
public class SendFactory {
    public Cxk produce(String type){
        if (type.equals("sing")){
            return new Sing();
        }else if(type.equals("jump")){
            return new Jump();
        }else {
            System.out.println("我家gerger还不会这项技能哦");
            return null;
        }
    }
}
