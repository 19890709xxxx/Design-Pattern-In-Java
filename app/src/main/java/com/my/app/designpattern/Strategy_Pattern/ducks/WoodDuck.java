package com.my.app.designpattern.Strategy_Pattern.ducks;

import com.my.app.designpattern.Strategy_Pattern.behavior.Wood_Duck.WoodDuckNameTelling;

/**
 * @description: 木头鸭子，不会飞，也不会叫
 * @author: ouyangxin
 * @date: 2018-09-28 16:35
 * @version: 1.0
 */

public class WoodDuck  extends DuckBase{

    public WoodDuck() {

        //由于木鸭子不会飞也不会叫，所以无需初始化 叫声和飞行行为类
        mNameTellingBehavior = new WoodDuckNameTelling();

    }
}
