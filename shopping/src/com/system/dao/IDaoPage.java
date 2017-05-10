package com.system.dao;

import com.system.dao.base.SelectPageDao;

/**
 * 继承 增、 删、 改、 查、 方法 增加分页查询（重载方法）
 * Created by xiyem on 2017/3/21.
 */
public interface IDaoPage<T>
        extends
            IDao<T>,
        SelectPageDao<T>{
}
