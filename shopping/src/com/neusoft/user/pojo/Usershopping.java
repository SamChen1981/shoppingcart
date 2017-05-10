package com.neusoft.user.pojo;

import com.system.consts.UserLevelFinal;
import com.system.entity.Pojo;

/**
 * 用户表：
 * Created by xiyem on 2017/3/22.
 */
public class Usershopping extends Pojo {

    private String username;
    private String userpwd;
    private String nick;
    private int userlevel;
    private String email;
    private Long tel;

    public Usershopping() {
        super();
    }

    public Usershopping(String username, String userpwd, String nick) {
        this.username = username;
        this.userpwd = userpwd;
        this.nick = nick;
        this.userlevel = UserLevelFinal.USER_LEVEL_USER;
    }

    public Usershopping(String username, String userpwd, String nick, String email, Long tel) {
        this.username = username;
        this.userpwd = userpwd;
        this.nick = nick;
        this.userlevel = UserLevelFinal.USER_LEVEL_USER;
        this.email = email;
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(int userlevel) {
        this.userlevel = userlevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }
}
