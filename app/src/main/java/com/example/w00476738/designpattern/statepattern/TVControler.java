package com.example.w00476738.designpattern.statepattern;

/**
 * Date：2018/10/21
 * Time:16:23
 * Author:wjq
 */
public class TVControler
{
    public TVState mTvState = null;
    public static TVControler mTvControler;

    private TVControler(TVState mTvState){
        this.mTvState = mTvState;
    }

    public static TVControler getInstance(TVState mTvState){
        if (mTvControler == null){
            synchronized (TVControler.class){
                if (mTvControler == null){
                    mTvControler = new TVControler(mTvState);
                }
            }
        }
        return mTvControler;
    }

    public static TVControler getInstance(){
        return mTvControler;
    }

    public void setTVState(TVState mTvState){
        this.mTvState = mTvState;
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void  prevChannel(){
        mTvState.prevChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
