package com.study.mybatisdemo.decorate;

/**
 * @author zh
 * @description
 * @date 2021年08月26日 10:00
 */
public class Truck extends Car {
    public Truck(){
        name="货车";
    }
    @Override
    public Long speed() {
        return 50L;
    }
}
