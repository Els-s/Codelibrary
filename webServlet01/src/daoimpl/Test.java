package daoimpl;

import bean.User;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kmj
 * @date 2019/8/15 21:01
 * @company www.ads.com
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        //创建一个map

        Map<String, String> map = new HashMap<String, String>();

        map.put("username", "6666");
        map.put("password", "123456");
        map.put("phone", "13297088157");
        map.put("email", "6966657");

        User u = new User();

        try {
            BeanUtils.populate(u, map);
            System.out.println(u);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        ////拿到属性的值
        //
        ////设置属性值
        //BeanUtils.setProperty(u, "username", "zhangsan");
        //// 第一个参数是对象   参数2 对象的属性名称
        //String uname = BeanUtils.getProperty(u, "username");
        //System.out.println(uname);
        //System.out.println(u);
//		Class<User> clazz = (Class<User>) Class.forName("cn.szsxt.bean.User");
//		User u = mapToBean(map,clazz);


    }
}
