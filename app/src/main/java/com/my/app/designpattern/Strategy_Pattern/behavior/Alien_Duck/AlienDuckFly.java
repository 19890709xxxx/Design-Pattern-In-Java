package com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.FlyBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:41
 * @version: 1.0
 */

public class AlienDuckFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("外星鸭子飞行像火箭一样快");
    }
}
