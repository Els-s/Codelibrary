package test0809;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

/**
 * @author kmj
 * @date 2019/8/9 23:09
 * @company www.ads.com
 * @desc GsonTest
 */
public class Gson1 {
    public static void main(String[] args) {
        Minzhu mz=new Minzhu("红楼梦","曹雪芹",22);
        Gson gson=new Gson();
        String str1 = gson.toJson(mz);
        System.out.println(str1);
        //
        String a="{\"author\":\"罗贯中\",\"name\":\"三国演义\",\"price\":20}";
        Minzhu minzhu1 = gson.fromJson(a, Minzhu.class);
        System.out.println(minzhu1);
        List<Minzhu> list= Arrays.asList(new Minzhu("三国演义", "罗贯中", 20)
                ,new Minzhu("西游记", "吴承恩", 21));
        String str2 = gson.toJson(list);
        System.out.println(str2);
    }
}
