package com.example.w00476738.designpattern.origin.neworigin;

/**
 * Date：2018/10/21
 * Time:11:23
 * Author:wjq
 */
public class Address
{
    String city;
    String distric;
    String street;

    public Address(String city, String distric, String street)
    {
        this.city = city;
        this.distric = distric;
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getDistric()
    {
        return distric;
    }

    public void setDistric(String distric)
    {
        this.distric = distric;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    @Override
    public String toString()
    {
        return "Address{" + "city='" + city + '\'' + ", distric='" + distric + '\'' + ", " +
                "street='" + street + '\'' + '}';
    }
}
