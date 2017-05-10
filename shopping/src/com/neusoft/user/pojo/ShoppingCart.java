package com.neusoft.user.pojo;

import com.system.entity.Pojo;

/**
 * 购物车类
 * Created by xiyem on 2017/3/22.
 */
public class ShoppingCart extends Pojo {

    private long userid;
    private long shopping;
    private int num;
    private double price;

    public ShoppingCart() {
    }

    public ShoppingCart(long userid, long shopping, int num, double price) {
        this.userid = userid;
        this.shopping = shopping;
        this.num = num;
        this.price = price;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public long getShopping() {
        return shopping;
    }

    public void setShopping(long shopping) {
        this.shopping = shopping;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
