package com.neusoft.user.controller;

import com.neusoft.user.pojo.Usershopping;
import com.neusoft.user.service.IUserShoppingService;
import com.neusoft.user.util.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户业务层
 * Created by xiyem on 2017/3/22.
 */
@Controller
@RequestMapping("/user")
public class UserShoppingController {

    @Resource
    private IUserShoppingService userShoppingService;

    /**
     * 注册功能
     * @param user 对象
     * @return JSON字符串
     */
    @RequestMapping(value="/user/add", produces="text/json;charset=utf-8")
    @ResponseBody
    public String register(Usershopping user){
        userShoppingService.init();
        try {
            if(userShoppingService.add(user) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getResultMsg().toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }

    /**
     * 退出功能

     */
    @RequestMapping(value="/user/logout", produces="text/json;charset=utf-8")
    @ResponseBody
    public String logout(HttpSession session){
        session.invalidate();
        return ResultMsg.getOk();
    }

    /**
     * 登入验证
     * @param user
     * @return JSON字符串
     */
    @RequestMapping(value="/user/login", produces="text/json;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, Usershopping user){
        userShoppingService.init();
        try {
            Usershopping users = userShoppingService.login(user);
            if(users != null){
                HttpSession session = request.getSession();
                session.setAttribute("user",users);
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getErrorName();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }

    /**
     * 修改用户信息
     * @param user
     * @return JSON字符串
     */
    @RequestMapping(value="/user/modify", produces="text/json;charset=utf-8")
    @ResponseBody
    public String modify(Usershopping user){
    	if(user.getId() == 0){
    		return ResultMsg.getErrorNull();
    	}
        userShoppingService.init();
        try {
            if(userShoppingService.modify(user) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getResultMsg().toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getResultMsg().toString();
        }
    }

    /**
     * 修改用户密码
     * @param user
     * @return JSON字符串
     */
    @RequestMapping(value="/user/modifypwd", produces="text/json;charset=utf-8")
    @ResponseBody
    public String modifyPwd(Usershopping user){
    	if(user.getId() == 0){
    		return ResultMsg.getErrorNull();
    	}
        userShoppingService.init();
        try {
            if(userShoppingService.modifyPwd(user) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getResultMsg().toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getResultMsg().toString();
        }
    }
    
    /*
      普通用户后台
      =========================================================================
      =========================================================================
      管理员后台
     */

    /**
     * 添加用户
     * 用户名不能为空
     * @param user 对象
     * @return JSON字符串
     */
    @RequestMapping(value="/admin/add", produces="text/json;charset=utf-8")
    @ResponseBody
    public String addUser(Usershopping user){
    	if(user.getUsername() == null){
    		return ResultMsg.getErrorNull();
    	}
        userShoppingService.init();
        try {
            if(userShoppingService.add(user) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getResultMsg().toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getError();
        }
    }
    
    /**
     * (管理员)修改用户信息
     * 用户ID不能为空
     * @param user
     * @return JSON字符串
     */
    @RequestMapping(value="/admin/modify", produces="text/json;charset=utf-8")
    @ResponseBody
    public String modifyUser(Usershopping user){
    	if(user.getId() == 0){
    		return ResultMsg.getErrorNull();
    	}
        userShoppingService.init();
        try {
            if(userShoppingService.modify(user) > 0){
                return ResultMsg.getOk();
            }else{
                return ResultMsg.getResultMsg().toString();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResultMsg.getResultMsg().toString();
        }
    }
    
    /**
     * (管理员)删除用户
     * @param id 用户id
     * @return JSON字符串
     */
    @RequestMapping(value="/admin/remove", produces="text/json;charset=utf-8")
    @ResponseBody
    public String removeUser(Long id){
    	if(id == 0){
    		return ResultMsg.getErrorNull();
    	}
        userShoppingService.init();
        try {
            if(userShoppingService.remove(id) > 0){
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
     * (管理员)查看用户(传入ID根据ID查询用户，否者查询全部)
     * @param id
     * @return JSON字符串
     */
    @RequestMapping(value="/admin/select", produces="text/json;charset=utf-8")
    @ResponseBody
    public String selectUser(Long id){
        userShoppingService.init();
        if(id == null){
        	   try {
               	List<Usershopping> list = userShoppingService.getAll(new Usershopping());
                   if(list.size() > 0){
                   	System.out.println(list.toString());
                       return list.toString();
                   }else{
                       return ResultMsg.getFail();
                   }
               } catch (Exception e) {
                   System.out.println(e.getMessage());
                   return ResultMsg.getError();
               }
        }else{
        	Usershopping users = new Usershopping();
        	users.setId(id);
        	 try {
                	List<Usershopping> lists = userShoppingService.getAll(users);
                    if(lists.size() > 0){
                    	System.out.println(lists.toString());
                        return lists.toString();
                    }else{
                        return ResultMsg.getFail();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return ResultMsg.getError();
                }
        }
     
    }
}
