package com.neusoft.user.pojo;

import com.system.entity.Pojo;

import java.util.List;

/**
 * Created by xiyem on 2017/3/23.
 */
public class Tree extends Pojo {

    private String name;
    private String url;
    private String icon;//图标
    private long pid;

    /**
     * 返回子菜单（集合方式）
     */
    private List<Tree> childTree;

    public Tree() {
        super();
    }

    public Tree(String name, String url, long pid) {
        this.name = name;
        this.url = url;
        this.pid = pid;
    }

    public Tree(String name, String url, String icon, long pid) {
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.pid = pid;
    }

    public List<Tree> getChildTree() {
        return childTree;
    }

    public void setChildTree(List<Tree> childTree) {
        this.childTree = childTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }
}
