package com.example.w00476738.designpattern.singleresprin.srp;

import android.graphics.Bitmap;

/**
 * Date：2018/10/19
 * Time:13:33
 * Author:wjq
 */
public class DoubleCache implements ImageCache
{

    private MemoryCache mMemory = new MemoryCache();
    private DiskCache mDiskMemory = new DiskCache();

    @Override
    public void put(String url, Bitmap bitmap)
    {
        mMemory.put(url,bitmap);
        mDiskMemory.put(url,bitmap);
    }

    @Override
    public Bitmap get(String url)
    {
        Bitmap bitmap = mMemory.get(url);
        if ( bitmap == null){
            bitmap = mDiskMemory.get(url);
        }
        return bitmap;
    }
}
