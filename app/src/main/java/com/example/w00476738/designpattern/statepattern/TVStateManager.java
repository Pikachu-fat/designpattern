package com.example.w00476738.designpattern.statepattern;

import android.util.Log;

/**
 * Date：2018/10/21
 * Time:16:38
 * Author:wjq
 */
public class TVStateManager
{
    private static final String TAG = "TVStateManager";
    public static TVStateManager mTVStateManager = null;
    TVState currentTvState = null;
    TVState prevTvState = null;
    private TVStateManager(){}

    public static TVStateManager getInstance(){
        if (mTVStateManager == null){
            synchronized (TVStateManager.class){
                if (mTVStateManager == null){
                    mTVStateManager = new TVStateManager();
                }
            }
        }
        return mTVStateManager;
    }


    public void setCurrentState(TVState tvState){
        if (tvState == null){
            Log.d(TAG, "setCurrentState: tvstate is null");
            return;
        }
        prevTvState = currentTvState;
        currentTvState = tvState;
    }

    public TVState getTVState(){
        if (mTVStateManager == null){
            Log.d(TAG, "getTVState: currenttv is null");
            return null;
        }
        return currentTvState;
    }

}
