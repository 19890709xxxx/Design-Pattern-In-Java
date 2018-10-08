package com.my.app.designpattern.Factory_Pattern.pizza_store;

import com.my.app.designpattern.Factory_Pattern.abstract_factory_pattern.NYPizzaIngredientFactory;
import com.my.app.designpattern.Factory_Pattern.factory_pattern.SimplePizzaFactory;
import com.my.app.designpattern.Factory_Pattern.pizza.NYCheesePizza;
import com.my.app.designpattern.Factory_Pattern.pizza.NYVeggiePizza;
import com.my.app.designpattern.Factory_Pattern.pizza.Pizza;

/**
 * @description: 纽约披萨店
 * @author: ouyangxin
 * @date: 2018-10-07 11:51
 * @version: 1.0
 */

public class NYPizzaStore extends AbstractPizzaStore{
    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case SimplePizzaFactory.CHEESE:
                return new NYCheesePizza(new NYPizzaIngredientFactory());
            case SimplePizzaFactory.VEGGIE:
                return new NYVeggiePizza();
        }
        return null;
    }
}
