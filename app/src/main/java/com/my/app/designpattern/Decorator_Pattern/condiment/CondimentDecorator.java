package com.my.app.designpattern.Decorator_Pattern.condiment;

import com.my.app.designpattern.Decorator_Pattern.beverage.Beverage;

/**
 * @description: 调料 超类
 * @author: ouyangxin
 * @date: 2018-10-02 00:54
 * @version: 1.0
 *
 * CondimentDecorator 也是继承于Beverage ，因为装饰者与被装饰者对象有相同的超类型
 * 这样CondimentDecorator就可以取代Beverage
 *
 */

public abstract class CondimentDecorator extends Beverage{

    protected abstract String getCondimentDecoratorDescription();

    @Override
    public String getDesciption() {
        return getCondimentDecoratorDescription();
    }
}
