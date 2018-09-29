package com.my.app.designpattern.Strategy_Pattern.behavior.Red_Head_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.NameTellingBehavior;

/**
 * @description: 红头鸭子 自述类
 * @author: ouyangxin
 * @date: 2018-09-28 16:23
 * @version: 1.0
 */

public class RedHeadDuckNameTelling implements NameTellingBehavior {
    @Override
    public void tellingName() {
        System.out.println("我是一只红头鸭子");
    }
}
