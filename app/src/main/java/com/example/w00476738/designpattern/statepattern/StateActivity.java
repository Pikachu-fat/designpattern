package com.example.w00476738.designpattern.statepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.w00476738.designpattern.R;

public class StateActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        Button tvOn = (Button)findViewById(R.id.tv_on);
        final Button tvOff = (Button)findViewById(R.id.tv_off);



        tvOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                TVState tvOnState = new TVOnState();
                TVStateManager.getInstance().setCurrentState(tvOnState);
                TVStateManager.getInstance().getTVState().nextChannel();
                TVStateManager.getInstance().getTVState().prevChannel();
                TVStateManager.getInstance().getTVState().turnUp();
                TVStateManager.getInstance().getTVState().turnDown();
            }
        });

        tvOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                TVOffState tvOffState = new TVOffState();
                TVStateManager.getInstance().setCurrentState(tvOffState);
                TVStateManager.getInstance().getTVState().nextChannel();
                TVStateManager.getInstance().getTVState().prevChannel();
                TVStateManager.getInstance().getTVState().turnUp();
                TVStateManager.getInstance().getTVState().turnDown();
            }
        });
    }
}
