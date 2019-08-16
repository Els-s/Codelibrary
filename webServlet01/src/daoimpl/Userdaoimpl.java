package daoimpl;

import bean.User;
import dao.UserDao;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kmj
 * @date 2019/8/15 19:41
 * @company www.ads.com
 * @desc
 */
public class Userdaoimpl implements UserDao {
    /*登陆*/
    public boolean Landing(User u) {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet resul = null;
        try {
            conn = JDBCUtils.getConn();
            String sql = "select * from t_User where uname=? and password=?";
            prep = conn.prepareStatement(sql);
            prep.setString(1, u.getUsername());
            prep.setString(2, u.getPassword());
            resul = prep.executeQuery();
            return resul.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtils.closeAll(conn, prep, resul);
        return false;
    }

    /*注册*/
    public boolean Login(User u) {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet resul = null;
        try {
            conn = JDBCUtils.getConn();
            String sql = "insert into t_User(username,password,phone,email) values (?,?,?,?)";
            prep = conn.prepareStatement(sql);
            prep.setString(1, u.getUsername());
            prep.setString(2, u.getPassword());
            prep.setString(3, u.getPhone());
            prep.setString(4, u.getEmail());
            int i = prep.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtils.closeAll(conn, prep, resul);
        return false;
    }
}