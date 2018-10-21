package com.example.w00476738.designpattern.responsibility.demo1.activity.handler;

import android.util.Log;

import com.example.w00476738.designpattern.responsibility.demo1.activity.request.AbstractRequest;

/**
 * Date：2018/10/21
 * Time:21:08
 * Author:wjq
 */
public abstract class AbstractHandler
{
    private static final String TAG = "AbstractHandler";
    public AbstractHandler nextHandler;
    public abstract int getHandlerLevel();

    public void handlerRequest(AbstractRequest abstractRequest){
        if (String.valueOf(getHandlerLevel()).equals(String.valueOf(abstractRequest.getRequestLevel()))){
            handler(abstractRequest);
        } else if (nextHandler != null){
            nextHandler.handlerRequest(abstractRequest);
        } else {
            Log.d(TAG, "handlerRequest: request is not handler");
        }
    }

    public abstract void handler(AbstractRequest abstractRequest);
}
