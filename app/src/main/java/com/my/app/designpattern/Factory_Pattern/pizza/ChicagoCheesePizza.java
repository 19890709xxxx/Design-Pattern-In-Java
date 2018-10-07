package com.my.app.designpattern.Factory_Pattern.pizza;

import com.my.app.designpattern.Factory_Pattern.Abstract_Factory_Pattern.PizzaIngredientFactory;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-10-07 11:59
 * @version: 1.0
 */

public class ChicagoCheesePizza extends CheesePizza {

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        setName("使用了来自芝加哥的Cheese，使用了芝加哥原料工厂的芝加哥Cheese");
    }
}
