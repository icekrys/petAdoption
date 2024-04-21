/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import internalpages.internalusers;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class add_userform extends javax.swing.JFrame {

    /**
     * Creates new form add_userform
     */
    public add_userform() {
        initComponents();
    }
    public void close(){
    this.dispose();
    admindashboard dash = new admindashboard();
    dash.setVisible(true);
    internalusers up = new internalusers();
    up.setVisible(true);
    }
    
       public String action;
       public static String email, usname;

    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();

    
    try{
        
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + us.getText() + "' OR u_email = '" + em.getText() + "'";
             ResultSet resultSet = dbc.getData(query);
                if(resultSet.next()){
                
               
                    email = resultSet.getString("u_email");
                    System.out.println(""+email);
                        if(email.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Email is Already Used");
                            em.setText("");
                        }
                    
                     usname = resultSet.getString("u_username");
                    System.out.println(""+usname);
                        if(usname.equals(em.getText())){
                            JOptionPane.showMessageDialog(null,"Username is Already Used");
                            us.setText("");
                        }
      
                        return true;
                }else{
                
                    return false;
                
                }
             }catch(SQLException ex){
                 System.out.println(""+ex);
                 return false;
              }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sform = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        st_label = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JLabel();
        usta = new javax.swing.JComboBox<>();
        pss = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(100, 80, 590, 20);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        st_label.setText("Save");
        st_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_labelMouseClicked(evt);
            }
        });
        st_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_labelActionPerformed(evt);
            }
        });
        jPanel4.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 90, 30));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("Password:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 70, 20));

        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel4.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, 30));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setText("Username:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 80, 20));
        jPanel4.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 130, 30));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setText("Last Name:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 70, 20));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel11.setText("Email:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 50, 20));

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel4.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, 30));

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel4.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 30));

        jLabel14.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel14.setText("Contact Number:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, -1));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel4.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 30));

        jLabel15.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel15.setText("First Name:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, -1));

        type.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type.setText("Account Type");
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, -1));

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel4.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, -1));

        type1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type1.setText("Account Status");
        jPanel4.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, -1));

        usta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        usta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustaActionPerformed(evt);
            }
        });
        jPanel4.add(usta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 80, -1));
        jPanel4.add(pss, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 140, 30));

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        jLabel16.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel16.setText("User ID:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(100, 100, 600, 350);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exit");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(650, 4, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, -20, 630, 500);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 30, 620, 400);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 130, 620, 480);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 10, 610, 490);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Back");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel12);
        jLabel12.setBounds(0, 0, 40, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 690, 30);

        sform.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sformLayout = new javax.swing.GroupLayout(sform);
        sform.setLayout(sformLayout);
        sformLayout.setHorizontalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        sformLayout.setVerticalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        jPanel1.add(sform);
        sform.setBounds(0, 0, 689, 454);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void st_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseClicked
        dbConnector dbc = new dbConnector();
        if(action.equals("Add")){     
           int result = dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_username,"
                   + "u_password,u_type, u_status)VALUES('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"'"
                           + ",'"+us.getText()+"','"+pss.getText()+"','"+up.getSelectedItem()+"'"
                                   + ",'"+usta.getSelectedItem()+"')");
        if(result==1){
            JOptionPane.showMessageDialog(null, "Successfully Save");
           close();
        }else{
            System.out.println("Saving Data Failed");
        } 
            }else if(action.equals("Update")){
                dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"',u_lname = '"+ln.getText()+"'"
                        + ",u_email = '"+em.getText()+"',u_username = '"+us.getText()+"', u_password = '"
                        +pss.getText()+"',u_type = '"+up.getSelectedItem()+"',u_status = '"
                        +usta.getSelectedItem()+"'");
                        close();
        }
    }//GEN-LAST:event_st_labelMouseClicked

    private void st_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_labelActionPerformed
      if(fn.getText().isEmpty()||em.getText().isEmpty()||us.getText().isEmpty()||pss.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields are required");
        }else if(pss.getText().length() < 8){

            JOptionPane.showMessageDialog(null,"Maximum 8 characters");
            pss.setText("");
        }  
    }//GEN-LAST:event_st_labelActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void ustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustaActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        internalusers up = new internalusers();
        sform.add(up).setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        close();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_userform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cn;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pss;
    private javax.swing.JDesktopPane sform;
    public javax.swing.JButton st_label;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> usta;
    // End of variables declaration//GEN-END:variables
}
