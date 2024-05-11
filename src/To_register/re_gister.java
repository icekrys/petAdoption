/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To_register;

import config.dbConnector;
import config.passwordHasher;
import for_log_in.homedashboard;
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

        jPanel2 = new javax.swing.JPanel();
        up = new javax.swing.JComboBox<>();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        last_name = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        e_mail = new javax.swing.JLabel();
        contact_number = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        pass_word = new javax.swing.JLabel();
        pss = new javax.swing.JPasswordField();
        registerbutton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel2.add(up);
        up.setBounds(160, 330, 80, 20);

        type.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("User Type");
        jPanel2.add(type);
        type.setBounds(90, 320, 70, 40);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(211, 128, 50));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Return to Login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(540, 0, 110, 30);

        jLabel7.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(164, 87, 14));
        jLabel7.setText("Account");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(330, 30, 320, 110);

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 70)); // NOI18N
        jLabel6.setText("FurHome ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 40, 330, 90);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn);
        fn.setBounds(40, 30, 210, 30);

        first_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name.setForeground(new java.awt.Color(153, 153, 153));
        first_name.setText("First Name:");
        jPanel1.add(first_name);
        first_name.setBounds(40, 10, 100, 18);

        user_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        user_name.setForeground(new java.awt.Color(153, 153, 153));
        user_name.setText("Username:");
        jPanel1.add(user_name);
        user_name.setBounds(40, 70, 90, 20);

        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us);
        us.setBounds(40, 90, 210, 30);

        last_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        last_name.setForeground(new java.awt.Color(153, 153, 153));
        last_name.setText("Last Name:");
        jPanel1.add(last_name);
        last_name.setBounds(40, 130, 80, 20);

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln);
        ln.setBounds(40, 150, 210, 30);

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em);
        em.setBounds(300, 30, 210, 30);

        e_mail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail.setForeground(new java.awt.Color(153, 153, 153));
        e_mail.setText("Email:");
        jPanel1.add(e_mail);
        e_mail.setBounds(300, 10, 60, 20);

        contact_number.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        contact_number.setForeground(new java.awt.Color(153, 153, 153));
        contact_number.setText("Contact Number:");
        jPanel1.add(contact_number);
        contact_number.setBounds(300, 70, 110, 20);

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel1.add(cn);
        cn.setBounds(300, 90, 210, 30);

        pass_word.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        pass_word.setForeground(new java.awt.Color(153, 153, 153));
        pass_word.setText("Password:");
        jPanel1.add(pass_word);
        pass_word.setBounds(300, 130, 80, 20);

        pss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssActionPerformed(evt);
            }
        });
        jPanel1.add(pss);
        pss.setBounds(300, 150, 210, 30);

        registerbutton.setBackground(new java.awt.Color(211, 128, 50));
        registerbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        registerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbuttonMouseClicked(evt);
            }
        });
        registerbutton.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");
        registerbutton.add(jLabel2);
        jLabel2.setBounds(40, 0, 130, 30);

        jPanel1.add(registerbutton);
        registerbutton.setBounds(300, 200, 210, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 130, 550, 250);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 40, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pssActionPerformed

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void registerbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbuttonMouseClicked
        if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else if (pss.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
            pss.setText("");
        } else {
            dbConnector dbc = new dbConnector();
            try{
                String pass = passwordHasher.hashPassword(this.pss.getText());

                int insertResult = dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + us.getText() + "','" + pass + "','" + up.getSelectedItem() + "','Pending') ");

                if (insertResult == 1) {
                    JOptionPane.showMessageDialog(null, "You are now Registered!");
                    logIn up = new logIn();
                    up.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Registration Failed!");
                }
            }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_registerbuttonMouseClicked

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        homedashboard up = new homedashboard();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
    public javax.swing.JTextField cn;
    private javax.swing.JLabel contact_number;
    private javax.swing.JLabel e_mail;
    public javax.swing.JTextField em;
    private javax.swing.JLabel first_name;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel last_name;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel pass_word;
    public javax.swing.JPasswordField pss;
    private javax.swing.JPanel registerbutton;
    private javax.swing.JLabel type;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
