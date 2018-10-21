package com.example.w00476738.designpattern.build;

/**
 * Date：2018/10/19
 * Time:15:41
 * Author:wjq
 */
public class Director
{
    Builder builder = null;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Computer getComputer(String mBroad,String display){
        builder.createBroad(mBroad);
        builder.createDisplay(display);
        builder.createOS();
        return builder.createComputer();
    }
}
