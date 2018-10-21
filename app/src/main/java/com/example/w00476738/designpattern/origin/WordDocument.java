package com.example.w00476738.designpattern.origin;

import android.util.Log;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

/**
 * Date：2018/10/21
 * Time:10:24
 * Author:wjq
 */
public class WordDocument implements Cloneable
{

    private static final String TAG = "WordDocument";
    private String text;
    private ArrayList<String> images = new ArrayList<>();

    public WordDocument()
    {
        Log.d(TAG, "WordDocument: 构造函数执行了");
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public List<String> getImages()
    {
        return images;
    }

    public void setImages(String image)
    {
        images.add(image);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        WordDocument doc = (WordDocument) super.clone();
        doc.text = this.text;
        doc.images = (ArrayList<String>) this.images.clone();
        return doc;
    }

    public void showDocument()
    {
        Log.d(TAG, "showDocument: shart:" + "\n");
        Log.d(TAG, "text==>: " + text);
        Log.d(TAG, "showDocument: images:");
        for (String image : images)
        {
            Log.d(TAG, "image==>: " + image);
        }
        Log.d(TAG, "showDocument: end");
    }
}
