package com.example.w00476738.designpattern.statepattern.weibo.userinterface;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.w00476738.designpattern.statepattern.weibo.activity.LoginActivity;

/**
 * Date：2018/10/21
 * Time:19:12
 * Author:wjq
 */
public class LogoutStateImpl implements UserState
{
    @Override
    public void forward(Context context)
    {
        Toast.makeText(context, "未登录，不可以转发", Toast.LENGTH_SHORT).show();
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context)
    {
        Toast.makeText(context, "未登录，不可以评论", Toast.LENGTH_SHORT).show();
        gotoLoginActivity(context);
    }
    public void gotoLoginActivity(Context context){
        Intent intent = new Intent(context,LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
