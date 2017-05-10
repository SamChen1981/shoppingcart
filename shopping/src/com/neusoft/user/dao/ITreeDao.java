package com.neusoft.user.dao;

import com.system.dao.IDao;
import com.neusoft.user.pojo.Tree;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by xiyem on 2017/3/23.
 */
@MapperScan
public interface ITreeDao extends IDao<Tree> {
}
