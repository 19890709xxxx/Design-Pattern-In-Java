package com.my.app.designpattern.Factory_Pattern.pizza;

import com.my.app.designpattern.Factory_Pattern.Abstract_Factory_Pattern.PizzaIngredientFactory;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-10-07 02:17
 * @version: 1.0
 */

public class CheesePizza extends Pizza{
    private PizzaIngredientFactory mPizzaIngredientFactory;

    public CheesePizza() {
    }

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        mPizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        if (mPizzaIngredientFactory!=null) {
            sauce = mPizzaIngredientFactory.createSauce();
            mCheese = mPizzaIngredientFactory.createCheese();
        }
        super.prepare();

    }
}
