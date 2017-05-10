package com.system.dao.base;


/**
 * 添加基础方法
 * Created by xiyem on 2017/3/21.
 */
public interface InsertDao<T> {

    /**
     * 添加
     * @return 影响的行数
     */
    public int insert(T t);
}
