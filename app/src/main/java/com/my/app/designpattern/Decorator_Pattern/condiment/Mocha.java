package com.my.app.designpattern.Decorator_Pattern.condiment;

import com.my.app.designpattern.Decorator_Pattern.beverage.Beverage;

/**
 * @description: 摩卡 装饰者
 * @author: ouyangxin
 * @date: 2018-10-02 01:25
 * @version: 1.0
 */

public class Mocha extends CondimentDecorator{

    private Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public double cost() {
        return 1.5+mBeverage.cost();
    }

    @Override
    protected String getCondimentDecoratorDescription() {
        return mBeverage.getDesciption()+", mocha";
    }
}
