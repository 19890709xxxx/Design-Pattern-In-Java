package com.my.app.designpattern.Observer_Pattern;

import com.my.app.designpattern.Observer_Pattern.screens.CurrentConditionsScreen;
import com.my.app.designpattern.Observer_Pattern.screens.ForecastScreen;
import com.my.app.designpattern.Observer_Pattern.screens.ScreenBase;
import com.my.app.designpattern.Observer_Pattern.screens.StatisticsScreen;
import com.my.app.designpattern.Observer_Pattern.subject.WeatherDataSubject;

/**
 * @description: 观察者模式测试类
 * @author: ouyangxin
 * @date: 2018-09-29 16:08
 * @version: 1.0
 *
 * 观察者模式 ，松耦合方式的代表， 定义了一系列对象之间一对多的关系，当一个对象改变状态时，其他订阅者会接收到通知
 *
 * 用例：建造一个 气象站，如果气象数据发生变化，所有气象显示屏上的数据会实时更新
 *
 * 拓展：Java本身也有内置观察者模式，Observable 类，注意，Java里的Observable是一个类
 * 而不是一个接口，这意味着我们要使用Java的观察者模式，就必须继承Observable 类，但是，Observable 类还将关键方法保护了起来，
 * 比如setChange()方法，这意味着除非你继承自Observable 类，否则你无法创建Observable 实例并组合到自己的对象中来，
 * 这不符合我们所提倡的多用组合，少用继承的编程思维，
 * 而且如果你继承了Observable 类，就无法继承其他超类，因为Java不支持多重继承，这就限制了Observable 的复用潜力
 */

public class ObserverTest {

    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        ScreenBase currentConditionsScreen = new CurrentConditionsScreen(weatherDataSubject);
        ScreenBase statisticsScreen = new StatisticsScreen(weatherDataSubject);
        ScreenBase forecastScreen = new ForecastScreen(weatherDataSubject);

        weatherDataSubject.setMesurements(25,30,50);
        weatherDataSubject.setMesurements(15,20,30);
        weatherDataSubject.setMesurements(20,70,10);

        weatherDataSubject.removeObserver(forecastScreen);//解除 数据统计屏幕 的订阅

        weatherDataSubject.setMesurements(20,70,10);

        weatherDataSubject.removeObserver(forecastScreen);//再次解除 数据统计屏幕 的订阅，看看会不会报错
    }

}
