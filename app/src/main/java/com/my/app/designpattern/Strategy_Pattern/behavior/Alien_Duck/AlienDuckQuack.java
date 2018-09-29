package com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.QuackBehavior;

/**
 * @description: 外星鸭子叫声行为类
 * @author: ouyangxin
 * @date: 2018-09-28 16:40
 * @version: 1.0
 */

public class AlienDuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("外星鸭子的叫声像老虎");
    }
}
