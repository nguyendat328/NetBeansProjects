

package manageruser;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class ManagerUser extends javax.swing.JFrame {
static List<UserList> newUser = new ArrayList<UserList>();
    public ManagerUser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManagerUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        findId = new javax.swing.JTextField();
        sById = new javax.swing.JButton();
        sBySalary = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        warningId = new javax.swing.JLabel();
        warningAge = new javax.swing.JLabel();
        warningEmail = new javax.swing.JLabel();
        warningSalary = new javax.swing.JLabel();
        mainAlert = new javax.swing.JLabel();
        export = new javax.swing.JButton();
        findById = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));

        ManagerUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManagerUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerUser.setText("Manager User");

        jLabel1.setText("ID:");

        jLabel2.setText("Age:");

        jLabel3.setText("Email:");

        jLabel4.setText("Salary:");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(0, 255, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        jLabel5.setText("Find by ID");

        sById.setBackground(new java.awt.Color(51, 51, 255));
        sById.setForeground(new java.awt.Color(255, 255, 255));
        sById.setText("Sort by ID");
        sById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sByIdActionPerformed(evt);
            }
        });

        sBySalary.setBackground(new java.awt.Color(255, 153, 0));
        sBySalary.setText("Sort by Salary");
        sBySalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBySalaryActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        warningId.setForeground(new java.awt.Color(255, 0, 0));

        warningAge.setForeground(new java.awt.Color(255, 0, 0));

        warningEmail.setForeground(new java.awt.Color(255, 0, 0));

        warningSalary.setForeground(new java.awt.Color(255, 0, 0));

        mainAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        export.setBackground(new java.awt.Color(0, 255, 102));
        export.setText("Export File");
        export.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                exportComponentShown(evt);
            }
        });
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        findById.setText("Find");
        findById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findByIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(warningEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(warningSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sById, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sBySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(findId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findById)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submit)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(ManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(id)
                                    .addComponent(warningId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(warningAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(warningId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningAge, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(warningEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(warningSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(findId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset)
                    .addComponent(submit)
                    .addComponent(findById))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sById)
                    .addComponent(sBySalary)
                    .addComponent(exit)
                    .addComponent(export))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(mainAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void sBySalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBySalaryActionPerformed
        if(newUser.size()>0){
            Collections.sort(newUser, new Comparator<UserList>() {
               @Override
               public int compare(UserList o1, UserList o2) {
                   return  o1.getSalary().compareTo(o2.getSalary());

               }
           });
            String str ="";
                 for(UserList lts : newUser){
                     str+= lts.getId() + "   " +lts.getAge() + "   "+lts.getEmail()+ "   "+lts.getSalary()+"\n";   
                 }
                 message.setText(str);
                 mainAlert.setText("Sort by Salary susscessfully!");
                 
        }else{
             mainAlert.setText("List empty!");
        }
    }//GEN-LAST:event_sBySalaryActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int ck =0;
        Integer ids=0; 
        Integer ages=0 ;
        Integer salarys=0;
        String  emails="";
        if(isNumber(id.getText())){
                 ids   = Integer.parseInt(id.getText()); 
            ck+=1;
        }else{
            
            warningId.setText("ID must be Integer and greater than 0");
        }
        
        if(isNumber(age.getText())){
                 ages   = Integer.parseInt(age.getText());  
            ck+=1;
        }else{
            
            warningAge.setText("Age must be Integer and greater than 0");
        }
       
        if(isNumber(salary.getText())){
                 salarys   = Integer.parseInt(salary.getText()); 
             ck+=1;
        }else{
            
            warningSalary.setText("Salary must be Integer and greater than 0");
        }
         
        if(isEmail(email.getText())){
                 emails = email.getText();
             ck+=1;
        }else{
            
            warningEmail.setText("Email is not valid");
        }       
        if(ck==4)   {
            UserList newRecord = new UserList(ids, ages, emails, salarys);
             newUser.add(newRecord);
             String str ="";
             for(UserList lts : newUser){
                 str+= lts.getId() + "   " +lts.getAge() + "   "+lts.getEmail()+ "   "+lts.getSalary()+"\n";   
             }
             message.setText(str);
             String s="";
             id.setText(s);
             age.setText(s);
             email.setText(s);
             salary.setText(s);
             warningId.setText(s);
             warningAge.setText(s);
             warningEmail.setText(s);
             warningSalary.setText(s);
             mainAlert.setText("");
        }
         
             
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         String s="";
             id.setText(s);
             age.setText(s);
             email.setText(s);
             salary.setText(s);
             warningId.setText(s);
             warningAge.setText(s);
             warningEmail.setText(s);
             warningSalary.setText(s);
              mainAlert.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
          String filename = "C:\\Users\\choco\\Documents\\NetBeansProjects\\ManagerUser\\src\\UserList.txt";
          String str="";
        if(newUser.size()>0){
            
            try {
                String data ="";
                for(UserList lts: newUser) {
                    str+= lts.getId() + "   " +lts.getAge() + "   "+lts.getEmail()+ "   "+lts.getSalary()+"\n";  
                }
                File file = new File(filename);

                // kiểm tra nếu file chưa có thì tạo file mới
                if (!file.exists()) {
                    file.createNewFile();
                }
                // true = append file
                //FileWriter fw = new FileWriter(file,true);

                FileWriter fw = new FileWriter(file);
                fw.write(str);
                fw.close();
                mainAlert.setText("Export complete!");
            } catch (Exception e) {
                 mainAlert.setText("Have errors!");
            }
        }else{
              mainAlert.setText("List empty!");
        }
    }//GEN-LAST:event_exportActionPerformed

    private void findByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findByIdActionPerformed
        if(isNumber(findId.getText())){
              int   fId  = Integer.parseInt(findId.getText()); 
              String str="";
              int ck=0;
              for(UserList lts: newUser){
                  if(lts.getId()==fId){
                      str+= lts.getId() + "   " +lts.getAge() + "   "+lts.getEmail()+ "   "+lts.getSalary()+"\n";  
                      ck=1;
                  }
              }
              if(ck==1){
                  message.setText(str);
              }else{
                  message.setText("Not found, Please check agint");
              }
            
        }else{
            
            message.setText("ID must be Integer and greater than 0");
        }
    }//GEN-LAST:event_findByIdActionPerformed

    private void exportComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_exportComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_exportComponentShown

    private void sByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sByIdActionPerformed
        // TODO add your handling code here:
        if(newUser.size()>0){
            Collections.sort(newUser, new Comparator<UserList>() {
               @Override
               public int compare(UserList o1, UserList o2) {
                   return  o1.getId().compareTo(o2.getId());

               }
           });
            String str ="";
                 for(UserList lts : newUser){
                     str+= lts.getId() + "   " +lts.getAge() + "   "+lts.getEmail()+ "   "+lts.getSalary()+"\n";   
                 }
                 message.setText(str);
                 mainAlert.setText("Sort by Id susscessfully!");
        }else{
            mainAlert.setText("List empty!");
        }
    }//GEN-LAST:event_sByIdActionPerformed
//    private void List<UserList> enterList(List<UserList> newUser){
//
//        return newUser;
//    }
    /**
     * @param args the command line arguments
     */
    private boolean isNumber(String a){
        String regex_number  = "[0-9]+";
       if(Pattern.matches(regex_number, a)){
           if(Integer.parseInt(a)>0){
               return true;
           }
       }
        return false;
    }
    private boolean isEmail(String a){
        String regex_email  =  "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
       if(Pattern.matches(regex_email, a)){      
               return true;     
       } 
        return false;
    }
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
            java.util.logging.Logger.getLogger(ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManagerUser;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JButton export;
    private javax.swing.JButton findById;
    private javax.swing.JTextField findId;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainAlert;
    private javax.swing.JTextArea message;
    private javax.swing.JButton reset;
    private javax.swing.JButton sById;
    private javax.swing.JButton sBySalary;
    private javax.swing.JTextField salary;
    private javax.swing.JButton submit;
    private javax.swing.JLabel warningAge;
    private javax.swing.JLabel warningEmail;
    private javax.swing.JLabel warningId;
    private javax.swing.JLabel warningSalary;
    // End of variables declaration//GEN-END:variables

}
