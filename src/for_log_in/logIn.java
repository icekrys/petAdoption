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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
        
    }
    
    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(164,87,14);
    static String status;
    static String type;
    
     
    public static boolean loginAcc(String username, String password){
    dbConnector connector = new dbConnector();
    
    try{
   
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

        jPanel2 = new javax.swing.JPanel();
        FurHome = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        FurHome1 = new javax.swing.JLabel();
        SecondPanel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        LoginButton = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        Dont_have_an_account = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        FurHome.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        FurHome.setText("Home");
        jPanel2.add(FurHome);
        FurHome.setBounds(200, 50, 200, 90);

        Account.setFont(new java.awt.Font("Pristina", 1, 60)); // NOI18N
        Account.setForeground(new java.awt.Color(255, 255, 255));
        Account.setText("Account");
        jPanel2.add(Account);
        Account.setBounds(370, 50, 200, 90);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(640, -4, 30, 24);

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back);
        Back.setBounds(0, 0, 40, 20);

        FurHome1.setBackground(new java.awt.Color(255, 255, 255));
        FurHome1.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        FurHome1.setText("Fur  ");
        jPanel2.add(FurHome1);
        FurHome1.setBounds(90, 50, 160, 90);

        SecondPanel.setBackground(new java.awt.Color(255, 255, 255));
        SecondPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SecondPanel.setForeground(new java.awt.Color(164, 87, 14));
        SecondPanel.setLayout(null);

        user.setDragEnabled(true);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        SecondPanel.add(user);
        user.setBounds(20, 40, 330, 30);
        user.getAccessibleContext().setAccessibleName("");

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.setLayout(null);

        login.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log In");
        LoginButton.add(login);
        login.setBounds(20, 0, 130, 30);

        SecondPanel.add(LoginButton);
        LoginButton.setBounds(100, 140, 170, 30);

        forgotPassword.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(164, 87, 14));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassword.setText("Forgot Password");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        SecondPanel.add(forgotPassword);
        forgotPassword.setBounds(10, 200, 120, 20);

        Register.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(164, 87, 14));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Register");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        SecondPanel.add(Register);
        Register.setBounds(290, 200, 70, 18);

        Dont_have_an_account.setFont(new java.awt.Font("Candara", 2, 12)); // NOI18N
        Dont_have_an_account.setText("Don't have an account?");
        SecondPanel.add(Dont_have_an_account);
        Dont_have_an_account.setBounds(180, 200, 120, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("username");
        SecondPanel.add(jLabel1);
        jLabel1.setBounds(20, 20, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("password");
        SecondPanel.add(jLabel2);
        jLabel2.setBounds(20, 70, 70, 20);
        SecondPanel.add(pass);
        pass.setBounds(20, 90, 330, 30);

        jPanel2.add(SecondPanel);
        SecondPanel.setBounds(280, 140, 370, 230);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dog_background1_1.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(background);
        background.setBounds(-60, -10, 770, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
       
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
          if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "Not Active! Contact the Admin!");
            }else{
                if(type.equals("Admin"))
                {
                JOptionPane.showMessageDialog(null, "Login Success!");
                JOptionPane.showMessageDialog(null, "Welcome Back Admin!!!");
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
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        re_gister up = new re_gister();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userMouseClicked

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
      
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
      
    }//GEN-LAST:event_userFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       homedashboard up = new homedashboard();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setBackground(clickColor);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setBackground(navColor);
    }//GEN-LAST:event_LoginButtonMouseExited

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
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Dont_have_an_account;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel FurHome;
    private javax.swing.JLabel FurHome1;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JLabel Register;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    public javax.swing.JPasswordField pass;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private void addplaceholderStyle(JPasswordField pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
