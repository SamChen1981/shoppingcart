package com.system.dao.base;

import com.system.entity.PageInfo;

import java.util.List;

/**
 * 分页查询
 * Created by xiyem on 2017/3/21.
 */
public interface SelectPageDao<T> {

    /**
     * 分页查询全部数据
     * @return 影响的行数
     */
    public List<T> select(T t, PageInfo page);
}
