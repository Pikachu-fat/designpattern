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
    int maxMemory = (int) Runtime.getRuntime().maxMemory() / 1024;

    /**
     * 内存的四分之一用来缓存图片
     */
    int cacheSize = maxMemory / 4;
    private LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(cacheSize){
        @Override
        protected int sizeOf(String key, Bitmap value)
        {
            return value.getRowBytes()*value.getHeight()/1024;
        }
    };


    public void displayBitmap(final String url, final ImageView imageView)
    {
        executorService.submit(new Runnable() {
            @Override
            public void run()
            {
                imageView.setTag(url);
                Bitmap bitmap = downloadBitmap(url);
                if (bitmap == null){
                    Log.d(TAG, "displayBitmap: bitmap is null");
                }
                if (url.equals(imageView.getTag())){
                    imageView.setImageBitmap(bitmap);
                }
                lruCache.put(url,bitmap);
            }
        });
    }

    /**
     * 通过http请求下载图片
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