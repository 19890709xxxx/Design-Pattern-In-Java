package com.my.app.designpattern.Observer_Pattern.screens;

/**
 * @description: 数据显示接口，是所有显示屏应该实现的接口
 * @author: ouyangxin
 * @date: 2018-09-29 16:46
 * @version: 1.0
 */

public interface DataDisplay {

    void display(float temperature, float pressure, float humidity);

}
