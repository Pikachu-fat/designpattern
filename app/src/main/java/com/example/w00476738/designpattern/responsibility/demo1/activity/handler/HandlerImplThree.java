package com.example.w00476738.designpattern.responsibility.demo1.activity.handler;

import android.util.Log;

import com.example.w00476738.designpattern.responsibility.demo1.activity.request.AbstractRequest;

/**
 * Date：2018/10/21
 * Time:21:22
 * Author:wjq
 */
public class HandlerImplThree extends AbstractHandler
{
    private static final String TAG = "HandlerImplThree";
    @Override
    public int getHandlerLevel()
    {
        return 3;
    }

    @Override
    public void handler(AbstractRequest abstractRequest)
    {
        Log.d(TAG, "handler: HandlerImplThree");
    }
}
