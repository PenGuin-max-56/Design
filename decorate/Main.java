package com.study.mybatisdemo.decorate;

/**
 * @author zh
 * @description
 * @date 2021年08月26日 9:42
 */
public class Main {
    public static void main(String[] args) {
        Car car = new SportsCar();
        System.out.println(car.getName()+"时速"+car.speed());

        Turbine turbine = new Turbine(car);
        System.out.println(turbine.getName()+"时速"+turbine.speed());

        Car car2 =new Truck();
        System.out.println(car2.getName()+"时速"+car2.speed());

        Turbine turbine2 = new Turbine(car2);
        System.out.println(turbine2.getName()+"时速"+turbine2.speed());
    }
}
