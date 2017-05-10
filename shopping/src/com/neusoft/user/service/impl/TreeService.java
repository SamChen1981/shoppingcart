package com.neusoft.user.service.impl;

import com.system.service.impl.ServiceImpl;
import com.neusoft.user.dao.ITreeDao;
import com.neusoft.user.pojo.Tree;
import com.neusoft.user.service.ITreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiyem on 2017/3/23.
 */
@Service("treeService")
public class TreeService extends ServiceImpl<Tree> implements ITreeService {

    @Resource
    private ITreeDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }
}
