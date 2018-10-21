package com.example.w00476738.designpattern.build;

/**
 * Date：2018/10/19
 * Time:15:31
 * Author:wjq
 */
public abstract class Computer
{
    /**
     * 主板
     */
    private String mBroad;
    /**
     * 显示器
     */
    private String mDisplay;
    /**
     * 系统
     */
    public String mOS;

    public void setmBroad(String mBroad)
    {
        this.mBroad = mBroad;
    }

    public void setmDisplay(String mDisplay)
    {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();


    @Override
    public String toString()
    {
        return "broad==>"+mBroad+"\n"
                +"display==>"+mDisplay+"\n"
                +"os==>"+mOS;
    }
}
