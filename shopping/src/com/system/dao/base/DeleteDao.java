package com.system.dao.base;

/**
 * 删除基础方法
 * Created by xiyem on 2017/3/21.
 */
public interface DeleteDao<T> {

    /**
     * 删除全部
     * @return 影响的行数
     */
    public int delete();

    /**
     * 根据ID删除数据
     * @return 影响的行数
     */
    public int delete(long id);

    /**
     * 根据多个ID删除多个数据
     * @return 影响的行数
     */
    public int deleteAll(long[] id);
}
