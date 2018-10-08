package com.my.app.designpattern.Command_Pattern;

import com.my.app.designpattern.Command_Pattern.commands.LightOffCommand;
import com.my.app.designpattern.Command_Pattern.commands.LightOnCommand;
import com.my.app.designpattern.Command_Pattern.electrical_appliances.Light;
import com.my.app.designpattern.Command_Pattern.remote.SimpleRemoteControl;

/**
 * @description: 命令模式测试类
 * @author: ouyangxin
 * @date: 2018-10-08 22:21
 * @version: 1.0
 */

public class CommandTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("大厅");
        Light light1 = new Light("厨房");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);


        LightOnCommand lightOnCommand1 = new LightOnCommand(light1);
        LightOffCommand lightOffCommand1 = new LightOffCommand(light1);

        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonPressed();
        simpleRemoteControl.setCommand(lightOnCommand1);
        simpleRemoteControl.buttonPressed();

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonPressed();
        simpleRemoteControl.setCommand(lightOffCommand1);
        simpleRemoteControl.buttonPressed();
    }


}
