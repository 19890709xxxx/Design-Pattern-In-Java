package com.my.app.designpattern.Command_Pattern.commands;

import com.my.app.designpattern.Command_Pattern.electrical_appliances.Stereo;

/**
 * @description: 关闭音响命令
 * @author: ouyangxin
 * @date: 2018-10-09 16:23
 * @version: 1.0
 */

public class StereoOffCommand implements Command {
    private Stereo mStereo;

    public StereoOffCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.off();
    }

    @Override
    public void unDo() {

    }
}
