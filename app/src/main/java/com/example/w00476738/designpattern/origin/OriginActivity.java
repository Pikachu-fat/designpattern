package com.example.w00476738.designpattern.origin;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.origin.neworigin.Address;
import com.example.w00476738.designpattern.origin.neworigin.Login;
import com.example.w00476738.designpattern.origin.neworigin.LoginImpl;
import com.example.w00476738.designpattern.origin.neworigin.LoginSession;
import com.example.w00476738.designpattern.origin.neworigin.User;

public class OriginActivity extends AppCompatActivity
{

    private static final String TAG = "OriginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin);


        User loginUser = new User();
        loginUser.age = 22;
        loginUser.name = "Lruc";
        Address address = new Address("南京","江宁区","雨花大道");
        loginUser.setAddress(address);

        Login login = new LoginImpl();
        login.login(loginUser);

        User user = LoginSession.getInstance().getmUser();
        ;
        Log.d(TAG, "onCreate: ----------------------------------start");
        Log.d(TAG, "onCreate: "+user.toString());
        Log.d(TAG, "onCreate: ----------------------------------end");


        Log.d(TAG, "onCreate: ----------------------------------start new");
        user.name = "123";
        User nerUser = LoginSession.getInstance().getmUser();
        Log.d(TAG, "onCreate: "+nerUser.toString());
        Log.d(TAG, "onCreate: ----------------------------------end new");

        Log.d(TAG, "onCreate: ----------------------------------start old");
        Log.d(TAG, "onCreate: "+loginUser.toString());
        Log.d(TAG, "onCreate: ----------------------------------end old");
//        WordDocument originDoc = new WordDocument();
//        originDoc.setText("这是第一个文档");
//        originDoc.setImages("第一张图片");
//        originDoc.setImages("第二张图片" );
//        originDoc.setImages("第三张图片" );
//        Log.d(TAG, "origin: ---------------------------------------------------------");
//        originDoc.showDocument();
//        Log.d(TAG, "origin: ---------------------------------------------------------");
//
//        try
//        {
//            WordDocument cloneDoc = (WordDocument) originDoc.clone();
//            cloneDoc.setText("这是第二个文档");
//            cloneDoc.setImages("这是第四个图片");
//            Log.d(TAG, "clone: ---------------------------------------------------------");
//            cloneDoc.showDocument();
//            Log.d(TAG, "clone: ---------------------------------------------------------");
//
//            Log.d(TAG, "origin: ---------------------------------------------------------");
//            originDoc.showDocument();
//            Log.d(TAG, "origin: ---------------------------------------------------------");
//
//        }
//        catch (CloneNotSupportedException e)
//        {
//            e.printStackTrace();
//        }
    }
}
