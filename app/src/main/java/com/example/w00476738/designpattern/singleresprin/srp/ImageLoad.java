package com.example.w00476738.designpattern.singleresprin.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

import com.example.w00476738.designpattern.singleresprin.srp.builder.DisplayConfig;
import com.example.w00476738.designpattern.singleresprin.srp.builder.ImageLoadConfigation;
import com.example.w00476738.designpattern.singleresprin.srp.builder.policy.LoadPolicy;

import java.net.HttpURLConnection;
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
    private ImageCache imageCache;
    private ImageLoadConfigation imageLoadConfigation;
    private int threadCount = 1;
    private DisplayConfig displayConfig;
    private LoadPolicy loadPolicy;

    /**
     * 跟cpu核数相同的线程
     */

    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime()
            .availableProcessors());



    public void initImageLoad(ImageLoadConfigation imageLoadConfigation){
        this.imageLoadConfigation = imageLoadConfigation;
        checkConfig(imageLoadConfigation);
    }

    private void checkConfig(ImageLoadConfigation imageLoadConfigation)
    {
        this.imageCache = imageLoadConfigation.getmImageCache();
        this.displayConfig = imageLoadConfigation.getDisplayConfig();
        this.loadPolicy = imageLoadConfigation.getLoadPolicy();
        this.threadCount = imageLoadConfigation.getThreadCount();
    }

    /**
     * 展示图片使用
     *
     * @param url
     * @param imageView
     */
    public void displayBitmap(final String url, final ImageView imageView)
    {
        Bitmap bitmap = imageCache.get(url);
        //Bitmap bitmap = MemoryCache.getInstance().get(url);
        if (bitmap != null)
        {
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
                imageCache.put(url,bitmap);

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