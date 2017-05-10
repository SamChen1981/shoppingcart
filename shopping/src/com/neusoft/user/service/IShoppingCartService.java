package com.neusoft.user.service;

import com.neusoft.user.pojo.ShoppingCart;
import com.neusoft.user.util.ShoppingListUtil;
import com.system.service.IService;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
public interface IShoppingCartService extends IService<ShoppingCart> {

    public int add(ShoppingCart sho) throws Exception;

    public int modify(ShoppingCart sho) throws  Exception;

    public int remove(ShoppingCart sho) throws  Exception;

    public List<ShoppingListUtil> select(ShoppingCart sho) throws  Exception;
}
