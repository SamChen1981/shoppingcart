package com.neusoft.user.service;

import com.neusoft.user.pojo.Usershopping;
import com.system.service.IService;

/**
 * Created by xiyem on 2017/3/22.
 */
public interface IUserShoppingService extends IService<Usershopping> {

    /**
     * 登入验证
     * @return int 失败返回0 成功返回1
     */
    public Usershopping login(Usershopping user);

    /**
     * 修改密码
     * @param user
     * @return int 失败返回0 成功返回1
     */
    public int modifyPwd(Usershopping user);
}
