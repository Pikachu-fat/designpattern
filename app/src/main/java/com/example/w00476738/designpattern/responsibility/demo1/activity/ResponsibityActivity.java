package com.example.w00476738.designpattern.responsibility.demo1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.responsibility.demo1.activity.handler.AbstractHandler;
import com.example.w00476738.designpattern.responsibility.demo1.activity.handler.HandlerImplOne;
import com.example.w00476738.designpattern.responsibility.demo1.activity.handler.HandlerImplThree;
import com.example.w00476738.designpattern.responsibility.demo1.activity.handler.HandlerImplTwo;
import com.example.w00476738.designpattern.responsibility.demo1.activity.request.AbstractRequest;
import com.example.w00476738.designpattern.responsibility.demo1.activity.request.RequestImplFour;
import com.example.w00476738.designpattern.responsibility.demo1.activity.request.RequestImplOne;
import com.example.w00476738.designpattern.responsibility.demo1.activity.request.RequestImplThree;
import com.example.w00476738.designpattern.responsibility.demo1.activity.request.RequestImplTwo;

public class ResponsibityActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsibity);

        AbstractHandler handlerone = new HandlerImplOne();
        AbstractHandler handlerTwo = new HandlerImplTwo();
        AbstractHandler handlerThree = new HandlerImplThree();

        handlerone.nextHandler = handlerTwo;
        handlerTwo.nextHandler = handlerThree;

        AbstractRequest requestOne = new RequestImplOne("request");
        AbstractRequest requestTwo = new RequestImplTwo("request2");
        AbstractRequest requestThree = new RequestImplThree("request3");
        AbstractRequest requestFour = new RequestImplFour("request4");

        handlerone.handlerRequest(requestOne);
        handlerone.handlerRequest(requestTwo);
        handlerone.handlerRequest(requestThree);
        handlerone.handlerRequest(requestFour);
    }
}
