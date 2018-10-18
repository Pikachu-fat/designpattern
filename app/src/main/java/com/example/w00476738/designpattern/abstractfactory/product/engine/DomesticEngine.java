package com.example.w00476738.designpattern.abstractfactory.product.engine;

/**
 * Date：2018/10/17
 * Time:14:21
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class DomesticEngine implements IEngine {
    @Override
    public String makeEngine() {
        return "I am domestic engine";
    }
}
