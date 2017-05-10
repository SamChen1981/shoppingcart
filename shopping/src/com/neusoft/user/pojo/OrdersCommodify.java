package com.neusoft.user.pojo;

import com.system.entity.Pojo;

/**
 * Created by xiyem on 2017/3/25.
 */
public class OrdersCommodify extends Pojo {

    private long ocid;
    private int num;

    public OrdersCommodify() {
    }

    public OrdersCommodify(long ocid, int num) {
        this.ocid = ocid;
        this.num = num;
    }

    public long getCid() {
        return ocid;
    }

    public void setCid(long cid) {
        this.ocid = cid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
