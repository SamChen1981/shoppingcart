package com.neusoft.user.service.impl;

import com.neusoft.user.dao.IUserDao;
import com.neusoft.user.pojo.Usershopping;
import com.neusoft.user.service.IUserShoppingService;
import com.neusoft.user.util.ResultMsg;
import com.system.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiyem on 2017/3/22.
 */
@Service("userShoppingService")
public class UserShoppingService extends ServiceImpl<Usershopping> implements IUserShoppingService {

    @Resource
    private IUserDao dao;

    @Override
    public void init() {
        super.dao = dao;
    }

    /**
     * 添加用户
     * 因为需要做字段验证，所以重写了add方法；
     * @param user
     * @return int 影响的行数
     * @throws Exception
     */
    @Override
    public int add(Usershopping user) throws Exception{
        user = ifFormat(user);
        if(user != null){
            if(selectByName(user) > 0) {
                ResultMsg.getErrorBe();
                return 0;
            }else{
                return dao.insert(user);
            }
        }
        return 0;
    }

    /**
     * 修改用户
     * @param user
     * @return int 影响的行数
     * @throws Exception
     */
    @Override
    public int modify(Usershopping user) throws Exception {
    	if(user.getId() == 0){
    		return -1;
    	}
        Usershopping  users = verification(user);
        users = ifFormat(users);
        return dao.update(users);
    }

    /**
     * 验证用户修改休息，如果修改为空，把空项设置为原来的数据
     * @param user
     * @return
     */
    public Usershopping verification(Usershopping user){
        //根据id查询用户信息
        List<Usershopping > list = dao.selectOne(user);
        Usershopping users = list.get(0);
        //如果没有修改邮箱，就把原来的邮箱赋值给他
        if(user.getEmail() != null){
            users.setEmail(user.getEmail());
        }
        if(user.getTel() != null){
            users.setTel(user.getTel());
        }
        if(user.getUserpwd() != null){
            users.setUserpwd(user.getUserpwd());
        }
        if(user.getNick() != null){
            users.setNick(user.getNick());
        }
        return users;
    }

    /**
     * 验证用户名是否存在
     * @param user
     * @return
     * @throws Exception
     */
    public int selectByName(Usershopping user) throws Exception {
        Usershopping users = new Usershopping();
        users.setUsername(user.getUsername());
        List<Usershopping> list = dao.select(users);
        return list.size();
    }

    /**
     * 进行用户验证信息是否为空
     * 判断用户信息是否符合格式
     * @param user
     * @return user;
     */
    public Usershopping ifFormat(Usershopping user){
        Usershopping users = user;
        if(user.getEmail() == null){
            users.setEmail("未设置邮件！");
        }
       // System.out.println(users.getEmail().length() + "邮件");
        if(user.getTel() == null){
            users.setTel(11111111111L);
        }
        //System.out.println(users.getTel().toString().length() + "电话");
        if(user.getNick() == null){
            users.setNick("未设置昵称！");
        }
       // System.out.println(users.getNick().length() + "昵称");
        if(user.getUsername().length() < 8 || user.getUsername().length() > 16){
            ResultMsg.getErrorName();
            user = null;
            return user;
        }
        if(user.getUserpwd().length() < 8 || user.getUserpwd().length() > 16){
            ResultMsg.getErrorName();
            user = null;
            return user;
        }
        if(user.getNick().length() < 6 || user.getNick().length() > 18){
            ResultMsg.getErrorName();
            user = null;
            return user;
        }
        if(user.getEmail().length() < 6 || user.getEmail().length() > 18){
            ResultMsg.getErrorTel();
            user = null;
            return user;
        }
        if(user.getTel().toString().length() != 11){
            ResultMsg.getErrorTel();
            user = null;
            return user;
        }
        return users;
    }

    /**
     * 登入验证
     * @return int 失败返回0 成功返回1
     */
    @Override
    public Usershopping login(Usershopping user) {
        if(user.getUsername() == null || user.getUserpwd() == null){
            ResultMsg.getErrorNull();
            return null;
        }
        List<Usershopping> list = dao.select(user);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 修改密码
     * @param user
     * @return int 失败返回0 成功返回1
     */
    @Override
    public int modifyPwd(Usershopping user) {
        if(user.getUserpwd() != null && user.getId() != 0){
            List<Usershopping> list = dao.selectOne(user);
            Usershopping users = list.get(0);
            users.setId(user.getId());
            users.setUserpwd(user.getUserpwd());
            return dao.update(users);
        }
        return 0;
    }


}
