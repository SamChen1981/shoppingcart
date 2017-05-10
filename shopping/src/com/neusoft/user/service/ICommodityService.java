package com.neusoft.user.service;

import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.util.ComSelectUtil;
import com.system.service.IService;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
public interface ICommodityService extends IService<Commodity> {

    /**
     * 多功能查询
     * 提供模糊查询、间区查询、分类查询
     * @param com
     * @return 商品对象集合
     */
    public List<Commodity> select(ComSelectUtil com) throws Exception;

    public List<Commodity> selectall() throws Exception;

}
