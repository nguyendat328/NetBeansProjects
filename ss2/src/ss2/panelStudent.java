/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss2;

import java.util.*;

import java.util.regex.*;
import javax.swing.*;

/**
 *
 * @author choco
 */
public class panelStudent extends javax.swing.JPanel {

    //Map<Integer, List<Students>> mapStudent = new HashMap<Integer, List<Students>>();
    List<Students> listStudent = new ArrayList<Students>();
    Set<String> listIdStudent = new HashSet<String>();

    /**
     * Creates new form panelStudent
     */
    public panelStudent() {
        initComponents();
        formatCombobx(listClass);
        listClass2.removeAllItems();
        listClass2.addItem("Select Class");
        for (ClassStudent lts : panelClass.newClass) {
            listClass2.addItem(lts.getCode().toString());
        }
        listClass2.addItem("All");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        age1 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        alertAge1 = new javax.swing.JLabel();
        alertName1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        listClassEdit = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        idEditField = new javax.swing.JLabel();
        alertClassEdit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listClass = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        deleteId = new javax.swing.JButton();
        editId = new javax.swing.JButton();
        idAction = new javax.swing.JTextField();
        alertId = new javax.swing.JLabel();
        alertName = new javax.swing.JLabel();
        alertAge = new javax.swing.JLabel();
        alertAdd = new javax.swing.JLabel();
        alertClass = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        listClass2 = new javax.swing.JComboBox<>();
        viewStudent = new javax.swing.JButton();
        alertClass2 = new javax.swing.JLabel();
        alertAction = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainView = new javax.swing.JTextArea();

        jFrame1.setBounds(new java.awt.Rectangle(50, 50, 500, 500));

        jLabel1.setText("Update Field");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setText("Address:");

        jLabel11.setText("Age:");

        jLabel12.setText("Name:");

        listClassEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClassEditActionPerformed(evt);
            }
        });

        jLabel14.setText("Class:");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alertAge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name1)
                                    .addComponent(age1)
                                    .addComponent(address1)
                                    .addComponent(listClassEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alertName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(idEditField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)
                                .addGap(9, 9, 9))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(alertClassEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(7, 7, 7)
                .addComponent(alertName1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listClassEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alertClassEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(update))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idEditField)
                        .addGap(36, 36, 36))))
        );

        jLabel2.setText("Id:");

        jLabel3.setText("Name:");

        jLabel4.setText("Age:");

        jLabel5.setText("Address:");

        listClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClassActionPerformed(evt);
            }
        });

        jLabel6.setText("Class:");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel7.setText("Action with ID:");

        deleteId.setText("Delete");
        deleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIdActionPerformed(evt);
            }
        });

        editId.setText("Edit");
        editId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIdActionPerformed(evt);
            }
        });

        jLabel8.setText("Select class to view:");

        viewStudent.setText("View");
        viewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentActionPerformed(evt);
            }
        });

        mainView.setColumns(20);
        mainView.setRows(5);
        jScrollPane1.setViewportView(mainView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(alertId, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alertClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alertAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(id)
                                    .addComponent(name)
                                    .addComponent(age)
                                    .addComponent(address)
                                    .addComponent(listClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alertName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alertAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(alertAction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(alertClass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(listClass2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(idAction, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteId)))
                                        .addGap(18, 18, 18)
                                        .addComponent(viewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addComponent(alertName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(alertAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(listClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertClass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editId)
                    .addComponent(jLabel7)
                    .addComponent(idAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteId))
                .addGap(5, 5, 5)
                .addComponent(alertAction, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(listClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewStudent))
                .addGap(1, 1, 1)
                .addComponent(alertClass2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        int ck = 0;
        int ids = 0;
        int ages = 0;
        int classId = 0;
        String names = "";
        String adds = "";
        if (isNumber(id.getText()) && !(listIdStudent.contains(id.getText()))) {

            ids = Integer.parseInt(id.getText());
            ck += 1;
        } else {
            alertId.setText("Id is Interger and don't duplicate");
        }
        if (isNumber(age.getText())) {
            ages = Integer.parseInt(age.getText());
            ck += 1;
        } else {
            alertAge.setText("Age is Interger");
        }
        if (name.getText().trim().length() != 0) {
            names = name.getText();
            ck += 1;
        } else {
            alertName.setText("Name must be filled");
        }
        adds = address.getText();
        String codeClassC = listClass.getSelectedItem().toString();
        if (codeClassC.equals("Select Class")) {
            alertClass.setText("Please choose another Item!");

        } else {

            String k = codeClassC;
            alertClass.setText("");
            for (ClassStudent lts : panelClass.newClass) {
                if (lts.getCode().equals(k)) {
                    classId = lts.getId();
                    ck += 1;
                }
            }

        }

        if (ck == 4) {
            listIdStudent.add(id.getText());
            Students newRecord = new Students(ids, names, ages, adds, classId);
            listStudent.add(newRecord);
            clearAll();
        }

        String str1 = "List Student of class: " + codeClassC + "\n";

        String str2 = "";
        for (Students lts : listStudent) {
            if (lts.getClass_Id() == classId) {
                str2 += "Id: " + lts.getId() + " Name: " + lts.getFullName() + " Age: " + lts.getAge() + " Address: " + lts.getAdress() + "\n";
            }
        }
        mainView.setText(str1 + str2);

    }//GEN-LAST:event_addActionPerformed
// tại sao viết function lại lỗi
//    private void printOut(Students newStudent, int class_Id) {
//        for (Students lts : listStudent) {
//            Integer id1 = lts.getId();
//        }
//    }
    private void listClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listClassActionPerformed

    private void clearAll() {
        String s = "";
        id.setText(s);
        age.setText(s);
        name.setText(s);
        address.setText(s);
        alertAdd.setText(s);
        alertAge.setText(s);
        alertClass.setText(s);
        alertClass2.setText(s);
        alertId.setText(s);
        alertName.setText(s);
    }
    private void viewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentActionPerformed
        String codeClassC = listClass2.getSelectedItem().toString();

        mainView.setText("");
        if (codeClassC.equals("Select Class")) {
            alertClass2.setText("Please choose another Item!");

        } else if (codeClassC.equals("All")) {
            String mainStr = "";
            alertClass2.setText("");
            for (ClassStudent lts : panelClass.newClass) {
                String str1 = "\nList Student of class: " + lts.getCode() + "\n";
                String str2 = "";
                for (Students lts2 : listStudent) {
                    if (lts2.getClass_Id() == lts.getId()) {
                        str2 += "Id: " + lts2.getId() + " Name: " + lts2.getFullName() + " Age: " + lts2.getAge() + " Address: " + lts2.getAdress() + "\n";
                    }
                }
                mainStr += str1 + str2;
            }
            mainView.setText(mainStr);

        } else {
            String str1 = "\nList Student of class: " + codeClassC + "\n";
            String str2 = "";
            int idClass = 0;
            for (ClassStudent lts : panelClass.newClass) {
                if (lts.getCode().equals(codeClassC)) {
                    idClass = lts.getId();
                }
            }
            for (Students lts2 : listStudent) {
                if (lts2.getClass_Id() == idClass) {
                    str2 += "Id: " + lts2.getId() + " Name: " + lts2.getFullName() + " Age: " + lts2.getAge() + " Address: " + lts2.getAdress() + "\n";
                }
            }
            mainView.setText(str1 + str2);
        }

    }//GEN-LAST:event_viewStudentActionPerformed

    private void editIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIdActionPerformed
        // TODO add your handling code here:
        int idEdit = 0;

        if (isNumber(idAction.getText()) && listStudent.size() > 0) {
            alertAction.setText("");
            idEdit = Integer.parseInt(idAction.getText());
            idEditField.setText(idAction.getText());

            jFrame1.show();
            //chuyen dl qua
            for (Students lts : listStudent) {
                if (lts.getId() == idEdit) {
                    name1.setText(lts.getFullName());
                    age1.setText(lts.getAge().toString());
                    address1.setText(lts.getAdress());
                }
            }
            formatCombobx(listClassEdit);

        } else {
            alertAction.setText("Id is Interger and must have Student ");
        }
    }//GEN-LAST:event_editIdActionPerformed

    private void listClassEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClassEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listClassEditActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        jFrame1.hide();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int f = 0;
        int ages = 0;
        int classIds = 0;
        String names = "";
        String adds = "";
        int idEdit = Integer.parseInt(idEditField.getText());

        if (isNumber(age1.getText())) {
            ages = Integer.parseInt(age1.getText());
            f += 1;
        } else {
            alertAge1.setText("Age is Interger");
        }

        if (name1.getText().trim().length() != 0) {
            names = name1.getText();
            f += 1;
        } else {
            alertName1.setText("Name must be filled");
        }

        adds = address1.getText();

        String codeClass = listClassEdit.getSelectedItem().toString();

//        if (codeClass.equals("Select Class")) {
//            alertClassEdit.setText("Please choose another Item!");
//        } else
        if (!listClassEdit.getSelectedItem().equals("Select Class")) {
            String k = listClassEdit.getSelectedItem().toString();
            alertClass.setText("");
            for (ClassStudent lts : panelClass.newClass) {
                if (lts.getCode().equals(k)) {
                    classIds = lts.getId();
                    f += 1;
                }
            }

        }

        if (f == 3) {

            for (Students lts : listStudent) {
                if (lts.getId() == idEdit) {
                    lts.setFullName(names);
                    lts.setAge(ages);
                    lts.setAdress(adds);
                    lts.setClass_Id(classIds);
                }
            }
            String s = "";

            age1.setText(s);
            name1.setText(s);
            address1.setText(s);
            alertName1.setText(s);
            alertAction.setText("Edit COmplete!");
            jFrame1.hide();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIdActionPerformed
        int idDelete = 0;

        if (isNumber(idAction.getText()) && listStudent.size() > 0) {
            alertAction.setText("");
            idDelete = Integer.parseInt(idAction.getText());
            listIdStudent.remove(idAction.getText());
            for (int i = 0; i < listStudent.size(); i++) {
                if (listStudent.get(i).getId() == idDelete) {
                    listStudent.remove(i);
                }
            }
            alertAction.setText("Delete COmplete!");
        }
    }//GEN-LAST:event_deleteIdActionPerformed

    private void formatCombobx(JComboBox list) {
        list.removeAllItems();
        list.addItem("Select Class");
        for (ClassStudent lts : panelClass.newClass) {
            list.addItem(lts.getCode().toString());
        }

    }

    private boolean isNumber(String a) {
        String regex_number = "[0-9]+";
        if (Pattern.matches(regex_number, a)) {
            if (Integer.parseInt(a) > 0) {
                return true;
            }
        }
        return false;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField age;
    private javax.swing.JTextField age1;
    private javax.swing.JLabel alertAction;
    private javax.swing.JLabel alertAdd;
    private javax.swing.JLabel alertAge;
    private javax.swing.JLabel alertAge1;
    private javax.swing.JLabel alertClass;
    private javax.swing.JLabel alertClass2;
    private javax.swing.JLabel alertClassEdit;
    private javax.swing.JLabel alertId;
    private javax.swing.JLabel alertName;
    private javax.swing.JLabel alertName1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deleteId;
    private javax.swing.JButton editId;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idAction;
    private javax.swing.JLabel idEditField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listClass;
    private javax.swing.JComboBox<String> listClass2;
    private javax.swing.JComboBox<String> listClassEdit;
    private javax.swing.JTextArea mainView;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JButton update;
    private javax.swing.JButton viewStudent;
    // End of variables declaration//GEN-END:variables
}