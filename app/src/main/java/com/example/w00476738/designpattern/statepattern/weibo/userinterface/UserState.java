package com.example.w00476738.designpattern.statepattern.weibo.userinterface;

import android.content.Context;

/**
 * Date：2018/10/21
 * Time:19:08
 * Author:wjq
 */
public interface UserState
{
    public void forward(Context context);
    public void comment(Context context);
}
