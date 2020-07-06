/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerairconditional;

import java.util.*;
import java.sql.*;

/**
 *
 * @author choco
 */
public class Controller {

    public List<InforView> getInforView(String name, String status) {
        List<InforView> viewList = new ArrayList<InforView>();
        Connection conn = ConnectDatabase.getConnection();
        String query = "select a.id,a.name,b.name,a.price,a.status from Aricondition a, Type b ";
        if (name.trim().length() > 0 && status.trim().length() > 0) {
            query += " where a.name= '" + name + "' and status = '" + status + "' and a.type_id = b.id ;";
        } else if (name.trim().length() == 0 && status.trim().length() > 0) {
            query += " where status = '" + status + "' and a.type_id = b.id ;";
        } else if (name.trim().length() > 0 && status.trim().length() == 0) {
            query += " where a.name= '" + name + "'and a.type_id = b.id ;";
        } else {
            query += " where a.type_id = b.id ;";
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                Integer rsId = rs.getInt(1);
                String rsName = rs.getString(2);
                String rsType = rs.getString(3);
                Double rsPrice = rs.getDouble(4);
                String rsStatus = rs.getString(5);
                InforView lts = new InforView(rsId, rsName, rsType, rsPrice, rsStatus);
                viewList.add(lts);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return viewList;
    }

    public Boolean insertStudent(String name, String code, String created) {
        Boolean res = false;
        Connection conn = ConnectDatabase.getConnection();
        String query = "INSERT INTO Type(name,code,created,updated) values ('" + name + "','" + code + "','" + created + "','" + created + "');";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            res = true;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return res;
    }
}
