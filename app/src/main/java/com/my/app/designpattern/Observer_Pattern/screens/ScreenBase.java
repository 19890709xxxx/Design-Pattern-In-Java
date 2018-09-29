package com.my.app.designpattern.Observer_Pattern.screens;

import com.my.app.designpattern.Observer_Pattern.observers.Observer;
import com.my.app.designpattern.Observer_Pattern.subject.Subject;

/**
 * @description: 屏幕基础抽象类
 * @author: ouyangxin
 * @date: 2018-09-29 17:38
 * @version: 1.0
 */

public abstract class ScreenBase implements Observer,DataDisplay {

    private Subject weatherData;


    public ScreenBase(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("==========="+getTypeNames()+"===============");
        display(temperature,pressure,humidity);
    }

    @Override
    public String getType() {
        return getTypeNames();
    }

    protected abstract String getTypeNames();
}
