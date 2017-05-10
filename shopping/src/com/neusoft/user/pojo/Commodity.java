package com.neusoft.user.pojo;

import com.system.entity.Pojo;

/**
 * 商品表：
 * Created by xiyem on 2017/3/22.
 */
public class Commodity extends Pojo {

    private String comname;
    private long cid;
    private String describe;
    private double price;
    private int stock;

    public Commodity() {
        super();
    }

    public Commodity(String comname, long cid, String describe, double price, int stock) {
        this.comname = comname;
        this.cid = cid;
        this.describe = describe;
        this.price = price;
        this.stock = stock;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
