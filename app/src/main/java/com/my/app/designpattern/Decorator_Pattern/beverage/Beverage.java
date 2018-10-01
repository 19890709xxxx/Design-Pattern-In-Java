package com.my.app.designpattern.Decorator_Pattern.beverage;

/**
 * @description: 饮料超类
 * @author: ouyangxin
 * @date: 2018-10-02 00:35
 * @version: 1.0
 */

public abstract class Beverage {
    protected String desciption ="default";

    public String getDesciption() {
        return desciption;
    }

    public abstract double cost();
}
