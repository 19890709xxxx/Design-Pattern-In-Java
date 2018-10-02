package com.my.app.designpattern.Singleton_Pattern;

/**
 * @description: 闹钟单例
 * @author: ouyangxin
 * @date: 2018-10-03 01:29
 * @version: 1.0
 */

public class ClockSingleton {

    private volatile static ClockSingleton instance;

    /**
     * 使用双重检查加锁 ，减少getInstance使用同步，减少因为同步造成的性能损耗
     *
     * volatile 关键字确保在多线程中， instance 初始化为ClockSingleton时，其他线程的instance变量也同时变成ClockSingleton对象
     */
    public static ClockSingleton getInstance(){
        if (instance ==null){
            synchronized (ClockSingleton.class){//进程同步，防止多个线程同时调用导致生成多个对象
                if (instance ==null)
                    instance = new ClockSingleton();
            }
        }
        return instance;
    }

}
