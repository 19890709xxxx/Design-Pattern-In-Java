package com.my.app.designpattern.Command_Pattern;

import com.my.app.designpattern.Command_Pattern.commands.LightOffCommand;
import com.my.app.designpattern.Command_Pattern.commands.LightOnCommand;
import com.my.app.designpattern.Command_Pattern.commands.StereoOffCommand;
import com.my.app.designpattern.Command_Pattern.commands.StereoOnWithCDCommand;
import com.my.app.designpattern.Command_Pattern.electrical_appliances.Light;
import com.my.app.designpattern.Command_Pattern.electrical_appliances.Stereo;
import com.my.app.designpattern.Command_Pattern.remote.SimpleRemoteControl;
import com.my.app.designpattern.Command_Pattern.remote.SuperRemoteControl;

/**
 * @description: 命令模式测试类
 * @author: ouyangxin
 * @date: 2018-10-08 22:21
 * @version: 1.0
 * 这里是用一个遥控器的例子，把遥控器的按钮都抽出来当作一个个命令，例如：LightOnCommand（开灯命令），
 * 然后命令再绑定一个对应的对象，再在命令的execute()方法实现对象的方法
 * 命令模式是为了解决命令的请求者和命令的实现者之间的耦合关系
 * <p>
 * Command：定义命令的统一接口
 * <p>
 * ConcreteCommand：Command接口的实现者，用来执行具体的命令，某些情况下可以直接用来充当Receiver。
 * <p>
 * Receiver：命令的实际执行者
 * <p>
 * Invoker：命令的请求者，是命令模式中最重要的角色。这个角色用来对各个命令进行控制。
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


        SuperRemoteControl superRemoteControl = new SuperRemoteControl();
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        superRemoteControl.setLeftCommands(0, stereoOnWithCDCommand, stereoOffCommand);
        superRemoteControl.onLeftButtonPressed(0);
        superRemoteControl.onRightButtonPressed(0);

        superRemoteControl.toString();
    }


}
