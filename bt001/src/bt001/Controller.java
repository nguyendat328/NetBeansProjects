package bt001;

import java.sql.*;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author choco
 */
public class Controller {

    public List<Order> getOrder(String userNameDat, String statusDat) {
        List<Order> listOrder = new ArrayList<Order>();
        Connection conn = ConnectDatabase.getConnection();

        String query = "select * from Order_BT ";
        if (userNameDat.trim().length() > 0 && statusDat.trim().length() > 0) {
            query += " where user_created = '" + userNameDat + "' and status = '" + statusDat + "';";
        } else if (userNameDat.trim().length() == 0 && statusDat.trim().length() > 0) {
            query += " where status = '" + statusDat + "';";
        } else if (userNameDat.trim().length() > 0 && statusDat.trim().length() == 0) {
            query += " where user_created = '" + userNameDat + "';";
        } else {
            query += " where 1";
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);

                String created = rs.getString(2);
                Double price = rs.getDouble(3);
                String uName = rs.getString(4);
                String status = rs.getString(5);
                Order lts = new Order(id, uName, created, price, status);

                listOrder.add(lts);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return listOrder;
    }

    public Boolean insertOrder(String uName, String created, Double price, String uStatus) {
        Boolean res = false;
        Connection conn = ConnectDatabase.getConnection();

        String query1 = "INSERT INTO order_bt(created,price,user_created,status) values ('" + created + "','" + price + "','" + uName + "','" + uStatus + "');";

        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query1);

            res = true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return res;
    }
}
