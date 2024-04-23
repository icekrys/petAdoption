/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;
import To_register.*;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.userDashboard;





public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
      
    }
    static String status;
    static String type;
    
     
    public static boolean loginAcc(String username, String password){
    dbConnector connector = new dbConnector();
    
    try{
         // Remove the password from the SQL query
         String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "'";
         ResultSet resultSet = connector.getData(query);
        
        if(resultSet.next()){
            
             String hashedPass = resultSet.getString("u_password");
             String rehashedPass = passwordHasher.hashPassword(password); 
             
    
        if(hashedPass.equals(rehashedPass)){
        status = resultSet.getString("u_status");
        type = resultSet.getString("u_type");
        Session sess = Session.getinstance();
        sess.setUid(resultSet.getInt("u_id"));
         sess.setFname(resultSet.getString("u_fname"));
          sess.setLname(resultSet.getString("u_lname"));
           sess.setEmail(resultSet.getString("u_email"));
            sess.setUsername(resultSet.getString("u_username"));
             sess.setType(resultSet.getString("u_type"));
             sess.setStatus(resultSet.getString("u_status"));
            
         return true;
        }else{
         return false;
        }
             }else{
            return false;
        }
    }catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println(""+ex);
        return false;
    }

}


     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logindesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Login_button = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Register");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 70, 20));

        Login_button.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Login_button.setText("Login");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 70, 20));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 170, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 20));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dog_background1_1.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 650, 430));

        logindesktop.add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logindesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logindesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                JOptionPane.showMessageDialog(null, "Login Success!");
                admindashboard up = new admindashboard();
                up.setVisible(true);
                this.dispose();
                }else if(type.equals("User")){
                JOptionPane.showMessageDialog(null, "Login Success!");
                userDashboard up = new userDashboard();
                up.setVisible(true);
                this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No Account Type Found!");
                }
            }
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed. Invalid Account!");
                }
    }//GEN-LAST:event_Login_buttonActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
         re_gister up = new re_gister();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JButton Login_button;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane logindesktop;
    public javax.swing.JTextField pass;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
