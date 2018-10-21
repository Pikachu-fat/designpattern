package com.example.w00476738.designpattern.singleresprin.srp.builder;

import com.example.w00476738.designpattern.singleresprin.srp.ImageCache;
import com.example.w00476738.designpattern.singleresprin.srp.MemoryCache;
import com.example.w00476738.designpattern.singleresprin.srp.builder.policy.LoadPolicy;
import com.example.w00476738.designpattern.singleresprin.srp.builder.policy.SerialPolicy;

/**
 * Date：2018/10/19
 * Time:17:00
 * Author:wjq
 */
public class ImageLoadConfigation
{

     ImageCache mImageCache = new MemoryCache();
     int ThreadCount = Runtime.getRuntime().availableProcessors()+1;
     LoadPolicy loadPolicy = new SerialPolicy();
     DisplayConfig displayConfig = new DisplayConfig();

    private ImageLoadConfigation(){}

    public ImageCache getmImageCache()
    {
        return mImageCache;
    }

    public int getThreadCount()
    {
        return ThreadCount;
    }

    public LoadPolicy getLoadPolicy()
    {
        return loadPolicy;
    }

    public DisplayConfig getDisplayConfig()
    {
        return displayConfig;
    }

    public static class Builder{
        private ImageCache mImageCache = new MemoryCache();
        private int threadCount = Runtime.getRuntime().availableProcessors()+1;
        private LoadPolicy loadPolicy = new SerialPolicy();
        private DisplayConfig displayConfig = new DisplayConfig();

        public Builder setImageCache(ImageCache imageCache){
            this.mImageCache = imageCache;
            return this;
        }

        public Builder setThreadCount(int threadCount){
            this.threadCount = threadCount;
            return this;
        }

        public Builder setLoadPolicy(LoadPolicy loadPolicy){
            this.loadPolicy = loadPolicy;
            return this;
        }

        public Builder setDisplayConfig(DisplayConfig displayConfig){
            this.displayConfig = displayConfig;
            return this;
        }

        public Builder setLoadingHolder(int resId){
            displayConfig.loadingPlaceHolder = resId;
            return this;
        }

        public Builder setNotFoundHolder(int resId){
            displayConfig.loadFailPlaceHolder = resId;
            return this;
        }

        public ImageLoadConfigation create(){
            ImageLoadConfigation configation = new ImageLoadConfigation();
            apply(configation);
            return configation;
        }


        private void apply(ImageLoadConfigation configation)
        {
            configation.displayConfig = displayConfig;
            configation.loadPolicy = loadPolicy;
            configation.mImageCache = mImageCache;
            configation.ThreadCount = threadCount;
        }
    }

}
