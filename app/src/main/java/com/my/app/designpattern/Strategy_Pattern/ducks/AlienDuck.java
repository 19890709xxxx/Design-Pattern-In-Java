package com.my.app.designpattern.Strategy_Pattern.ducks;

import com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck.AlienDuckFly;
import com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck.AlienDuckNameTelling;
import com.my.app.designpattern.Strategy_Pattern.behavior.Alien_Duck.AlienDuckQuack;

/**
 * @description: 外星鸭子
 * @author: ouyangxin
 * @date: 2018-09-28 16:39
 * @version: 1.0
 */

public class AlienDuck  extends DuckBase{

    public AlienDuck() {
        mFlyBehavior = new AlienDuckFly();
        mNameTellingBehavior = new AlienDuckNameTelling();
        mQuackBehavior = new AlienDuckQuack();
    }
}
