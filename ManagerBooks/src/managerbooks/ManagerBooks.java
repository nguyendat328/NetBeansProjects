/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbooks;

import javax.swing.*;

/**
 *
 * @author choco
 */
public class ManagerBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManagerBooks
     */
    public ManagerBooks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAuthor = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dialogBooks = new javax.swing.JDialog();
        alertDlogBooks = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        add = new javax.swing.JMenu();
        addAdress = new javax.swing.JMenuItem();
        addAuthor = new javax.swing.JMenuItem();
        addBook = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        dialogAuthor.setTitle("Insert Author");
        dialogAuthor.setAutoRequestFocus(false);
        dialogAuthor.setLocation(new java.awt.Point(100, 100));
        dialogAuthor.setSize(new java.awt.Dimension(400, 150));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Insert Address firsrt!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAuthorLayout = new javax.swing.GroupLayout(dialogAuthor.getContentPane());
        dialogAuthor.getContentPane().setLayout(dialogAuthorLayout);
        dialogAuthorLayout.setHorizontalGroup(
            dialogAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAuthorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(dialogAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        dialogAuthorLayout.setVerticalGroup(
            dialogAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAuthorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogBooks.setTitle("Insert Book");
        dialogBooks.setAlwaysOnTop(true);
        dialogBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogBooks.setLocation(new java.awt.Point(100, 100));
        dialogBooks.setSize(new java.awt.Dimension(400, 150));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogBooksLayout = new javax.swing.GroupLayout(dialogBooks.getContentPane());
        dialogBooks.getContentPane().setLayout(dialogBooksLayout);
        dialogBooksLayout.setHorizontalGroup(
            dialogBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBooksLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(dialogBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alertDlogBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        dialogBooksLayout.setVerticalGroup(
            dialogBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBooksLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(alertDlogBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        jTextField1.setText("jTextField1");
        mainPanel.add(jTextField1, java.awt.BorderLayout.PAGE_START);

        file.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        add.setText("Add Information");

        addAdress.setText("Add Address");
        addAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdressActionPerformed(evt);
            }
        });
        add.add(addAdress);

        addAuthor.setText("Add Author");
        addAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorActionPerformed(evt);
            }
        });
        add.add(addAuthor);

        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        add.add(addBook);

        jMenuBar1.add(add);

        jMenu1.setText("View");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void addAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdressActionPerformed
        showPanel(new panelAddress());
    }//GEN-LAST:event_addAdressActionPerformed

    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
        int k = panelAddress.listAdress.size();
        if (k == 0) {
            dialogAuthor.show();
        } else {
            showPanel(new panelAuthor());
        }
    }//GEN-LAST:event_addAuthorActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        int k1 = panelAddress.listAdress.size();
        int k2 = panelAuthor.listAuthor.size();

        if (k1 == 0) {
            dialogBooks.show();
            alertDlogBooks.setText("Please insert Address first then insert Author second!");
        } else if (k2 == 0) {
            dialogBooks.show();
            alertDlogBooks.setText("Please insert insert Author first!");
        } else {

            showPanel(new panelBooks());
        }
    }//GEN-LAST:event_addBookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogAuthor.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dialogBooks.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showPanel(JPanel panel) {

        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.validate();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu add;
    private javax.swing.JMenuItem addAdress;
    private javax.swing.JMenuItem addAuthor;
    private javax.swing.JMenuItem addBook;
    private javax.swing.JLabel alertDlogBooks;
    private javax.swing.JDialog dialogAuthor;
    private javax.swing.JDialog dialogBooks;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
