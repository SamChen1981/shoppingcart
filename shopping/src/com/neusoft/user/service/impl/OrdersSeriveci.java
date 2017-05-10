package com.neusoft.user.service.impl;

import com.neusoft.user.dao.IOrdersDao;
import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.pojo.Orders;
import com.neusoft.user.pojo.OrdersCommodify;
import com.neusoft.user.service.IOrdersSeriveci;
import com.neusoft.user.util.OrdersUtil;
import com.neusoft.user.util.ResultMsg;
import com.system.consts.SettlementFinal;
import com.system.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Orders业务层
 * Created by xiyem on 2017/3/22.
 */
@Service("ordersService")
public class OrdersSeriveci extends ServiceImpl<Orders> implements IOrdersSeriveci {

    @Resource
    private IOrdersDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }

    /**
     * 添加订单
     * (会添加两张表Orders、OrdersCommodify
     *      关联条件Orders.cmid= OrdersCommodify.id)
     * 如果订单价格未生成，会自动计算价格添加到数据库
     * @param or
     * @return int
     * @throws Exception
     */
    @Override
    public int add(Orders or) throws Exception{
        if(or.getUserid() == 0 || or.getList().size() == 0){
            ResultMsg.getErrorNull();
            return -1;
        }
        if(or.getState() == 0){
            or.setState(SettlementFinal.SETTLEMENT_STATE_NO);
        }
        if(or.getList().size() != 0){
            if(or.getPrice() == 0){
                or.setPrice(calculate(or.getList()));
            }
            int i = dao.insert(or);
            List<OrdersCommodify> list = or.getList();
            int x = 0;
            for(OrdersCommodify o : list){
                x += dao.insertoc(o);
            }
            if(x > 0){
                return i;
            }
        }
        return -1;
    }

    /**
     * 计算订单商品总价格方法
     * @return double
     */
    public double calculate(List<OrdersCommodify> list){
        double i = 0.0;
        for(OrdersCommodify o : list){
            long id = o.getCid();
            Commodity com = dao.selectCom(id);
            i += com.getPrice() * o.getNum();
        }
        return i;
    }

    /**
     * 查询订单，包含商品信息
     * 查询信息为空就是查询所有订单，
     * 可以根据用户ID或者订单ID查询
     * 还支持订单时间模糊查询
     * 总价格模糊查询
     * @return
     */
    @Override
    public List<OrdersUtil> select(Orders ord) throws Exception{
        List<OrdersUtil> list = dao.selectOrd(ord);
        if(ord.getStatime() == null && ord.getEndtime() == null){
            if(ord.getStaprice() != 0 || ord.getEndprice() != 0){
                return list;
            }
        }
        if(ord.getStaprice() == 0 && ord.getEndprice() == 0){
            if(ord.getStatime() != null || ord.getEndtime() != null){
                return list;
            }
        }
        return list;
    }

    /**
     * 删除订单
     * 需要删除两张表（Orders, OrdersCommodify）
     * @param id
     * @return
     */
    @Override
    public int remove(Long id) throws Exception{
        if(id == null || id == 0){
            ResultMsg.getErrorNull();
            return 0;
        }
        Orders ord = dao.selectid(id);
        int x = -1, i = -1;
        if(ord != null){
            x = dao.deleteoc(ord.getCmid());
            i = dao.delete(id);
        }
        if(x > 0 && i > 0){
            return 1;
        }
        return -1;
    }

    /**
     * 修改订单
     * 可以修改价格，结算状态；
     * @param ord
     * @return
     * @throws Exception
     */
    @Override
    public int modify(Orders ord) throws Exception{
        if(ord == null || ord.getId() == 0){
            ResultMsg.getErrorNull();
            return -1;
        }
        if((ord.getId() == 0 && ord.getPrice() == 0) || (ord.getId() == 0 && ord.getState() == 0)){
            ResultMsg.getErrorNull();
            return -1;
        }
        Orders orders = dao.selectid(ord.getId());
        if(ord.getPrice() == 0 && ord.getState() != 0){
           if(ord.getState() != SettlementFinal.SETTLEMENT_STATE_YES &&
                   ord.getState() != SettlementFinal.SETTLEMENT_STATE_NO){
               return -1;
           }else{
               ord.setPrice(orders.getPrice());
               return dao.update(ord);
           }
        }
        if(ord.getPrice() != 0 && ord.getState() == 0){
            ord.setState(orders.getState());
            return dao.update(ord);
        }
        return dao.update(ord);
    }
}
