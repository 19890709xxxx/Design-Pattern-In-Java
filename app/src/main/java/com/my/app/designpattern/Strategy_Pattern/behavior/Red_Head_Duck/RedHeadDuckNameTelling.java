package com.my.app.designpattern.Strategy_Pattern.behavior.Red_Head_Duck;

import com.my.app.designpattern.Strategy_Pattern.behavior.NameTellingBehavior;

/**
 * @description: 对类文件的描述
 * @author: ouyangxin
 * @date: 2018-09-28 16:23
 * @version: 1.0
 */

public class RedHeadDuckNameTelling implements NameTellingBehavior {
    @Override
    public void tellingName() {
        System.out.println("Red Head Duck");
    }
}
