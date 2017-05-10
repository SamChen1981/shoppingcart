package com.neusoft.user.service.impl;

import com.neusoft.user.dao.IComDao;
import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.service.ICommodityService;
import com.neusoft.user.util.ComSelectUtil;
import com.neusoft.user.util.ResultMsg;
import com.system.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@Service("commodityServiec")
public class CommodityServiec extends ServiceImpl<Commodity> implements ICommodityService {

    @Resource
    private IComDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }
    /**
     * 重写商品添加方法，因为需要添加默认值
     */
    @Override
    public int add(Commodity com) throws Exception {
    	Commodity coms = ifFormat(com);
        return dao.insert(coms);
    }
    
    /**
     * 重写商品修改方法，因为需要把为空的信息赋值为原来的信息
     */
    @Override
    public int modify(Commodity com) throws Exception {
    	Commodity coms = verification(com);
    	return dao.update(coms);
    }
    
    /**
     * 验证商品修改信息，如果修改为空，把空项设置为原来的数据
     * @param com
     * @return
     */
    public Commodity verification(Commodity com){
        //根据id查询用户信息
        List<Commodity> list = dao.selectOne(com);
        Commodity coms = list.get(0);
        //如果没有修改邮箱，就把原来的邮箱赋值给他
        if(com.getCid() != 0){
        	coms.setCid(com.getCid());
        }
        if(com.getComname() != null){
        	coms.setComname(com.getComname());
        }
        if(com.getDescribe() != null){
        	coms.setDescribe(com.getDescribe());
        }
        if(com.getPrice() != 0){
        	coms.setPrice(com.getPrice());
        }
        if(com.getStock() != 0){
        	coms.setStock(com.getStock());
        }
        return coms;
    }
    
    /**
     * 进行商品验证信息是否为空
     * 判断商品信息是否符合格式
     * @param com
     * @return user;
     */
    public Commodity ifFormat(Commodity com){
    	Commodity coms = com;
        if(com.getCid() == 0){
        	coms.setCid(-1);
        }
        if(com.getComname() == null){
        	coms.setComname("未设置");
        }
        if(com.getDescribe() == null){
        	coms.setDescribe("未设置");
        }
        if(com.getPrice() == 0){
        	coms.setPrice(-1);
        }
        if(com.getStock() == 0){
        	coms.setStock(-1);
        }
        return coms;
    }

    /**
     * 对根据名字模糊查询、根据商品价格间区查询、根据商品分类查询 查询所有、提供支持
     * @param com
     * @return list<Commodity> 对相集合
     */
    @Override
    public List<Commodity> select(ComSelectUtil com) {
        if(com.getId() == 0){
            if(com.getName() == null &&
                    com.getClassify() == 0 &&
                    com.getPriceStart() == 0 &&
                    com.getPriceEnd() == 0){
                ResultMsg.getErrorNull();
                return null;
            }
        }
        return dao.selectCom(com);
    }

    /**
     * 查询所有商品
     * @return list<Commodity> 对相集合
     */
    @Override
    public List<Commodity> selectall() {
        return dao.select();
    }
}
