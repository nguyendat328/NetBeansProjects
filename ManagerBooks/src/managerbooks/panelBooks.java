/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbooks;

import java.util.*;
import java.util.regex.*;
import javax.swing.*;

/**
 *
 * @author choco
 */
public class panelBooks extends javax.swing.JPanel {

    static List<Books> listBooks = new ArrayList<Books>();
    List<String> listIdBooks = new ArrayList<String>();

    /**
     * Creates new form panelBooks
     */
    public panelBooks() {
        initComponents();
        formatCombobx(authorCombo);
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
        code1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        alertPrice1 = new javax.swing.JLabel();
        authorCombo1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jlabel5 = new javax.swing.JLabel();
        canel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        idEditField = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        authorCombo = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alertPrice = new javax.swing.JLabel();
        alertId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alertAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainView = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        idAction = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        alertAction = new javax.swing.JLabel();
        viewall = new javax.swing.JButton();

        jFrame1.setTitle("Edit Books");
        jFrame1.setAlwaysOnTop(true);
        jFrame1.setLocation(new java.awt.Point(50, 50));
        jFrame1.setSize(new java.awt.Dimension(370, 400));

        jLabel6.setText("Code:");

        jLabel7.setText("Price:");

        jLabel8.setText("Author Id:");

        jlabel4.setText("Name:");

        jlabel5.setText("ID:");

        canel.setText("Cancel");
        canel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel5)
                    .addComponent(jLabel7)
                    .addComponent(jlabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(code1)
                    .addComponent(price1)
                    .addComponent(name1)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(alertPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(authorCombo1, 0, 267, Short.MAX_VALUE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(idEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update)
                .addGap(10, 10, 10))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel5)
                    .addComponent(idEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel4))
                .addGap(33, 33, 33)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canel)
                    .addComponent(update))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlabel2.setText("ID:");

        jlabel3.setText("Name:");

        jLabel4.setText("Price:");

        jLabel2.setText("Author Id:");

        jLabel5.setText("Code:");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Book");

        mainView.setColumns(20);
        mainView.setRows(5);
        jScrollPane1.setViewportView(mainView);

        jLabel3.setText("Acition Id:");

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Delete");

        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel2)
                            .addComponent(jLabel4)
                            .addComponent(jlabel3)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(price)
                            .addComponent(id)
                            .addComponent(alertId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alertPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(authorCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alertAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alertAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idAction, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewall)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add)
                    .addComponent(alertAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(idAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit)
                        .addComponent(viewall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertAction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int ck = 0;
        String ids = "";
        String names = "";
        String authorId = "";
        String codes = "";
        int prices = 0;
        if (!listIdBooks.contains(id.getText().trim())) {
            ids = id.getText().trim();
            ck += 1;
            alertId.setText("");

        } else {
            alertId.setText("Id has existted! ");
        }
        names = name.getText().trim();
        codes = code.getText().trim();
        if (isNumber(price.getText().trim())) {
            prices = Integer.parseInt(price.getText().trim());
            ck += 1;
            alertPrice.setText("");

        } else {
            alertPrice.setText("Price must be Number and greater than 0! ");
        }
        if (!authorCombo.getSelectedItem().equals("Select")) {
            authorId = authorCombo.getSelectedItem().toString();
            ck += 1;
        }
        if (ck == 3) {
            Books newBooks = new Books(ids, names, authorId, prices, codes);
            listBooks.add(newBooks);
            listIdBooks.add(ids);
            alertAdd.setText("Add Successfuly!");
            printOut(listBooks, mainView);
        } else {
            alertAdd.setText("");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String idEdit = "";
        int ck = 0;
        idEdit = idAction.getText().trim();
        for (Books lts : listBooks) {
            if (lts.getId().equals(idEdit)) {
                ck += 1;
            }
        }

        if (ck > 0) {
            alertAction.setText("");
            idEditField.setText(idAction.getText().trim());

            jFrame1.show();
            //chuyen dl qua
            for (Books lts : listBooks) {
                if (lts.getId().equals(idEdit)) {
                    name1.setText(lts.getName());
                    price1.setText(lts.getPrice().toString());
                    code1.setText(lts.getCode());
                }
            }
            formatCombobx(authorCombo1);

        } else {
            alertAction.setText("Please check Id agian! ");
        }
    }//GEN-LAST:event_editActionPerformed

    private void canelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canelActionPerformed
        jFrame1.hide();
    }//GEN-LAST:event_canelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int ck = 0;
        String idEdit = idEditField.getText();
        String names = "";
        String authorId = "";
        String codes = "";
        int prices = 0;

        names = name1.getText().trim();
        codes = code1.getText().trim();
        if (isNumber(price1.getText().trim())) {
            prices = Integer.parseInt(price.getText().trim());
            ck += 1;
            alertPrice1.setText("");

        } else {
            alertPrice1.setText("Price must be Number and greater than 0! ");
        }

        if (!authorCombo1.getSelectedItem().equals("Select")) {
            authorId = authorCombo1.getSelectedItem().toString();
            ck += 1;
        }
        if (ck == 2) {
            for (Books lts : listBooks) {
                if (lts.getId().equals(idEdit)) {
                    lts.setName(names);
                    lts.setAuthor_id(authorId);
                    lts.setCode(codes);
                    lts.setPrice(prices);

                }
            }
            alertAction.setText("Update complete! ");
            printOut(listBooks, mainView);
            jFrame1.hide();

        } else {
            alertAdd.setText("");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        printOut(listBooks, mainView);
    }//GEN-LAST:event_viewallActionPerformed

    private void printOut(List<Books> list, JTextArea field) {
        String str = "";
        for (Books lts : list) {
            str += "ID: " + lts.getId() + " Name: " + lts.getName() + " Price: " + lts.getPrice() + " Code : " + lts.getCode() + " Author_ID: " + lts.getAuthor_id() + "\n";
        }
        field.setText(str);
    }

    private void formatCombobx(JComboBox list) {
        list.removeAllItems();
        list.addItem("Select");
        for (Author lts : panelAuthor.listAuthor) {
            list.addItem(lts.getId().toString());
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
    private javax.swing.JLabel alertAction;
    private javax.swing.JLabel alertAdd;
    private javax.swing.JLabel alertId;
    private javax.swing.JLabel alertPrice;
    private javax.swing.JLabel alertPrice1;
    private javax.swing.JComboBox<String> authorCombo;
    private javax.swing.JComboBox<String> authorCombo1;
    private javax.swing.JButton canel;
    private javax.swing.JTextField code;
    private javax.swing.JTextField code1;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idAction;
    private javax.swing.JLabel idEditField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JTextArea mainView;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JButton update;
    private javax.swing.JButton viewall;
    // End of variables declaration//GEN-END:variables
}
