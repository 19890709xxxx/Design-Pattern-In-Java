package com.my.app.designpattern.Factory_Pattern;

import com.my.app.designpattern.Factory_Pattern.Factory_Pattern.SimplePizzaFactory;
import com.my.app.designpattern.Factory_Pattern.pizzaStore.AbstractPizzaStore;
import com.my.app.designpattern.Factory_Pattern.pizzaStore.ChicagoPizzaStore;
import com.my.app.designpattern.Factory_Pattern.pizzaStore.NYPizzaStore;
import com.my.app.designpattern.Factory_Pattern.pizzaStore.PizzaStore;

/**
 * @description: 工厂模式及抽象工厂模式测试类
 * @author: ouyangxin
 * @date: 2018-10-05 00:29
 * @version: 1.0
 *
 * 1 工厂模式 使用的是继承来创建对象
 *   抽象工厂模式 使用的是组合来创建对象
 *
 * 2 抽象工厂模式经常使用工厂模式来创建具体对象
 */

public class FactoryPatternTest {

    public static void main(String[] args) {
        //简单工厂模式
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza(SimplePizzaFactory.CHEESE);

        //抽象工厂模式
        AbstractPizzaStore abstractPizzaStore = new NYPizzaStore();

        abstractPizzaStore.orderPizza(SimplePizzaFactory.CHEESE);//注意 CheesePiazza 使用了组合 去创造不同地区不同原料的pizza
        abstractPizzaStore.orderPizza(SimplePizzaFactory.VEGGIE);

        AbstractPizzaStore abstractPizzaStore1 = new ChicagoPizzaStore();

        abstractPizzaStore1.orderPizza(SimplePizzaFactory.CHEESE);
        abstractPizzaStore1.orderPizza(SimplePizzaFactory.VEGGIE);
    }


}
