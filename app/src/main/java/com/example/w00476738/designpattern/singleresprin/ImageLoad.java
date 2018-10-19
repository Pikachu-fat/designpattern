package com.example.w00476738.designpattern.singleresprin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.util.Log;
import android.util.LruCache;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Date：2018/10/18
 * Time:8:56
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class ImageLoad
{


    private static final String TAG = "ImageLoad";
    /**
     * 跟cpu核数相同的线程
     */

    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime()
            .availableProcessors());


    /**
     * 展示图片使用
     * @param url
     * @param imageView
     */
    public void displayBitmap(final String url, final ImageView imageView)
    {
        Bitmap bitmap = ImageCache.getInstance().get(url);
        if ( bitmap!= null){
            imageView.setImageBitmap(bitmap);
        }
        imageView.setTag(url);
        executorService.submit(new Runnable()
        {
            @Override
            public void run()
            {
                Bitmap bitmap = downloadBitmap(url);
                if (bitmap == null)
                {
                    Log.d(TAG, "displayBitmap: bitmap is null");
                }
                if (url.equals(imageView.getTag()))
                {
                    imageView.setImageBitmap(bitmap);
                }
                ImageCache.getInstance().put(url,bitmap);
            }
        });
    }

    /**
     * 通过http请求下载图片
     *
     * @param url
     * @return
     */
    private Bitmap downloadBitmap(String url)
    {
        Bitmap bitmap = null;
        try
        {
            URL newUrl = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) (newUrl.openConnection());
            bitmap = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            httpURLConnection.disconnect();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return bitmap;
    }


}