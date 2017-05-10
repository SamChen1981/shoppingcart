package com.neusoft.user.dao;

import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.util.ComSelectUtil;
import com.system.dao.IDao;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@MapperScan
public interface IComDao extends IDao<Commodity> {

    public List<Commodity> selectCom(@Param(value="t") ComSelectUtil t);

    public List<Commodity> select();
}
