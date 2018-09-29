package com.my.app.designpattern.Observer_Pattern.screens;

import com.my.app.designpattern.Observer_Pattern.subject.Subject;

/**
 * @description: 气象预测屏幕
 * @author: ouyangxin
 * @date: 2018-09-29 17:49
 * @version: 1.0
 */

public class ForecastScreen extends ScreenBase {

    private boolean firstUpdate = true;

    private float maxtemperature;
    private float minTemperature;
    private float maxPressure;
    private float minPressure;
    private float maxHumidity;
    private float minHumidity;

    public ForecastScreen(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display(float temperature, float pressure, float humidity) {
        if (firstUpdate){
            maxtemperature = temperature;
            minTemperature = temperature;
            maxPressure = pressure;
            minPressure = pressure;
            maxHumidity = humidity;
            minHumidity = humidity;
            firstUpdate =false;
        }else {
            maxtemperature = maxtemperature>temperature?maxtemperature:temperature;
            maxPressure = maxPressure>pressure?maxPressure:pressure;
            maxHumidity = maxHumidity > humidity?maxHumidity:humidity;
            minTemperature = minTemperature<temperature?minTemperature:temperature;
            minPressure = minPressure<pressure?minPressure:pressure;
            minHumidity = minHumidity < humidity?minHumidity:humidity;
        }
        System.out.println("温度： "+minTemperature+"-"+maxtemperature);
        System.out.println("气压： "+minPressure+"-"+maxPressure);
        System.out.println("湿度： "+minHumidity+"-"+maxHumidity);
    }

    @Override
    protected String getTypeNames() {
        return "气象预测屏幕";
    }
}
