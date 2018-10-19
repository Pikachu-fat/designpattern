package com.example.w00476738.designpattern.singleresprin.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Date：2018/10/19
 * Time:11:29
 * Author:wjq
 */
public class DiskCache implements ImageCache
{
    private String path = "/sdcard/cache";
    private FileOutputStream fileOutputStream;

    /**
     * 获取图片
     * @param url 图片存储的地址
     * @return
     */
    public Bitmap get(String url){
        return BitmapFactory.decodeFile(url);
    }

    public void put(String url,Bitmap bitmap){
        try
        {
            fileOutputStream = new FileOutputStream(path+File.separator+url);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } finally
        {
            if (fileOutputStream != null){
                try
                {
                    fileOutputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

}
