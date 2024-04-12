/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Home_pages2.*;
import To_register.*;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author DERECHO
 */
public class Log_in extends javax.swing.JInternalFrame {

    /**
     * Creates new form Log_in
     */
    public Log_in() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username + "' AND u_password = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logindesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 50)); // NOI18N
        jLabel3.setText("Welcome ");
        jLabel3.setAlignmentY(0.7F);
        jLabel3.setIconTextGap(10);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 40, 320, 70);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 90)); // NOI18N
        jLabel4.setText("Back");
        jLabel4.setAlignmentY(0.7F);
        jLabel4.setIconTextGap(10);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 110, 320, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dogsandcats.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 40, 410, 200);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-x-32.png"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(650, 0, 32, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-arrow-24.png"))); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 0, 24, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 690, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        jButton2.setText("Log in");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(490, 160, 70, 30);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user);
        user.setBounds(180, 60, 320, 36);
        jPanel2.add(pass);
        pass.setBounds(180, 110, 320, 36);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 110, 76, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Username:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(95, 70, 80, 18);

        jLabel6.setText("No Account!");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(180, 160, 80, 20);

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
        jPanel2.add(jButton1);
        jButton1.setBounds(250, 160, 80, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 190, 600, 230);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/77281cb6d94e94c2d71bacdba9d74d7f.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-90, -40, 550, 530);

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 360, 34, 14);

        logindesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout logindesktopLayout = new javax.swing.GroupLayout(logindesktop);
        logindesktop.setLayout(logindesktopLayout);
        logindesktopLayout.setHorizontalGroup(
            logindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        logindesktopLayout.setVerticalGroup(
            logindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logindesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logindesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             if(loginAcc(user.getText(),pass.getText())){
            JOptionPane.showMessageDialog(null, "Login Success!");
            admindashboard up = new admindashboard();
            up.setVisible(true);
            this.dispose();
            }else{
            JOptionPane.showMessageDialog(null, "Login Failed!");
       }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        register up = new register();
        logindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDesktopPane logindesktop;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
