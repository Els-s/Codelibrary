package service;

import bean.User;
import dao.Userdao;
import daoimpl.Userdaoimpl;

import java.sql.SQLException;

/**
 * @author kmj
 * @date 2019/8/14 11:37
 * @company www.ads.com
 * @desc
 */
public class UserService {
    private Userdaoimpl usedao=new Userdaoimpl();
    /*注册*/
    public boolean login(User user) {
        return usedao.Login(user);
    }
    public boolean landing(User user) {
        return usedao.Landing(user);
    }
}
