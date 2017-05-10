package com.neusoft.user.pojo;

import com.system.entity.Pojo;

/**
 * 关系表：(用户ID、订单ID、购物车ID)
 * Created by xiyem on 2017/3/22.
 */
public class Relation extends Pojo{

    private long userid;
    private long oid;
    private long sid;

    public Relation() {
        super();
    }

    public Relation(long userid, long oid, long sid) {
        this.userid = userid;
        this.oid = oid;
        this.sid = sid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

}
