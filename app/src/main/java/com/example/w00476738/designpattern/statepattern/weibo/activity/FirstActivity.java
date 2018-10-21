package com.example.w00476738.designpattern.statepattern.weibo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.statepattern.weibo.manager.UserStateManager;
import com.example.w00476738.designpattern.statepattern.weibo.userinterface.LogoutStateImpl;

public class FirstActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button forword = (Button)findViewById(R.id.foward_btn);
        Button logout = (Button)findViewById(R.id.logout_btn);

        forword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                UserStateManager.getInstance().forward(getApplicationContext());
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                UserStateManager.getInstance().setmUserState(new LogoutStateImpl());
            }
        });
    }
}
