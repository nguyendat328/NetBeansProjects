/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt001;

import java.sql.*;

/**
 *
 * @author std
 */
public class ConnectDatabase {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BTVNN", "root", "");
            } catch (Exception e) {
                // TODO: handle exception
            }
            return conn;
        } else {
            return conn;
        }
    }
}
