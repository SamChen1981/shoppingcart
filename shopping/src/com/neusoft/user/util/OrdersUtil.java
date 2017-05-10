package com.neusoft.user.util;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * 主要是用于接收订单SEQ返回值的类
 * Created by xiyem on 2017/3/25.
 */
public class OrdersUtil {

    private long orid;
    private long userid;
    private String cretime;
    private int state;
    private double allprice;

    private List<OrdersListUtil> list;

    public OrdersUtil() {
    }

    public OrdersUtil(long orid, long userid, String cretime, int state, List<OrdersListUtil> list) {
        this.orid = orid;
        this.userid = userid;
        this.cretime = cretime;
        this.state = state;
        this.list = list;
    }

    public long getOrid() {
        return orid;
    }

    public void setOrid(long orid) {
        this.orid = orid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getCretime() {
        return cretime;
    }

    public void setCretime(String cretime) {
        this.cretime = cretime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<OrdersListUtil> getList() {
        return list;
    }

    public void setList(List<OrdersListUtil> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
