package com.my.app.designpattern.Strategy_Pattern.behavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:33
 * @version: 1.0
 */

public class CannotFlyBehavior implements FlyBehavior{


    @Override
    public void fly() {
        System.out.println("我是一只不会飞的鸭子");
    }
}
