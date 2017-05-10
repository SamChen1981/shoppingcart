package com.neusoft.user.controller;

import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.service.ICommodityService;
import com.neusoft.user.util.ComSelectUtil;
import com.neusoft.user.util.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 商品业务层
 * Created by xiyem on 2017/3/22.
 */
@Controller
@RequestMapping("/com")
public class CommodityController {
	
	@Resource
	private ICommodityService commodityService;

	 /*
      前台页面
      =========================================================================
      =========================================================================
      后台业务(普通通用户)
     */

	/**
	 * 添加商品
	 * @param com
	 * @return JSON字符串
	 */
	@RequestMapping(value="/admin/add", produces="text/json;charset=utf-8")
	@ResponseBody
	public String register(Commodity com){
		commodityService.init();
		if(com.getComname() == null){
			return ResultMsg.getErrorNull();
		}else{
			try {
				if(commodityService.add(com) > 0){
					return ResultMsg.getOk();
				}else{
					return ResultMsg.getFail();
				}
			} catch (Exception e) {
				System.out.println("adminadd:" + e.getMessage());
				return ResultMsg.getError();
			}
		}
	}
	
	/**
	 * 修改商品
	 * @param com
	 * @return JSON字符串
	 */
	@RequestMapping(value="/admin/modify", produces="text/json;charset=utf-8")
	@ResponseBody
	public String modify(Commodity com){
		commodityService.init();
		if(com.getId() == 0){
			return ResultMsg.getErrorNull();
		}else{
			try {
				if(commodityService.modify(com) > 0){
					return ResultMsg.getOk();
				}else{
					return ResultMsg.getFail();
				}
			} catch (Exception e) {
				System.out.println("adminadd:" + e.getMessage());
				return ResultMsg.getError();
			}
		}
	}

	/**
	 * 删除商品
	 * @param id
	 * @return JSON字符串
	 */
	@RequestMapping(value="/admin/remove", produces="text/json;charset=utf-8")
	@ResponseBody
	public String remove(long[] id){
		commodityService.init();
		if(id == null || id.length == 0){
			return ResultMsg.getErrorNull();
		}else{
			try {
				if(commodityService.removeAll(id) > 0){
					return ResultMsg.getOk();
				}else{
					return ResultMsg.getFail();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return ResultMsg.getError();
			}
		}
	}

	/**
	 * 查询商品
	 * 对根据名字模糊查询、根据商品价格间区查询、根据商品分类查询 查询所有、提供支持
	 * @param com
	 * @return JSON字符串
	 */
	@RequestMapping(value="/admin/select", produces="text/json;charset=utf-8")
	@ResponseBody
	public String select(HttpServletRequest request, ComSelectUtil com){
		commodityService.init();
		try {
			List<Commodity> list = commodityService.select(com);
			if(list.size()> 0){
				return list.toString();
			}else{
				return ResultMsg.getFail();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResultMsg.getResultMsg().toString();
		}
	}

	/**
	 * 查询所有商品
	 * @return JSON字符串
	 */
	@RequestMapping(value="/admin/selectall", produces="text/json;charset=utf-8")
	@ResponseBody
	public String selectall(){
		commodityService.init();
		try {
			List<Commodity> list = commodityService.selectall();
			if(list.size()> 0){
				return list.toString();
			}else{
				return ResultMsg.getFail();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResultMsg.getResultMsg().toString();
		}
	}
}
