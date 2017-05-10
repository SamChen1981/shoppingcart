package com.neusoft.user.util;

import com.alibaba.fastjson.JSON;

/**
 * Created by xiyem on 2017/3/27.
 */
public class OrdersListUtil {

    private String cname;
    private double price;
    private int num;

    public OrdersListUtil() {
    }

    public OrdersListUtil(String cname, double price, int num) {
        this.cname = cname;
        this.price = price;
        this.num = num;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
