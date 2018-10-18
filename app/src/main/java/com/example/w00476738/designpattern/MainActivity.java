package com.example.w00476738.designpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.w00476738.designpattern.abstractfactory.activity.AbstractFactoryActivity;
import com.example.w00476738.designpattern.simplefactory.avtivity.SimpleFactoryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button simpleFactory;
    private Intent intent;
    private Button abstrackFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        simpleFactory = (Button)findViewById(R.id.simple_factory);
        abstrackFactory = (Button)findViewById(R.id.abstract_factory);
        simpleFactory.setOnClickListener(this);
        abstrackFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.simple_factory:
                intent = new Intent(MainActivity.this,SimpleFactoryActivity.class);
                startActivity(intent);
                break;
            case R.id.abstract_factory:
                intent = new Intent(this,AbstractFactoryActivity.class);
                startActivity(intent);
            default:break;
        }
    }
}
