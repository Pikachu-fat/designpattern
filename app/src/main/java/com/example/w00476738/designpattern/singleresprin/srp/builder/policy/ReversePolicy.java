package com.example.w00476738.designpattern.singleresprin.srp.builder.policy;

/**
 * Date：2018/10/19
 * Time:17:11
 * Author:wjq
 */
public class ReversePolicy implements LoadPolicy
{
    @Override
    public String make()
    {
        return "I am reversepolicy";
    }
}
