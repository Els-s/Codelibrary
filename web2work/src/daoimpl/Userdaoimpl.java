package daoimpl;

import bean.User;
import controller.LoginServlet;
import dao.Userdao;
import utils.JDBCUtils;

import java.sql.*;
import java.util.Arrays;

/**
 * @author kmj
 * @date 2019/8/14 11:46
 * @company www.ads.com
 * @desc
 */
public class Userdaoimpl implements Userdao {
    /*注册*/
    public boolean Login(User u) {
        //conn通道
        Connection conn = null;
        PreparedStatement prep = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "root");
            String sql = "insert into t_User(uname,password,sex,fav) values (?,?,?,?)";
            prep = conn.prepareStatement(sql);
            prep.setString(1, u.getName());
            prep.setString(2, u.getPassword());
            prep.setString(3, u.getSex());
            prep.setString(4, u.getFav());
            int i = prep.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (prep != null) {
                prep.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {

            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /*登陆*/
    public boolean Landing(User u) {
        Connection conn = null;
        PreparedStatement prep = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "root");
            String sql = "select*from t_User where uname=? and password=? ";
            prep = conn.prepareStatement(sql);
            prep.setString(1, u.getName());
            prep.setString(2, u.getPassword());
            ResultSet resul = prep.executeQuery();
            return resul.next();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (prep != null) {
                prep.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
