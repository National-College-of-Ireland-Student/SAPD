/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author bikash
 */
public class DB {

    public static String user = "root";    
    public static String connection = "jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false";
    //public static String connection = "jdbc:mysql://192.168.0.149.2:3306/?user=root";
    //public static String connection = "jdbc:mysql://192.168.0.149:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&u\n" +"seLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Properties props = new Properties();
            props.put("user", user);        
            props.put("password","root1234"); // password all small is default in wb
            props.put("useUnicode", "true");
            props.put("useServerPrepStmts", "false"); // use client-side prepared statement
            props.put("characterEncoding", "UTF-8"); // ensure charset is utf8 here

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connection, props);
        } catch (Exception e) {
            System.out.println("problem here " + e.getMessage());
            
        }
        return con;
    }

}
