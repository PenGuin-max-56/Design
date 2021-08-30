package com.study.mybatisdemo.Prototype;

import java.util.ArrayList;

/**
 * @author zh
 * @description
 * @date 2021年08月15日 22:27
 */
public class Prototype implements Cloneable {
    /*浅拷贝*/
//    public Prototype clone(){
//        Prototype prototype = null;
//        try{
//            prototype = (Prototype)super.clone();
//        }catch(CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return prototype;
//    }

    /*深拷贝*/
    private ArrayList list = new ArrayList();
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }


}





