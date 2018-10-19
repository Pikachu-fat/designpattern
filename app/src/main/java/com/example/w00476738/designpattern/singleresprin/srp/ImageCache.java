package com.example.w00476738.designpattern.singleresprin.srp;

import android.graphics.Bitmap;

/**
 * Date：2018/10/19
 * Time:12:00
 * Author:wjq
 */
public interface ImageCache
{
    public void put(String url,Bitmap bitmap);
    public Bitmap get(String url);
}
