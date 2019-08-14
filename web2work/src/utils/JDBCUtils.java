package utils;

import com.mysql.jdbc.Driver;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author kmj
 * @date 2019/8/14 14:13
 * @company www.ads.com
 * @desc
 */
public class JDBCUtils {
    private static String DRIVER;
    private static String URL;
    private static String NAME;
    private static String PASSWORD;

    public static void main(String[] args) {
        System.out.println(DRIVER);
    }

    static {
        Properties prop = new Properties();
        try {
            prop.load(new FileReader("WEB-INF/resource/dao.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        DRIVER = prop.getProperty("DRIVER");
        URL = prop.getProperty("URL");
        NAME = prop.getProperty("NAME");
        PASSWORD = prop.getProperty("PASSWORD");
    }

    /*getConn*/
    public static Connection getConn() {
        //Connection conn=null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void closeAll() {
    }
}
