package com.study.mybatisdemo.decorate;

/**
 * @author zh
 * @description
 * @date 2021年08月26日 9:15
 */

//被装饰者，汽车类
public abstract class Car {
    protected String name;

    public String getName() {
        return name;
    }
    public abstract  Long speed();
}
