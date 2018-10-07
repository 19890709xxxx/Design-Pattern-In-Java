package com.my.app.designpattern.Factory_Pattern.Factory_Pattern;

import com.my.app.designpattern.Factory_Pattern.pizza.CheesePizza;
import com.my.app.designpattern.Factory_Pattern.pizza.ClamPizza;
import com.my.app.designpattern.Factory_Pattern.pizza.PepperoniPizza;
import com.my.app.designpattern.Factory_Pattern.pizza.Pizza;
import com.my.app.designpattern.Factory_Pattern.pizza.ViggiePizza;

/**
 * @description: pizza 工厂类
 * @author: ouyangxin
 * @date: 2018-10-07 02:06
 * @version: 1.0
 */

public class SimplePizzaFactory {
    public static final String CHEESE="cheese";
    public static final String VEGGIE ="viggie";
    public static final String CLAM ="clam";
    public static final String PEPPERONI="pepperoni";

    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type){
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case VEGGIE:
                pizza = new ViggiePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
        }
        if (pizza!=null)
            pizza.setName(type+"披萨");
        return pizza;
    }

}
