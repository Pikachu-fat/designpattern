package com.example.w00476738.designpattern.abstractfactory.product.tire;

import com.example.w00476738.designpattern.abstractfactory.product.tire.ITire;

/**
 * Date：2018/10/17
 * Time:14:18
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class NormalTire implements ITire {
    @Override
    public String makeTire() {
        return "I am normaltire";
    }
}
