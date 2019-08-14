package utils;

import bean.User;
import daoimpl.Userdaoimpl;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kmj
 * @date 2019/8/14 10:26
 * @company www.ads.com
 * @desc
 */
public class MaptoBeanUtils {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //User u=new User();
        Class<User> aClass = (Class<User>) Class.forName("bean.User");
        Field[] fs = aClass.getDeclaredFields();
        for (Field field : fs) {
            System.out.println(field);
        }
        Map<String, String[]> map = new HashMap<>();
        map.put("name", new String[]{"tom"});
        map.put("password", new String[]{"123456"});
        map.put("sex",new String[]{"man"});
        map.put("sex", null);
        map.put("fav",new String[]{"eat","sleep"});
        map.put("fav", null);
        User u = MapToBean(map);
        Userdaoimpl ua = new Userdaoimpl();
        boolean login = ua.Login(u);
        System.out.println(login);
    }

    public static User MapToBean(Map<String, String[]> map) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<User> clazz = (Class<User>) Class.forName("bean.User");
        User user = clazz.newInstance();
        Field[] fs = clazz.getDeclaredFields();
        for (Field filed : fs) {
            String name = filed.getName();
            String[] strs = map.get(name);
            String string = Arrays.toString(strs);
            //System.out.println(string);
            filed.setAccessible(true);
            filed.set(user, string);
        }
        return user;
    }
}