package com.my.app.designpattern.Command_Pattern.commands;

import com.my.app.designpattern.Command_Pattern.electrical_appliances.Light;

/**
 * @description: 关掉电灯命令
 * @author: ouyangxin
 * @date: 2018-10-08 22:57
 * @version: 1.0
 */

public class LightOffCommand implements Command{
    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void unDo() {

    }
}
