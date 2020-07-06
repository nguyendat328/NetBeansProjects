/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerairconditional;

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
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/managerAircandition", "root", null);
            } catch (Exception e) {
                System.out.println("Cannot connect to database");
            }
            return conn;
        } else {
            return conn;
        }
    }
}
