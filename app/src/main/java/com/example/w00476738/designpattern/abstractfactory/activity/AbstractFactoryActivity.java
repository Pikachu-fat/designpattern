package com.example.w00476738.designpattern.abstractfactory.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.abstractfactory.factory.QSenveCar;
import com.example.w00476738.designpattern.abstractfactory.factory.QThreeCar;

public class AbstractFactoryActivity extends AppCompatActivity {

    private static final String TAG = "AbstractFactoryActivity";
    private Button q3;
    private Button q7;
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        initView();
    }

    public void initView(){
        q3 = (Button)findViewById(R.id.q3);
        q7 = (Button)findViewById(R.id.q7);

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QThreeCar qThreeCar = new QThreeCar();
                stringBuffer.append(qThreeCar.createTire().makeTire()+"\n");
                stringBuffer.append(qThreeCar.createEngine().makeEngine()+"\n");
                stringBuffer.append(qThreeCar.createBrake().makeBrake()+"\n");
                Log.d(TAG, "Q3:"+"\n");
                Log.d(TAG, stringBuffer.toString());
                Log.d(TAG, "======================================================");

            }
        });

        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QSenveCar qSenveCar = new QSenveCar();
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(qSenveCar.createTire().makeTire()+"\n");
                stringBuffer.append(qSenveCar.createEngine().makeEngine()+"\n");
                stringBuffer.append(qSenveCar.createBrake().makeBrake()+"\n");
                Log.d(TAG, "Q7:"+"\n");
                Log.d(TAG, stringBuffer.toString());
            }
        });
    }
}
