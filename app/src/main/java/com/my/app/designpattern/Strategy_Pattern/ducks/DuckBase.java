package com.my.app.designpattern.Strategy_Pattern.ducks;

import com.my.app.designpattern.Strategy_Pattern.behavior.FlyBehavior;
import com.my.app.designpattern.Strategy_Pattern.behavior.NameTellingBehavior;
import com.my.app.designpattern.Strategy_Pattern.behavior.QuackBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 15:45
 * @version: 1.0
 */

public class DuckBase {

    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;
    protected NameTellingBehavior mNameTellingBehavior;

    //处理叫声行为
    public void performQuack() {
        if (mQuackBehavior != null)
            mQuackBehavior.quack();
    }

    //处理飞行行为
    public void performFly() {
        if (mFlyBehavior != null)
            mFlyBehavior.fly();
    }

    //处理种类自述行为
    public void performTellingName() {
        if (mNameTellingBehavior != null)
            mNameTellingBehavior.tellingName();
    }

    public void performAllBehavior() {
        performTellingName();
        performQuack();
        performFly();
        System.out.println("===========分割线===============");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void setNameTellingBehavior(NameTellingBehavior nameTellingBehavior) {
        mNameTellingBehavior = nameTellingBehavior;
    }
}
