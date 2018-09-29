package com.my.app.designpattern.Strategy_Pattern.behavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-29 14:26
 * @version: 1.0
 */

public class CannotQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是一只不会叫的鸭子");
    }
}
