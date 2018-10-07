package com.my.app.designpattern.Factory_Pattern.Abstract_Factory_Pattern;

import com.my.app.designpattern.Factory_Pattern.model.Cheese;
import com.my.app.designpattern.Factory_Pattern.model.Sauce;

/**
 * @description: 披萨原料接口
 * @author: ouyangxin
 * @date: 2018-10-07 12:13
 * @version: 1.0
 */

public interface PizzaIngredientFactory {
     Cheese createCheese();
     Sauce createSauce();
}
