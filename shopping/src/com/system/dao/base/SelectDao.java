package com.system.dao.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查询基础方法
 * Created by xiyem on 2017/3/21.
 */
public interface SelectDao<T> {

    /**
     * 根据ID查询数据
     * @return 对象
     */
    public List<T> selectOne(@Param(value="t")T t);

    /**
     * 查询所有
     * @return list
     */
    public List<T> select(@Param(value="t")T t);
}
