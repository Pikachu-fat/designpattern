package com.example.w00476738.designpattern.origin.neworigin;

/**
 * Date：2018/10/21
 * Time:11:23
 * Author:wjq
 */
public class User implements Cloneable
{
    public int age;
    public String name;
    Address address;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException
    {
        User user = null;
        return user = (User) super.clone();
    }

    @Override
    public String toString()
    {
        return "age==>"+age+"\n"+
                "name==>"+name+"\n"+
                address.toString();
    }
}
