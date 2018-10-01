package com.my.app.designpattern.Decorator_Pattern;

import com.my.app.designpattern.Decorator_Pattern.beverage.Beverage;
import com.my.app.designpattern.Decorator_Pattern.beverage.Espresso;
import com.my.app.designpattern.Decorator_Pattern.beverage.HouseBlend;
import com.my.app.designpattern.Decorator_Pattern.condiment.Mocha;
import com.my.app.designpattern.Decorator_Pattern.condiment.Whip;

/**
 * @description: 装饰着模式 测试类
 * @author: ouyangxin
 * @date: 2018-10-02 00:19
 * @version: 1.0
 *
 *
 */

public class DecoratorTest {

    public static void main(String[] args) {
        //这里所有对象都是同属于一个超类，这样的设计确实很巧妙，可以动态添加功能
        Beverage houseblend = new HouseBlend();
        houseblend = new Mocha(houseblend);
        houseblend = new Whip(houseblend);

        System.out.println(houseblend.getDesciption()+" 价格： "+houseblend.cost());

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDesciption()+" 价格： "+espresso.cost());
    }

}
