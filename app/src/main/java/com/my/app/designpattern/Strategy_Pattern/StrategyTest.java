package com.my.app.designpattern.Strategy_Pattern;

import com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck.LightSpeedFly;
import com.my.app.designpattern.Strategy_Pattern.ducks.AlienDuck;
import com.my.app.designpattern.Strategy_Pattern.ducks.DuckBase;
import com.my.app.designpattern.Strategy_Pattern.ducks.RedHeadDuck;
import com.my.app.designpattern.Strategy_Pattern.ducks.WoodDuck;

/**
 * @description: 策略模式测试类
 * @author: ouyangxin
 * @date: 2018-09-28 16:43
 * @version: 1.0
 *
 *
 * 策略模式：
 * 1 就是把一些经常会改变的属性抽出来，把基本的属性变成接口，这里就是封装变化的过程
 * 2 然后具体的属性再去实现基本的接口，实现不同的详细功能
 * ，如鸭子的叫声和飞行，抽出来 变成 FlyBehavior 和 QuackBehavior，然后各种鸭子的
 * 叫声和飞行行为再去实现这两个接口
 * 3 既然各种行为属性已经实现了，那么这时候创建不同鸭子的时候，只要创建对应的要实现的行为
 * 就可以灵活地表现这只鸭子的属性和行为了
 *
 *优点：1. 可以有效地避免继承滥用的问题（继承有时候修改超类的时候牵一发动全身），
 *        使代码更具体弹性
 *     2.可以在运行的时候动态修改策略，易于切换，易于理解，易于扩展
 *     3、策略模式中的算法也可以复用在系统的其他地方，从而避免许多重复的复制粘贴工作
 *
 * 缺点：1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 *      2.造成很多的策略类
 *
 * 设计原则：多用组合，少用继承，针对接口编程(实际上是针对超类编程)，而不是针对实现编程
 */

public class StrategyTest {

    public static void main(String[] args) {
        DuckBase wd = new WoodDuck();//使用多态
        DuckBase rd = new RedHeadDuck();
        DuckBase ad = new AlienDuck();

        wd.performAllBehavior();
        rd.performAllBehavior();
        ad.performAllBehavior();

        ad.setFlyBehavior(new LightSpeedFly());//动态修改行为，非常方便
        ad.performFly();
    }

}
