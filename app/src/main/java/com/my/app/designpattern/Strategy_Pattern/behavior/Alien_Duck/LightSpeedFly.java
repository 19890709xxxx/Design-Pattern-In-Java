package com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.FlyBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 17:01
 * @version: 1.0
 */

public class LightSpeedFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不得了了，外星鸭子已经飞的比火箭还要快了，简直是超光速了！");
    }
}
