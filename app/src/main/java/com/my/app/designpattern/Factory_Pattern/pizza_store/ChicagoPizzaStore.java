package com.my.app.designpattern.Factory_Pattern.pizza_store;

import com.my.app.designpattern.Factory_Pattern.abstract_factory_pattern.ChicagoIngredientFactory;
import com.my.app.designpattern.Factory_Pattern.factory_pattern.SimplePizzaFactory;
import com.my.app.designpattern.Factory_Pattern.pizza.ChicagoCheesePizza;
import com.my.app.designpattern.Factory_Pattern.pizza.ChicagoVeggiePizza;
import com.my.app.designpattern.Factory_Pattern.pizza.Pizza;

/**
 * @description: 芝加哥披萨店
 * @author: ouyangxin
 * @date: 2018-10-07 11:52
 * @version: 1.0
 */

public class ChicagoPizzaStore extends AbstractPizzaStore{
    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case SimplePizzaFactory.CHEESE:
                return new ChicagoCheesePizza(new ChicagoIngredientFactory());
            case SimplePizzaFactory.VEGGIE:
                return new ChicagoVeggiePizza();
        }
        return null;
    }
}
