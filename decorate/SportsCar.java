package com.study.mybatisdemo.decorate;

/**
 * @author zh
 * @description
 * @date 2021年08月26日 9:30
 */
//被装饰的初始状态
public class SportsCar extends Car {

    public SportsCar() {
        name="跑车";
    }

    @Override
    public Long speed() {
        return 100L;
    }
}
