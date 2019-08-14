package dao;

import bean.User;

import java.sql.SQLException;

/**
 * @author kmj
 * @date 2019/8/14 9:49
 * @company www.ads.com
 * @desc
 */
public interface Userdao {
    /*注册*/
    public boolean  Login(User u);
    /*登陆*/
    public boolean  Landing(User u);
}
