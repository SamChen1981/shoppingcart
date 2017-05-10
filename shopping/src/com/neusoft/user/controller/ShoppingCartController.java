package com.neusoft.user.controller;

import com.neusoft.user.pojo.ShoppingCart;
import com.neusoft.user.service.IShoppingCartService;
import com.neusoft.user.util.ResultMsg;
import com.neusoft.user.util.ShoppingListUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@Controller
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Resource
    IShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     * @return JSON字符串；
     */
    @RequestMapping(value="/user/add", produces="text/json;charset=utf-8")
    @ResponseBody
    public String add(ShoppingCart soc){
        try {
            if(shoppingCartService.add(soc) > 0){
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
     * 修改购物车
     * @return JSON字符串；
     */
    @RequestMapping(value="/user/modify", produces="text/json;charset=utf-8")
    @ResponseBody
    public String modify(ShoppingCart soc){
        try {
            if(shoppingCartService.modify(soc) > 0){
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
     * 删除购物车
     * @return JSON字符串；
     */
    @RequestMapping(value="/user/remove", produces="text/json;charset=utf-8")
    @ResponseBody
    public String remove(ShoppingCart soc){
        try {
            if(shoppingCartService.remove(soc) > 0){
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
     * 查询购物车生成购物车
     * @return JSON字符串；
     */
    @RequestMapping(value="/user/select", produces="text/json;charset=utf-8")
    @ResponseBody
    public String select(ShoppingCart soc){
        try {
            List<ShoppingListUtil> list = shoppingCartService.select(soc);
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
}
