package com.system.entity;

import com.alibaba.fastjson.JSON;

/**
 * 分页功能
 * Created by xiyem on 2017/3/21.
 */
public class PageInfo {
    /**
     * 当前页号
     */
    private int page;
    /**
     * 总页数
     */
    private int total;
    /**
     * 当前页显示的条数
     */
    private int count;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toStirng(){
        return JSON.toJSONString(this);
    }
}
