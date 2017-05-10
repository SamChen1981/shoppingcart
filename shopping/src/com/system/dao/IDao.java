package com.system.dao;

import com.system.dao.base.DeleteDao;
import com.system.dao.base.InsertDao;
import com.system.dao.base.SelectDao;
import com.system.dao.base.UpdateDao;

/**
 * 继承 增、 删、 改、 查、 方法
 * Created by xiyem on 2017/3/21.
 */
public interface IDao<T>
        extends
        InsertDao<T>,
        UpdateDao<T>,
        DeleteDao<T>,
        SelectDao<T>{

}
