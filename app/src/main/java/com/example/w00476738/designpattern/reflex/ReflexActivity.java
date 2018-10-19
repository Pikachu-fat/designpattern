package com.example.w00476738.designpattern.reflex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.w00476738.designpattern.R;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflexActivity extends AppCompatActivity
{

    private static final String TAG = "ReflexActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflex);
        //ReflexTest reflexTest = new ReflexTest();
        try
        {
            ReflexTest reflexTest = new ReflexTest();
            Field temp = reflexTest.getClass().getDeclaredField("a");
            temp.setAccessible(true);
            int a = (int) temp.get(reflexTest);
            Log.d(TAG, "onCreate: a==>" + a);
//            reflexTest.setA(15);
//            Log.d(TAG, "onCreate: a==>" + reflexTest.getA());

            Method method = reflexTest.getClass().getDeclaredMethod("setA", int.class);
            method.setAccessible(true);
            method.invoke(reflexTest,20);

            Method method_1 = reflexTest.getClass().getDeclaredMethod("getA",null);
            method_1.setAccessible(true);
            int c = (int) method_1.invoke(reflexTest,null);
            Log.d(TAG, "onCreate: c==>" + c);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
