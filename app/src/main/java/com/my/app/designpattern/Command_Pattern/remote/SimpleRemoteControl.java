package com.my.app.designpattern.Command_Pattern.remote;

import com.my.app.designpattern.Command_Pattern.commands.Command;

/**
 * @description: 只有一个功能槽的
 * @author: ouyangxin
 * @date: 2018-10-08 23:36
 * @version: 1.0
 */

public class SimpleRemoteControl {

    private Command mCommand;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void buttonPressed(){
        if (mCommand!=null)
            mCommand.execute();
    }
}
