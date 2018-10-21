package com.example.w00476738.designpattern.origin.neworigin;

/**
 * Date：2018/10/21
 * Time:11:29
 * Author:wjq
 */
public class LoginSession
{
    private static LoginSession mLoginSessio = null;
    private User mUser;
    private LoginSession(){}

    public static LoginSession getInstance(){
        if (mLoginSessio == null){
            synchronized (LoginSession.class){
                if (mLoginSessio == null){
                    mLoginSessio = new LoginSession();
                }
            }
        }
        return mLoginSessio;
    }

    void setmLoginUser(User user){
        this.mUser = user;
    }

    public User getmUser()
    {
        try
        {
            return mUser.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
