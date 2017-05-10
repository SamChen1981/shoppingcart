package com.neusoft.user.pojo;

import com.system.entity.Pojo;

/**
 * 商品分类表：
 * Created by xiyem on 2017/3/22.
 */
public class Classify extends Pojo {

    private String classs;

    public Classify() {
    }

    public Classify(String classs) {
        this.classs = classs;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
