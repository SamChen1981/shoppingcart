package com.neusoft.user.util;

import com.system.entity.Pojo;

/**
 * 专门为商品查询封装的工具类
 * 对根据名字模糊查询、根据商品价格间区查询、根据商品分类查询 查询所有提供支持
 * Created by xiyem on 2017/3/25.
 */
public class ComSelectUtil extends Pojo {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格间区查询开始值；
     */
    private int priceStart;

    /**
     * 价格间区查询结束值
     */
    private int priceEnd;

    /**
     * 商品分类ID
     */
    private int classify;

    public ComSelectUtil() {
    }

    public ComSelectUtil(int priceStart, int priceEnd) {
        this.priceStart = priceStart;
        this.priceEnd = priceEnd;
    }

    public ComSelectUtil( int classify) {
        this.classify = classify;
    }

    public ComSelectUtil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(int priceStart) {
        this.priceStart = priceStart;
    }

    public int getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(int priceEnd) {
        this.priceEnd = priceEnd;
    }

    public int getClassify() {
        return classify;
    }

    public void setClassify(int classify) {
        this.classify = classify;
    }
}
