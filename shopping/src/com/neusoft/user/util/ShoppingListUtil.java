package com.neusoft.user.util;

import com.system.entity.Pojo;

/**
 * Created by xiyem on 2017/3/28.
 */
public class ShoppingListUtil extends Pojo {

    private long comid;
    private long userid;
    private String comname;
    private int cid;
    private String describe;
    private double cprice;
    private int snum;
    private double allprice;

    public ShoppingListUtil() {
    }

    public ShoppingListUtil(long comid, long userid, String comname, int cid, String describe, double cprice, int snum, double allprice) {
        this.comid = comid;
        this.userid = userid;
        this.comname = comname;
        this.cid = cid;
        this.describe = describe;
        this.cprice = cprice;
        this.snum = snum;
        this.allprice = allprice;
    }

    public long getComid() {
        return comid;
    }

    public void setComid(long comid) {
        this.comid = comid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getCprice() {
        return cprice;
    }

    public void setCprice(double cprice) {
        this.cprice = cprice;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public double getAllprice() {
        return allprice;
    }

    public void setAllprice(double allprice) {
        this.allprice = allprice;
    }
}
