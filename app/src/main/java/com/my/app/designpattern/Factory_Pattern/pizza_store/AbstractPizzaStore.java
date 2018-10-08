package com.my.app.designpattern.Factory_Pattern.pizza_store;

import com.my.app.designpattern.Factory_Pattern.pizza.Pizza;

/**
 * @description: 披萨店抽象类 用于 抽象工厂模式
 * @author: ouyangxin
 * @date: 2018-10-07 11:49
 * @version: 1.0
 */

public abstract class AbstractPizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
