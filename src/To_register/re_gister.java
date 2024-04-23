/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To_register;

import config.dbConnector;
import config.passwordHasher;
import for_log_in.logIn;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class re_gister extends javax.swing.JFrame {

    /**
     * Creates new form re_gister
     */
    public re_gister() {
        initComponents();
    }

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

        registerdesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        registerform = new javax.swing.JPanel();
        us = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        contact_number = new javax.swing.JLabel();
        pass_word = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ln = new javax.swing.JTextField();
        e_mail = new javax.swing.JLabel();
        pss = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        registerform.setBackground(new java.awt.Color(204, 204, 255));
        registerform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerform.setToolTipText("");
        registerform.setLayout(null);

        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        registerform.add(us);
        us.setBounds(380, 90, 130, 30);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        registerform.add(fn);
        fn.setBounds(60, 90, 140, 30);

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        registerform.add(cn);
        cn.setBounds(230, 220, 130, 30);

        first_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name.setText("First Name:");
        registerform.add(first_name);
        first_name.setBounds(60, 70, 90, 18);

        last_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        last_name.setText("Last Name:");
        registerform.add(last_name);
        last_name.setBounds(230, 70, 70, 20);

        user_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        user_name.setText("Username:");
        registerform.add(user_name);
        user_name.setBounds(380, 70, 80, 20);

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        registerform.add(em);
        em.setBounds(230, 170, 130, 30);

        contact_number.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        contact_number.setText("Contact Number:");
        registerform.add(contact_number);
        contact_number.setBounds(120, 230, 110, 20);

        pass_word.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        pass_word.setText("Password:");
        registerform.add(pass_word);
        pass_word.setBounds(380, 150, 70, 20);

        type.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        type.setText("User Type");
        registerform.add(type);
        type.setBounds(60, 140, 70, 18);

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        registerform.add(up);
        up.setBounds(60, 160, 80, 20);

        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        registerform.add(jButton1);
        jButton1.setBounds(420, 210, 90, 30);
        registerform.add(ln);
        ln.setBounds(230, 90, 130, 30);

        e_mail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail.setText("Email:");
        registerform.add(e_mail);
        e_mail.setBounds(230, 150, 50, 20);

        pss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssActionPerformed(evt);
            }
        });
        registerform.add(pss);
        pss.setBounds(380, 170, 130, 30);

        jPanel1.add(registerform);
        registerform.setBounds(50, 170, 580, 280);

        registerdesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout registerdesktopLayout = new javax.swing.GroupLayout(registerdesktop);
        registerdesktop.setLayout(registerdesktopLayout);
        registerdesktopLayout.setHorizontalGroup(
            registerdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        registerdesktopLayout.setVerticalGroup(
            registerdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerdesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerdesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pssActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else if (pss.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            pss.setText("");
        } else {
            dbConnector dbc = new dbConnector();
            try{
                String pass = passwordHasher.hashPassword(pss.getText());

                int insertResult = dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + us.getText() + "','" + pass + "','" + up.getSelectedItem() + "','Pending') ");

                if (insertResult == 1) {
                    JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                    logIn up = new logIn();
                    up.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Insert Failed!");
                }
            }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

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
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(re_gister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new re_gister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cn;
    private javax.swing.JLabel contact_number;
    private javax.swing.JLabel e_mail;
    private javax.swing.JTextField em;
    private javax.swing.JLabel first_name;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel last_name;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel pass_word;
    private javax.swing.JPasswordField pss;
    private javax.swing.JDesktopPane registerdesktop;
    private javax.swing.JPanel registerform;
    private javax.swing.JLabel type;
    private javax.swing.JComboBox<String> up;
    private javax.swing.JTextField us;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
