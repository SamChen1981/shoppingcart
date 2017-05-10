package com.neusoft.user.service.impl;

import com.neusoft.user.dao.IComDao;
import com.neusoft.user.dao.ISCDao;
import com.neusoft.user.pojo.Commodity;
import com.neusoft.user.pojo.ShoppingCart;
import com.neusoft.user.service.IShoppingCartService;
import com.neusoft.user.util.ResultMsg;
import com.neusoft.user.util.ShoppingListUtil;
import com.system.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@Service("shoppingCartService")
public class ShoppingCartService extends ServiceImpl<ShoppingCart> implements IShoppingCartService {

    @Resource
    private ISCDao dao;
    @Resource
    private IComDao cdao;

    @Override
    public void init() {
        super.dao = dao;
    }

    @Override
    public int add(ShoppingCart sho) throws Exception {
        if(sho == null){
            return -1;
        }
        if(sho.getUserid() == 0 || sho.getShopping() == 0){
            return -1;
        }
        if(sho.getPrice() == 0){
            Commodity comm = new Commodity();
            comm.setId(sho.getShopping());
            List<Commodity> com = cdao.selectOne(comm);
            Commodity co = com.get(0);
            double x = co.getPrice() * sho.getNum();
            sho.setPrice(x);
        }
        return dao.insert(sho);
    }

    @Override
    public int modify(ShoppingCart sho){
        if(sho == null || sho.getId() == 0){
            return 0;
        }
        if(sho.getShopping() == 0 || sho.getNum() == 0){
            return -1;
        }
        Commodity comm = new Commodity();
        comm.setId(sho.getShopping());
        List<Commodity> com = cdao.selectOne(comm);
        Commodity co = com.get(0);
        double x = co.getPrice() * sho.getNum();
        sho.setPrice(x);
        return dao.update(sho);
    }

    @Override
    public int remove(ShoppingCart sho){
        if(sho == null){
            return 0;
        }
        if(sho.getId() == 0 && sho.getUserid() == 0){
            return -1;
        }
        return dao.deletesho(sho);
    }


    @Override
    public List<ShoppingListUtil> select(ShoppingCart sho){
        if(sho == null || sho.getUserid() == 0){
            ResultMsg.getErrorNull();
            return null;
        }
        return dao.selectsho(sho);
    }
}
