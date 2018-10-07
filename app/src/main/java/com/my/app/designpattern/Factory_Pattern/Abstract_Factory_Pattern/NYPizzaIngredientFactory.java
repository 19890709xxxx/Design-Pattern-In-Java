package com.my.app.designpattern.Factory_Pattern.Abstract_Factory_Pattern;

import com.my.app.designpattern.Factory_Pattern.model.Cheese;
import com.my.app.designpattern.Factory_Pattern.model.NYCheese;
import com.my.app.designpattern.Factory_Pattern.model.NYSauce;
import com.my.app.designpattern.Factory_Pattern.model.Sauce;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-10-07 12:18
 * @version: 1.0
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
