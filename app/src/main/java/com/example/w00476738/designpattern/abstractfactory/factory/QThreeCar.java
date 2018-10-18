package com.example.w00476738.designpattern.abstractfactory.factory;

import com.example.w00476738.designpattern.abstractfactory.product.brake.IBrake;
import com.example.w00476738.designpattern.abstractfactory.product.brake.NormalBrake;
import com.example.w00476738.designpattern.abstractfactory.product.engine.DomesticEngine;
import com.example.w00476738.designpattern.abstractfactory.product.engine.IEngine;
import com.example.w00476738.designpattern.abstractfactory.product.tire.ITire;
import com.example.w00476738.designpattern.abstractfactory.product.tire.NormalTire;

/**
 * Date：2018/10/17
 * Time:14:25
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class QThreeCar implements ICar {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
