package com.example.w00476738.designpattern.build;

/**
 * Date：2018/10/19
 * Time:15:36
 * Author:wjq
 */
public abstract class Builder
{
    public abstract void createBroad(String broad);
    public abstract void createDisplay(String display);
    public abstract void createOS();
    public abstract Computer createComputer();

}
