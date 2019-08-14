package daoimpl;

import bean.User;

/**
 * @author kmj
 * @date 2019/8/14 15:32
 * @company www.ads.com
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        User us=new User("ali","3333","男","LOL");
        Userdaoimpl ua=new Userdaoimpl();
        boolean login =ua.Login(us);
        System.out.println(login);
    }
}
