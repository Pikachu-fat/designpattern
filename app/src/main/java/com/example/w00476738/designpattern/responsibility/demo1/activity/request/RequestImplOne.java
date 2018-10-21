package com.example.w00476738.designpattern.responsibility.demo1.activity.request;

/**
 * Date：2018/10/21
 * Time:21:14
 * Author:wjq
 */
public class RequestImplOne extends AbstractRequest
{
    public RequestImplOne(Object object)
    {
        super(object);
    }

    @Override
    public int getRequestLevel()
    {
        return 1;
    }
}
