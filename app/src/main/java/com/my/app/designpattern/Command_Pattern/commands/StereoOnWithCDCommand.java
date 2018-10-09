package com.my.app.designpattern.Command_Pattern.commands;

import com.my.app.designpattern.Command_Pattern.electrical_appliances.Stereo;

/**
 * @description: 打开音响并播放CD 命令
 * @author: ouyangxin
 * @date: 2018-10-09 16:21
 * @version: 1.0
 */

public class StereoOnWithCDCommand implements Command {
    private Stereo mStereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.on();
        mStereo.setCD();
        mStereo.setVolume(11);
    }

    @Override
    public void unDo() {

    }
}
