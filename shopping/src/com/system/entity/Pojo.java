package com.system.entity;

import com.alibaba.fastjson.JSON;

/**
 * Created by xiyem on 2017/3/21.
 */
public class Pojo {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString(){
        return JSON.toJSONString(this);
    }
}
