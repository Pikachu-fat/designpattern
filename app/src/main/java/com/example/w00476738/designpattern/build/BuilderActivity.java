package com.example.w00476738.designpattern.build;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.w00476738.designpattern.R;

public class BuilderActivity extends AppCompatActivity
{

    private Button builder;
    private TextView buildShow;
    private Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        initView();
    }


    public void initView()
    {
        builder = (Button) findViewById(R.id.build);
        buildShow = (TextView) findViewById(R.id.build_show);
        builder.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                MacBuilder macBuilder = new MacBuilder();
                Director mDirector = new Director(macBuilder);
                computer = mDirector.getComputer("boss board", "LG display");
                buildShow.setText(computer.toString());
            }
        });


    }
}
