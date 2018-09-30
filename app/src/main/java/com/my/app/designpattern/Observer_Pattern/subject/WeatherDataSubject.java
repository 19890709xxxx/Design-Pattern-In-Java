package com.my.app.designpattern.Observer_Pattern.subject;

import com.my.app.designpattern.Observer_Pattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 气象站主题类
 * @author: ouyangxin
 * @date: 2018-09-29 16:48
 * @version: 1.0
 */

public class WeatherDataSubject implements Subject{

    private List<Observer> mObservers;//观察者列表，用于记录已经订阅了的观察者

    private float mTemperature;//温度
    private float mPressure;//气压
    private float mHumidity;//湿度

    public WeatherDataSubject() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
            System.out.println(observer.getType()+"这个观察者已经被删除，数据更新不会再通知"+observer.getType());
        }else {
            System.out.println("不存在这个观察者，无法删除");
        }
    }

    @Override
    public void notifyObserver() {
        if (mObservers ==null)
            return;

        for (Observer observer : mObservers){
            observer.update(mTemperature,mPressure,mHumidity);
        }

    }

    public void setMesurements(float temperature , float pressure , float humidity){
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        notifyObserver();
    }

}
