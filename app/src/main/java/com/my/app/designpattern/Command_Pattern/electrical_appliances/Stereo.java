package com.my.app.designpattern.Command_Pattern.electrical_appliances;

/**
 * @description: 音响
 * @author: ouyangxin
 * @date: 2018-10-09 16:13
 * @version: 1.0
 */

public class Stereo extends ElectricalApplianceBase {

    public void on(){
        System.out.println("打开音响");
    }

    public void off(){
        System.out.println("关闭音响");
    }

    public void setCD(){
        System.out.println("播放CD");
    }

    public void setVolume(int volume){
        System.out.println("设置音量为 ："+ volume);
    }
}
