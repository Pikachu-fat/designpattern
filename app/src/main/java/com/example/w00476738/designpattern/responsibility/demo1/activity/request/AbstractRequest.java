package com.example.w00476738.designpattern.responsibility.demo1.activity.request;

/**
 * Date：2018/10/21
 * Time:21:10
 * Author:wjq
 */
public abstract class AbstractRequest
{
    Object object;

    public AbstractRequest(Object object){
        this.object = object;
    }

    public Object getObject()
    {
        return object;
    }

    public abstract int getRequestLevel();
}
