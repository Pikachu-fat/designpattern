package com.example.w00476738.designpattern.statepattern.weibo.userinterface;

import android.content.Context;
import android.widget.Toast;

/**
 * Date：2018/10/21
 * Time:19:09
 * Author:wjq
 */
public class LoginedStateImpl implements UserState
{
    @Override
    public void forward(Context context)
    {
        Toast.makeText(context,"已登录，开始转发了",Toast.LENGTH_LONG).show();
    }

    @Override
    public void comment(Context context)
    {
        Toast.makeText(context, "已登录，开始评论了", Toast.LENGTH_SHORT).show();
    }
}
