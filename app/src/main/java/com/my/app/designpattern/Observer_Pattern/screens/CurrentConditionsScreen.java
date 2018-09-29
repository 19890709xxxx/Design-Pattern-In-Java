package com.my.app.designpattern.Observer_Pattern.screens;

import com.my.app.designpattern.Observer_Pattern.subject.Subject;

/**
 * @description: 实时数据更新屏幕
 * @author: ouyangxin
 * @date: 2018-09-29 17:27
 * @version: 1.0
 */

public class CurrentConditionsScreen extends ScreenBase{


    public CurrentConditionsScreen(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display(float temperature, float pressure, float humidity) {
        System.out.println("实时温度： "+temperature+" 实时气压： "+pressure+" 实时湿度： "+humidity);
    }


    @Override
    protected String getTypeNames() {
        return "实时数据屏幕";
    }


}
