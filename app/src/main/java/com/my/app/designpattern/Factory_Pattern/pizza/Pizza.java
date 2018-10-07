package com.my.app.designpattern.Factory_Pattern.pizza;

import com.my.app.designpattern.Factory_Pattern.model.Cheese;
import com.my.app.designpattern.Factory_Pattern.model.Clams;
import com.my.app.designpattern.Factory_Pattern.model.Dough;
import com.my.app.designpattern.Factory_Pattern.model.Pepperoni;
import com.my.app.designpattern.Factory_Pattern.model.Sauce;

/**
 * @description: Pizza
 * @author: ouyangxin
 * @date: 2018-10-05 00:34
 * @version: 1.0
 */

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese mCheese;
    protected Pepperoni mPepperoni;
    protected Clams clam;

    public void prepare(){
        System.out.println("正在准备"+getName());
    }

    public void bake(){
        System.out.println("烤 25分钟");
    }

    public void cut(){
        System.out.println("切 披萨");
    }

    public void box(){
        System.out.println("把披萨装箱");
    }

    public String getName() {
        return name+"披萨";
    }

    public void setName(String name) {
        this.name = name;
    }
}
