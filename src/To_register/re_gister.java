/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To_register;

import config.dbConnector;
import for_log_in.logIn;
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
        jLabel9 = new javax.swing.JLabel();
        registerform = new javax.swing.JPanel();
        us = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        up = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pss = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dogsandcats.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 10, 600, 230);

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

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");
        registerform.add(jLabel4);
        jLabel4.setBounds(60, 70, 90, 18);

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setText("Last Name:");
        registerform.add(jLabel5);
        jLabel5.setBounds(230, 70, 70, 20);

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("Username:");
        registerform.add(jLabel7);
        jLabel7.setBounds(380, 70, 80, 20);

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        registerform.add(em);
        em.setBounds(230, 170, 130, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("Contact Number:");
        registerform.add(jLabel2);
        jLabel2.setBounds(120, 230, 110, 20);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setText("Password:");
        registerform.add(jLabel3);
        jLabel3.setBounds(380, 150, 70, 20);

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

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("Email:");
        registerform.add(jLabel6);
        jLabel6.setBounds(230, 150, 50, 20);
        registerform.add(pss);
        pss.setBounds(380, 170, 130, 30);

        jPanel1.add(registerform);
        registerform.setBounds(50, 170, 580, 280);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/77281cb6d94e94c2d71bacdba9d74d7f.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 40, 840, 660);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 0, 40, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 690, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/77281cb6d94e94c2d71bacdba9d74d7f.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-120, 0, 570, 500);

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

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fn.getText().isEmpty() || em.getText().isEmpty() || us.getText().isEmpty() || pss.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required");
} else if (pss.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
    pss.setText(""); // Clear the password field
} else {
    dbConnector dbc = new dbConnector();

    int insertResult = dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + us.getText() + "','" + pss.getText() + "','" + up.getSelectedItem() + "','Pending') ");

    if (insertResult == 1) {
        JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Insert Failed!");
    }
}
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pss;
    private javax.swing.JDesktopPane registerdesktop;
    private javax.swing.JPanel registerform;
    private javax.swing.JLabel type;
    public javax.swing.JComboBox<String> up;
    public javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
