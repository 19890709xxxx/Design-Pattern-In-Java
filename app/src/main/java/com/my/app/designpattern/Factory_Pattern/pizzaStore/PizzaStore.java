package com.my.app.designpattern.Factory_Pattern.pizzaStore;

import com.my.app.designpattern.Factory_Pattern.Factory_Pattern.SimplePizzaFactory;
import com.my.app.designpattern.Factory_Pattern.pizza.Pizza;

/**
 * @description: 披萨店类 简单工厂模式
 * @author: ouyangxin
 * @date: 2018-10-07 02:02
 * @version: 1.0
 */

public class PizzaStore {
    private SimplePizzaFactory mSimplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        mSimplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = mSimplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
