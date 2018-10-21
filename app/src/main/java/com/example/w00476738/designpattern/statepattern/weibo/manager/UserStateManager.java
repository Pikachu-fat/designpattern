package com.example.w00476738.designpattern.statepattern.weibo.manager;

import android.content.Context;

import com.example.w00476738.designpattern.origin.neworigin.User;
import com.example.w00476738.designpattern.statepattern.weibo.userinterface.LogoutStateImpl;
import com.example.w00476738.designpattern.statepattern.weibo.userinterface.UserState;

/**
 * Date：2018/10/21
 * Time:19:14
 * Author:wjq
 */
public class UserStateManager
{
    UserState mUserState = new LogoutStateImpl();

    public static UserStateManager mUserStateManager = null;
    private UserStateManager(){}

    public static UserStateManager getInstance(){
        if (mUserStateManager == null){
            synchronized (UserStateManager.class){
                if (mUserStateManager == null){
                    mUserStateManager = new UserStateManager();
                }
            }
        }
        return mUserStateManager;
    }

    public void setmUserState(UserState mUserState){
        this.mUserState = mUserState;
    }

    public void forward(Context context){
        mUserState.forward(context);
    }

    public void comment(Context context){
        mUserState.comment(context);
    }
}
