package com.system.service.impl;

import com.system.dao.IDao;
import com.system.service.IService;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
public abstract class ServiceImpl<T> implements IService<T> {

    protected IDao<T> dao;

    @Override
    public int add(T t) throws Exception {
        return dao.insert(t);
    }

    @Override
    public List<T> getAll(T t) {
    	if(t == null){
    		return dao.select(null);
    	}else{
    		return dao.selectOne(t);
    	}
    }

    @Override
    public int modify(T t) throws Exception {
        return dao.update(t);
    }

    @Override
    public int remove(long id) throws Exception {
        return dao.delete(id);
    }

    @Override
    public int removeAll(long[] id) throws Exception{
        return dao.deleteAll(id);
    }
}
