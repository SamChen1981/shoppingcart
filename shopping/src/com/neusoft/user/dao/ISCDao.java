package com.neusoft.user.dao;

import com.neusoft.user.pojo.ShoppingCart;
import com.neusoft.user.util.ShoppingListUtil;
import com.system.dao.IDao;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@MapperScan
public interface ISCDao extends IDao<ShoppingCart> {

    public int deletesho(ShoppingCart sho);

    public List<ShoppingListUtil> selectsho(ShoppingCart sho);
}
