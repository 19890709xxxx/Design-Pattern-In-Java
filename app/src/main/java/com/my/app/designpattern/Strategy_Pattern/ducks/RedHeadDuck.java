package com.my.app.designpattern.Strategy_Pattern.ducks;

import com.my.app.designpattern.Strategy_Pattern.behavior.NormalFlyBehavior;
import com.my.app.designpattern.Strategy_Pattern.behavior.NormalQuack;
import com.my.app.designpattern.Strategy_Pattern.behavior.Red_Head_Duck.RedHeadDuckNameTelling;

/**
 * @description: 红头鸭子
 * @author: ouyangxin
 * @date: 2018-09-28 16:15
 * @version: 1.0
 */

public class RedHeadDuck extends DuckBase {

    public RedHeadDuck() {

        mFlyBehavior = new NormalFlyBehavior();
        mNameTellingBehavior = new RedHeadDuckNameTelling();
        mQuackBehavior = new NormalQuack();

    }
}
