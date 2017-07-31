package dao;

import java.io.*;
import java.sql.*;
import java.util.*;

public class DBUtil {

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        Properties prop = new Properties();

        Reader r;
        try {
            r = new FileReader("src/dao/config.properties");
            prop.load(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        username = prop.getProperty("user");
        password = prop.getProperty("password");
    }

    public static Connection open() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn) {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
