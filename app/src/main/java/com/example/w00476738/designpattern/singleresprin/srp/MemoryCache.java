package com.example.w00476738.designpattern.singleresprin.srp;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Date：2018/10/19
 * Time:9:22
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class MemoryCache implements ImageCache
{

    public static MemoryCache memoryCache = null;
    /**
     * 系统分配最大内存
     */
    long maxMemory = Runtime.getRuntime().maxMemory()/1024;

    /**
     * 内存的四分之一用来缓存图片
     */
    int cacheSize = (int) maxMemory/4;
    private LruCache<String, Bitmap> lruCache;

    public MemoryCache(){
        initImageCache();
    }

    public static MemoryCache getInstance(){
        if (memoryCache == null){
            synchronized (MemoryCache.class){
                if (memoryCache == null){
                    memoryCache = new MemoryCache();
                }
            }
        }
        return memoryCache;
    }

    public void initImageCache(){
        lruCache = new LruCache<String,Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value)
            {
                return value.getRowBytes()*value.getHeight()/1024;
            }
        };
    }

    /**
     * @param url 图片存放地址，也是缓存数组的key
     * @param bitmap
     */
    public void put (String url,Bitmap bitmap){
        lruCache.put(url,bitmap);
    }

    /**
     * @param url
     * @return 返回图片
     */
    public Bitmap get(String url){
        return lruCache.get(url);
    }

}
