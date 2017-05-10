package com.system.dao.base;

/**
 * 修改基础方法
 * Created by xiyem on 2017/3/21.
 */
public interface UpdateDao<T> {

    /**
     * 添加对象
     * @return 影响行数
     */
    public int update(T t);
}
