package com.neusoft.user.dao;

import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.pojo.Orders;
import com.neusoft.user.pojo.OrdersCommodify;
import com.neusoft.user.util.OrdersUtil;
import com.system.dao.IDao;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@MapperScan
public interface IOrdersDao extends IDao<Orders> {

    public int insertoc(OrdersCommodify ordc);

    public Commodity selectCom(long id);

    public List<OrdersUtil> selectOrd(Orders ord);

    public int deleteoc(long id);

    public Orders selectid(long id);

}
