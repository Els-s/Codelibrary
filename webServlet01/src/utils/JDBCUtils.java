package utils;

import java.sql.*;

/**
 * @author kmj
 * @date 2019/8/15 19:48
 * @company www.ads.com
 * @desc
 */
public class JDBCUtils {
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void closeAll(Connection conn, PreparedStatement prep, ResultSet resul){
        try {
            if (resul != null) {
                resul.close();
            }
            if (prep != null) {
                prep.close();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
