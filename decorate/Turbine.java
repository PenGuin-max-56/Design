package com.study.mybatisdemo.decorate;

/**
 * @author zh
 * @description
 * @date 2021年08月26日 9:40
 */
//装饰层
public class Turbine extends Refit {
    Car car;

    public Turbine(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName()+"增加涡轮发动机";
    }

    @Override
    public Long speed() {
        return car.speed()+50L;
    }
}
