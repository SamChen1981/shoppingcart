package com.system.service;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
public interface IService<T> {

    public void init();

    public int add(T t) throws Exception;

    public List<T> getAll(T t) throws Exception;

    public int modify(T t) throws Exception;

    public int remove(long id) throws Exception;

    public int removeAll(long[] id) throws Exception;

}
