package com.my.app.designpattern.Factory_Pattern.pizza;

import com.my.app.designpattern.Factory_Pattern.abstract_factory_pattern.PizzaIngredientFactory;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-10-07 11:58
 * @version: 1.0
 */

public class NYCheesePizza extends CheesePizza {
    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        setName("使用了来自纽约的Cheese，使用了纽约原料工厂的纽约Cheese");
    }
}
