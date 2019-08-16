package service;

import bean.User;
import dao.UserDao;
import daoimpl.Userdaoimpl;

/**
 * @author kmj
 * @date 2019/8/15 20:16
 * @company www.ads.com
 * @desc
 */
public class UserService {
    private UserDao userimpl=new Userdaoimpl();
    public boolean Landing(User u){
        return userimpl.Landing(u);
    }
    public boolean Login(User u){
        return userimpl.Login(u);
    }
}
