/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbooks;

import javax.swing.*;
import sun.applet.Main;

/**
 *
 * @author choco
 */
public class NewClass {

    JFrame f;

    NewClass() {
//        f = new JFrame();
//        String[] header = {"No", "Name", "Age", "Class", "Subject"};
//        Object[][] data = {
//            {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
//            {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)}
//        };
//        JTable table = new JTable(data, header);
//        JScrollPane sp = new JScrollPane(table);
//        f.add(sp);
//        f.setSize(510, 500);
//        f.setVisible(true);
        f = new JFrame();

        String data[][] = {{"101", "Tran Van Minh", "6000"},
        {"102", "Phan Van Tai", "8000"},
        {"101", "Do Cao Hoc", "7000"}};
        String column[] = {"ID", "NAME", "SALARY"};

        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);

        f.setSize(500, 300);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new NewClass();
    }

}
