package bean;

import java.util.Arrays;

/**
 * @author kmj
 * @date 2019/8/13 16:57
 * @company www.ads.com
 * @desc
 */
public class User {
    private String name;
    private String password;
    private String sex;
    private String fav;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", fav=" + fav +
                '}';
    }

    public User(String name, String password, String sex, String fav) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.fav = fav;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }
}


