package com.neusoft.user.service.impl;

import com.system.service.impl.ServiceImpl;
import com.neusoft.user.dao.IClassifyDao;
import com.neusoft.user.pojo.Classify;
import com.neusoft.user.service.IClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiyem on 2017/3/22.
 */
@Service("classifyService")
public class ClassifyService extends ServiceImpl<Classify> implements IClassifyService {

    @Resource
    private IClassifyDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }
}
