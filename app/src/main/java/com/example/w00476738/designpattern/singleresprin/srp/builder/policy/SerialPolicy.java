package com.example.w00476738.designpattern.singleresprin.srp.builder.policy;

/**
 * Date：2018/10/19
 * Time:17:10
 * Author:wjq
 */
public class SerialPolicy implements LoadPolicy
{
    @Override
    public String make()
    {
        return "I am serialpolicy";
    }
}
