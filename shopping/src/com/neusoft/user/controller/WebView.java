package com.neusoft.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiyem on 2017/3/30.
 */

/**
 * 这个类的作用是视图转发
 * 转发到jsp
 */
@Controller
@RequestMapping("/view")
public class WebView {

    /**
     * 注册
     * @return
     */
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    /**
     * 登入
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 关于我们
     * @return
     */
    @RequestMapping("/single")
    public String single(){
        return "single";
    }


    /**
     * 男装
     * @return
     */
    @RequestMapping("/men")
    public String men(){
        return "products1";
    }

    /**
     * 女装
     * @return
     */
    @RequestMapping("/women")
    public String women(){
        return "products";
    }

    /**
     * 购物车
     * @return
     */
    @RequestMapping("/checkout")
    public String checkout(){
        return "checkout";
    }
}
