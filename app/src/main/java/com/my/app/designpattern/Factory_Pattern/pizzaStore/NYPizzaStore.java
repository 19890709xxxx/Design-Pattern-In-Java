package com.my.app.designpattern.Factory_Pattern.pizzaStore;

import com.my.app.designpattern.Factory_Pattern.Abstract_Factory_Pattern.NYPizzaIngredientFactory;
import com.my.app.designpattern.Factory_Pattern.Factory_Pattern.SimplePizzaFactory;
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
