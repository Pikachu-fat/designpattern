package com.example.w00476738.designpattern.responsibility.demo1.activity.request;

/**
 * Date：2018/10/21
 * Time:21:15
 * Author:wjq
 */
public class RequestImplThree extends AbstractRequest
{
    public RequestImplThree(Object object)
    {
        super(object);
    }

    @Override
    public int getRequestLevel()
    {
        return 3;
    }
}
