package dao;

import bean.User;

/**
 * @author kmj
 * @date 2019/8/15 17:41
 * @company www.ads.com
 * @desc
 */
public interface UserDao {
    /*登陆*/
    public boolean Login(User u);
    /*注册*/
    public boolean Landing(User u);
}
