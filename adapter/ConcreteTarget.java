package com.study.mybatisdemo.adapter;

/**
 * @author zh
 * @description
 * @date 2021年08月19日 23:23
 */

// 具体目标类，只提供普通功能
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("i am loser 我很普通");
    }
}
