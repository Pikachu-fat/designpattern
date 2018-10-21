package com.example.w00476738.designpattern.origin.neworigin;

/**
 * Date：2018/10/21
 * Time:11:26
 * Author:wjq
 */
public class LoginImpl implements Login
{
    @Override
    public void login()
    {
        User loginUser = new User();
        loginUser.age = 22;
        loginUser.name = "Lruc";
        Address address = new Address("南京","江宁区","雨花大道");
        loginUser.setAddress(address);
        LoginSession.getInstance().setmLoginUser(loginUser);
    }

    @Override
    public void login(User user)
    {
        LoginSession.getInstance().setmLoginUser(user);
    }
}
