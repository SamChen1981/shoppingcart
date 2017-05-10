package com.neusoft.user.controller;

import com.neusoft.user.pojo.Orders;
import com.neusoft.user.service.IOrdersSeriveci;
import com.neusoft.user.util.OrdersUtil;
import com.neusoft.user.util.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单控制层
 * Created by xiyem on 2017/3/22.
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Resource
    private IOrdersSeriveci ordersService;

    /*
      前台页面
      =========================================================================
      =========================================================================
      后台业务(普通通用户)
     */

    /**
     * 添加订单（购买商品后）
     * @param ord
     */
    @RequestMapping(value="/user/add", produces="text/json;charset=utf-8")
    @ResponseBody
    public String register(Orders ord){
        /*Orders or = new Orders();
        or.setCmid(1);
        or.setUserid(1);
        List<OrdersCommodify> list = new ArrayList();
        list.add(new OrdersCommodify(1,2));
        list.add(new OrdersCommodify(2,1));
        or.setList(list);*/
        try {
            if(ordersService.add(ord) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getFail();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }

    /**
     * 查询订单信息，传入值为空查询所有
     * 可以根据订单ID用户ID查询
     * 还支持订单时间模糊查询
     * 总价格模糊查询
     * 查询支付或未支付订单信息
     * @return JSON字符串
     */
    @RequestMapping(value="/user/select", produces="text/json;charset=utf-8")
    @ResponseBody
    public String select(Orders ord){
        try {
            List<OrdersUtil> list = ordersService.select(ord);
            if(list.size() > 0){
                return list.toString();
            }else{
                return ResultMsg.getFail();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }

    /**
     * 用户根据删除订单
     * @param id
     * @return JSON字符串
     */
    @RequestMapping(value="/user/remove", produces = "text/json;charset=utf-8")
    @ResponseBody
    public String remove(Long id){
        try {
            if(ordersService.remove(id) > 0 ){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getFail();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }
    /*
      后台业务(普通通用户)
      =========================================================================
      =========================================================================
      后台业务(管理员)
     */

    /**
     * 管理员修改订单
     * 可以修改价格，修改结算状态
     * @param ord
     * @return
     */
    @RequestMapping(value="/admin/modify", produces = "text/json;charset=utf-8")
    @ResponseBody()
    public String modify(Orders ord){
        try {
            if(ordersService.modify(ord) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getFail();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getResultMsg().toString();
        }
    }


}
