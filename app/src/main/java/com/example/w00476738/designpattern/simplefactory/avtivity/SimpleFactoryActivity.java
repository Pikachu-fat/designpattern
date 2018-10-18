package com.example.w00476738.designpattern.simplefactory.avtivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.w00476738.designpattern.R;
import com.example.w00476738.designpattern.simplefactory.factory.SimpleFactory;
import com.example.w00476738.designpattern.simplefactory.products.DBStorage;
import com.example.w00476738.designpattern.simplefactory.products.FileStorage;
import com.example.w00476738.designpattern.simplefactory.products.XMLStorage;

public class SimpleFactoryActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "SimpleFactoryActivity";
    private Button fileStorage;
    private Button xmlStorage;
    private Button dbStorage;
    private TextView resultShow;
    private String queryContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        initView();
    }

    private void initView(){
        fileStorage = (Button)findViewById(R.id.file_storage);
        xmlStorage = (Button)findViewById(R.id.xml_storage);
        dbStorage = (Button)findViewById(R.id.db_storage);

        fileStorage.setOnClickListener(this);
        xmlStorage.setOnClickListener(this);
        dbStorage.setOnClickListener(this);

        resultShow = (TextView)findViewById(R.id.result_show);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.file_storage:
                queryContent = SimpleFactory.createProducts(FileStorage.class).query("file");
                resultShow.setText(queryContent);
                break;
            case R.id.xml_storage:
                queryContent = SimpleFactory.createProducts(XMLStorage.class).query("xml");
                resultShow.setText(queryContent);
                break;
            case R.id.db_storage:
                queryContent = SimpleFactory.createProducts(DBStorage.class).query("db");
                resultShow.setText(queryContent);
                break;
                default:break;
        }

    }
}
