package com.my.app.designpattern.Decorator_Pattern.beverage;

/**
 * @description: 浓咖啡
 * @author: ouyangxin
 * @date: 2018-10-02 01:23
 * @version: 1.0
 */

public class Espresso extends Beverage {

    @Override
    public String getDesciption() {
        return "浓咖啡";
    }

    @Override
    public double cost() {
        return 10.5;
    }
}
