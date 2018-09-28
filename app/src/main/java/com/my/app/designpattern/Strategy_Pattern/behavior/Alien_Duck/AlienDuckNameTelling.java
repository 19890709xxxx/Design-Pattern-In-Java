package com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.NameTellingBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:42
 * @version: 1.0
 */

public class AlienDuckNameTelling implements NameTellingBehavior {
    @Override
    public void tellingName() {
        System.out.println("我是一直超级强大的外星鸭子");
    }
}
