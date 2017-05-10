package com.neusoft.user.service;

import com.neusoft.user.pojo.Orders;
import com.neusoft.user.util.OrdersUtil;
import com.system.service.IService;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
public interface IOrdersSeriveci extends IService<Orders> {

    public List<OrdersUtil> select(Orders ord) throws Exception;

    public int remove(Long id) throws Exception;
}
