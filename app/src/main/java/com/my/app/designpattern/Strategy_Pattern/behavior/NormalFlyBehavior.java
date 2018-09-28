package com.my.app.designpattern.Strategy_Pattern.behavior;

import com.my.app.designpattern.Strategy_Pattern.behavior.FlyBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:29
 * @version: 1.0
 */

public class NormalFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我可以飞，我是一只可以正常飞的鸭子");
    }
}
