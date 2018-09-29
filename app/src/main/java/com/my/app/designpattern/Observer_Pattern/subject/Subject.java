package com.my.app.designpattern.Observer_Pattern.subject;

import com.my.app.designpattern.Observer_Pattern.observers.Observer;

/**
 * @description: 主题接口
 * @author: ouyangxin
 * @date: 2018-09-29 16:34
 * @version: 1.0
 */

public interface Subject {

    void registerObserver(Observer observer);//注册观察者

    void removeObserver(Observer observer);//移除观察者

    void notifyObserver();//数据改变通知所有观察者

}
