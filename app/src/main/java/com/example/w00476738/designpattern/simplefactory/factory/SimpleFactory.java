package com.example.w00476738.designpattern.simplefactory.factory;

import com.example.w00476738.designpattern.simplefactory.products.IOHandler;

/**
 * Date：2018/10/17
 * Time:10:15
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class SimpleFactory {

    /**
     * @param cls 需要获取实例的类
     * @param <T>
     * @return
     */
    public static <T extends IOHandler> T createProducts(Class<T> cls) {
        IOHandler ioHandler = null;
        try {
            ioHandler = (T) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }
}
