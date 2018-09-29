package com.my.app.designpattern.Observer_Pattern.screens;

import com.my.app.designpattern.Observer_Pattern.subject.Subject;

/**
 * @description: 数据统计屏幕
 * @author: ouyangxin
 * @date: 2018-09-29 17:38
 * @version: 1.0
 */

public class StatisticsScreen extends ScreenBase{

    private int updateCounts =1;//数据更新次数
    float temperatureAll =0f;
    float pressureAll =0f;
    float humidityAll =0f;

    public StatisticsScreen(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display(float temperature, float pressure, float humidity) {
        temperatureAll += temperature;
        pressureAll += pressure;
        humidityAll += humidity;

        System.out.println("平均温度 ： "+(temperatureAll/updateCounts)
                + " 平均气压: ： "+(pressureAll/updateCounts)
                + " 平均湿度: "+(humidityAll/updateCounts));

        updateCounts++;
    }

    @Override
    protected String getTypeNames() {
        return "数据统计屏幕";
    }
}
