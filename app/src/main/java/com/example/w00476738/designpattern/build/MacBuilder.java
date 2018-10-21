package com.example.w00476738.designpattern.build;

/**
 * Date：2018/10/19
 * Time:15:39
 * Author:wjq
 */
public class MacBuilder extends Builder
{

    private static final String TAG = "MacBuilder";

    MacComputer macComputer = new MacComputer();

    @Override
    public void createBroad(String broad)
    {
        macComputer.setmBroad(broad);
    }

    @Override
    public void createDisplay(String display)
    {
        macComputer.setmDisplay(display);
    }

    @Override
    public void createOS()
    {
        macComputer.setOS();
    }

    @Override
    public Computer createComputer()
    {
        return macComputer;
    }
}
