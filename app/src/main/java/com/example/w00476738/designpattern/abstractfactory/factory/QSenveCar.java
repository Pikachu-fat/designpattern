package com.example.w00476738.designpattern.abstractfactory.factory;

import com.example.w00476738.designpattern.abstractfactory.product.brake.IBrake;
import com.example.w00476738.designpattern.abstractfactory.product.brake.SeniorBrake;
import com.example.w00476738.designpattern.abstractfactory.product.engine.IEngine;
import com.example.w00476738.designpattern.abstractfactory.product.engine.ImportEngine;
import com.example.w00476738.designpattern.abstractfactory.product.tire.ITire;
import com.example.w00476738.designpattern.abstractfactory.product.tire.SUVTire;

/**
 * Date：2018/10/17
 * Time:14:26
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class QSenveCar implements ICar {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
