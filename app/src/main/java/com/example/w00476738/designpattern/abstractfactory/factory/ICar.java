package com.example.w00476738.designpattern.abstractfactory.factory;

import com.example.w00476738.designpattern.abstractfactory.product.brake.IBrake;
import com.example.w00476738.designpattern.abstractfactory.product.engine.IEngine;
import com.example.w00476738.designpattern.abstractfactory.product.tire.ITire;

/**
 * Date：2018/10/17
 * Time:14:13
 * Author:w00476738<weijianqiang@huawei.com>
 */
public interface ICar {
    public ITire createTire();
    public IEngine createEngine();
    public IBrake createBrake();
}
