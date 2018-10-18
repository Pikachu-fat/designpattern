package com.example.w00476738.designpattern.abstractfactory.product.brake;

/**
 * Date：2018/10/17
 * Time:14:23
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class NormalBrake implements IBrake {
    @Override
    public String makeBrake() {
        return "I am normal brake";
    }
}
