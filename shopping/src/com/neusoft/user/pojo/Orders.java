package com.neusoft.user.pojo;

import com.system.entity.Pojo;

import java.util.List;

/**
 * 订单表
 * Created by xiyem on 2017/3/22.
 */
public class Orders extends Pojo {

    private long userid;
    private String createtime;
    private int state;
    private double price;
    private long cmid;

    private String statime;
    private String endtime;
    private double staprice;
    private double endprice;

    public String getStatime() {
        return statime;
    }

    public void setStatime(String statime) {
        this.statime = statime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public double getStaprice() {
        return staprice;
    }

    public void setStaprice(double staprice) {
        this.staprice = staprice;
    }

    public double getEndprice() {
        return endprice;
    }

    public void setEndprice(double endprice) {
        this.endprice = endprice;
    }

    private List<OrdersCommodify> list;

    public Orders() {
        super();
    }

    public Orders(long userid, int state, double price, long cmid) {
        this.userid = userid;
        this.state = state;
        this.price = price;
        this.cmid = cmid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCmid() {
        return cmid;
    }

    public void setComid(long cmid) {
        this.cmid = cmid;
    }

    public void setCmid(long cmid) {
        this.cmid = cmid;
    }

    public List<OrdersCommodify> getList() {
        return list;
    }

    public void setList(List<OrdersCommodify> list) {
        this.list = list;
    }
}
