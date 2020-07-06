/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss2;

import java.sql.*;

/**
 *
 * @author choco
 */
public class NewClass {

    public static void main(String[] args) {
        System.out.println("1");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "adminm", "1");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM class");
            String str = "";
            while (rs.next()) {
                Integer idClass = rs.getInt(1);
                String nameClass = rs.getString(2);

                String codeClass = rs.getString(3);

                str += "ID: " + idClass + " Name: " + nameClass + " Code: " + codeClass;

                System.out.println("str");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("2");
    }
}
