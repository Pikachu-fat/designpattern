package com.example.w00476738.designpattern.simplefactory.products;

/**
 * Date：2018/10/17
 * Time:10:30
 * Author:w00476738<weijianqiang@huawei.com>
 */
public class FileStorage extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
        return "filestorage";
    }
}
