package test0809;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;

public class Json1 {
    public static void main(String[] args) {
        //StringBuffer jsdemo = new StringBuffer();
        //jsdemo.append(new Minzhu("三国演义", "罗贯中", 20));
        //jsdemo.append(new Minzhu("西游记", "吴承恩", 21));
        Minzhu mz=new Minzhu("三国演义", "罗贯中", 20);
        String str = JSON.toJSONString(mz);
        System.out.println(str);
        String a="{\"author\":\"罗贯中\",\"name\":\"三国演义\",\"price\":20}";
        Minzhu mz2=JSON.parseObject(a,Minzhu.class);
        System.out.println(mz2.toString());
        List<Minzhu> list= Arrays.asList(new Minzhu("三国演义", "罗贯中", 20)
                ,new Minzhu("西游记", "吴承恩", 21));
        String str2 = JSON.toJSONString(list);
        System.out.println(str2);
    }
}

class Minzhu {
    private String name;
    private String Author;
    private int price;

    public Minzhu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Minzhu(String name, String author, int price) {
        this.name = name;
        Author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Minzhu{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }
}