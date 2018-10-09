package com.my.app.designpattern.Command_Pattern.remote;

import com.my.app.designpattern.Command_Pattern.commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 超级遥控器
 * @author: ouyangxin
 * @date: 2018-10-09 12:10
 * @version: 1.0
 */

public class SuperRemoteControl {
    private List<Command> mLeftCommands;
    private List<Command> mRightCommands;

    public SuperRemoteControl() {
        mLeftCommands = new ArrayList<>();
        mRightCommands = new ArrayList<>();

    }

    public void setLeftCommands(int index , Command leftCommand , Command rightCommand){
        mLeftCommands.add(leftCommand);
        mRightCommands.add(rightCommand);
    }

    public void onLeftButtonPressed(int index){
        if (mLeftCommands!=null&&mLeftCommands.get(index)!=null)
            mLeftCommands.get(index).execute();
    }

    public void onRightButtonPressed(int index){
        if (mRightCommands !=null&&mRightCommands.get(index)!=null)
            mRightCommands.get(index).execute();
    }
}
