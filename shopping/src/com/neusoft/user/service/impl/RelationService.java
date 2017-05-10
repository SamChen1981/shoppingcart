package com.neusoft.user.service.impl;

import com.system.service.impl.ServiceImpl;
import com.neusoft.user.dao.IRelationDao;
import com.neusoft.user.pojo.Relation;
import com.neusoft.user.service.IRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiyem on 2017/3/22.
 */
@Service("relationService")
public class RelationService extends ServiceImpl<Relation> implements IRelationService {

    @Resource
    private IRelationDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }
}
