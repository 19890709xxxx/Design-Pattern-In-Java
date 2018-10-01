package com.my.app.designpattern.Decorator_Pattern.beverage;

/**
 * @description: 综合咖啡
 * @author: ouyangxin
 * @date: 2018-10-02 01:21
 * @version: 1.0
 */

public class HouseBlend extends Beverage{

    @Override
    public String getDesciption() {
        return "综合咖啡";
    }

    @Override
    public double cost() {
        return 8.5;
    }
}
