package com.my.app.designpattern.Strategy_Pattern.behavior.Wood_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.NameTellingBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:38
 * @version: 1.0
 */

public class WoodDuckNameTelling implements NameTellingBehavior {
    @Override
    public void tellingName() {
        System.out.println("我是一只木鸭子，不会飞也不会叫");
    }
}
