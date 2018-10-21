package com.example.w00476738.designpattern.responsibility.demo1.activity.handler;

import android.util.Log;

import com.example.w00476738.designpattern.responsibility.demo1.activity.request.AbstractRequest;

/**
 * Date：2018/10/21
 * Time:21:21
 * Author:wjq
 */
public class HandlerImplOne extends AbstractHandler
{
    private static final String TAG = "HandlerImplOne";
    @Override
    public int getHandlerLevel()
    {
        return 1;
    }

    @Override
    public void handler(AbstractRequest abstractRequest)
    {
        Log.d(TAG, "handler:HandlerImplOne ");
    }
}
