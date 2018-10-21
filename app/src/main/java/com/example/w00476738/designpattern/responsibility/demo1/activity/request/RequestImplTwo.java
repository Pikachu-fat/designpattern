package com.example.w00476738.designpattern.responsibility.demo1.activity.request;

/**
 * Date：2018/10/21
 * Time:21:14
 * Author:wjq
 */
public class RequestImplTwo extends AbstractRequest
{
    public RequestImplTwo(Object object)
    {
        super(object);
    }

    @Override
    public int getRequestLevel()
    {
        return 2;
    }
}
