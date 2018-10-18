package com.example.w00476738.designpattern.simplefactory.products;

/**
 * Date：2018/10/17
 * Time:10:16
 * Author:w00476738<weijianqiang@huawei.com>
 */
public abstract class IOHandler {
    /**用户名的id*/
    private String id;

    /**用户后的名字*/
    private String name;

    /**
     * 添加用户信息
     * @param id
     * @param name
     */
    public abstract void add(String id,String name);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    public abstract boolean delete(String id);

    /**
     * 更新用户信息
     * @param id
     * @param name
     */
    public abstract void update(String id,String name);

    /**查看用户信息
     * @param id
     * @return
     */
    public abstract String query(String id);
}
