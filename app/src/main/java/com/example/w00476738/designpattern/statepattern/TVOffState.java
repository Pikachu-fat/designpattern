package com.example.w00476738.designpattern.statepattern;

import android.util.Log;

/**
 * Date：2018/10/21
 * Time:16:22
 * Author:wjq
 */
public class TVOffState implements TVState
{
    private static final String TAG = "TVOffState";
    @Override
    public void nextChannel()
    {
        Log.d(TAG, "nextChannel: ");
    }

    @Override
    public void prevChannel()
    {
        Log.d(TAG, "prevChannel: ");
    }

    @Override
    public void turnUp()
    {
        Log.d(TAG, "turnUp: ");
    }

    @Override
    public void turnDown()
    {
        Log.d(TAG, "turnDown: ");
    }
}
