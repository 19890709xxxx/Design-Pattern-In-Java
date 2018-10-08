package com.my.app.designpattern.Command_Pattern.electrical_appliances;

/**
 * @description: 电灯
 * @author: ouyangxin
 * @date: 2018-10-08 23:03
 * @version: 1.0
 */

public class Light  extends ElectricalApplianceBase{
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+"开灯");
    }

    public void off(){
        System.out.println(name+"关灯");
    }

}
