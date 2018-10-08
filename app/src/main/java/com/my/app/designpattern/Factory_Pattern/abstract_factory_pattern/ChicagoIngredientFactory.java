package com.my.app.designpattern.Factory_Pattern.abstract_factory_pattern;

import com.my.app.designpattern.Factory_Pattern.model.Cheese;
import com.my.app.designpattern.Factory_Pattern.model.ChicagoCheese;
import com.my.app.designpattern.Factory_Pattern.model.ChicagoSauce;
import com.my.app.designpattern.Factory_Pattern.model.Sauce;

/**
 * @description: 芝加哥原料工厂
 * @author: ouyangxin
 * @date: 2018-10-07 12:19
 * @version: 1.0
 */

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
