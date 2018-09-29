package com.my.app.designpattern.Observer_Pattern.observers;

/**
 * @description: 观察者接口，所有气象组建都要实现这个接口，用于subject用于通知所有observer的共同接口
 * @author: ouyangxin
 * @date: 2018-09-29 16:36
 * @version: 1.0
 */

public interface Observer {

    /**
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    void update(float temperature , float pressure , float humidity); //用于更新数据

    String getType();//获取这个观察者的名称
}
