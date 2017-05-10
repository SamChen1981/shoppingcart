package com.system.plugin;

import com.alibaba.fastjson.JSON;
import com.system.entity.PageInfo;

import java.util.List;

/**
 * Created by xiyem on 2017/3/21.
 */
public class Result {

    private PageInfo page;
    private List<Object> objs;
    private int errornum;

    public Result(PageInfo page, List<Object> objs, int errornum){
        super();
        this.errornum = errornum;
        this.page = page;
        this.objs = objs;
    }

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    public List<Object> getObjs() {
        return objs;
    }

    public void setObjs(List<Object> objs) {
        this.objs = objs;
    }

    public int getErrornum() {
        return errornum;
    }

    public void setErrornum(int errornum) {
        this.errornum = errornum;
    }

    public String toString(){
        return JSON.toJSONString(this);
    }
}
