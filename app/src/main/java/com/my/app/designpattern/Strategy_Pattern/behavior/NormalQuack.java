package com.my.app.designpattern.Strategy_Pattern.behavior;

/**
 * @description: 正常叫声
 * @author: ouyangxin
 * @date: 2018-09-28 16:23
 * @version: 1.0
 */

public class NormalQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱，我的发声正常");
    }
}
