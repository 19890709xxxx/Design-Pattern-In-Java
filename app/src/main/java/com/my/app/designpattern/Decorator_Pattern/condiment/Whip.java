package com.my.app.designpattern.Decorator_Pattern.condiment;

import com.my.app.designpattern.Decorator_Pattern.beverage.Beverage;

/**
 * @description: 奶盖 装饰者
 * @author: ouyangxin
 * @date: 2018-10-02 01:28
 * @version: 1.0
 */

public class Whip extends CondimentDecorator {
    private Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public double cost() {
        return 2.5+ mBeverage.cost();
    }

    @Override
    protected String getCondimentDecoratorDescription() {
        return mBeverage.getDesciption()+", 奶盖";
    }
}
