package com.example.w00476738.designpattern.statepattern.weibo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.statepattern.weibo.manager.UserStateManager;
import com.example.w00476738.designpattern.statepattern.weibo.userinterface.LoginedStateImpl;

public class LoginActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText userName = (EditText) findViewById(R.id.username);
        final EditText edtPassword = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String username = userName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                boolean result = login(username, password);
                if (result)
                {
                    finish();
                }
            }
        });
    }

    private boolean login(String username, String password)
    {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "username or password can not null", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if ("123456".equals(username) && "123456".equals(password))
        {
            UserStateManager.getInstance().setmUserState(new LoginedStateImpl());
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
