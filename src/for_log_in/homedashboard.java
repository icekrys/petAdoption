/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import To_register.re_gister;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DERECHO
 */
public class homedashboard extends javax.swing.JFrame {

    /**
     * Creates new form homedashboard
     */
    public homedashboard() {
        initComponents();
        
        }

    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(164,87,14);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        furhomme = new javax.swing.JLabel();
        fur = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        contact_us = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        home1 = new javax.swing.JLabel();
        home2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        furhomme.setBackground(new java.awt.Color(164, 87, 14));
        furhomme.setFont(new java.awt.Font("Pristina", 1, 80)); // NOI18N
        furhomme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        furhomme.setText("Home");
        jPanel1.add(furhomme);
        furhomme.setBounds(20, 100, 190, 100);

        fur.setFont(new java.awt.Font("Pristina", 1, 90)); // NOI18N
        fur.setForeground(new java.awt.Color(255, 255, 255));
        fur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fur.setText("Fur");
        fur.setToolTipText("");
        jPanel1.add(fur);
        fur.setBounds(80, 60, 150, 90);

        home.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("View Pets");
        jPanel1.add(home);
        home.setBounds(420, 0, 60, 20);

        contact_us.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        contact_us.setForeground(new java.awt.Color(255, 255, 255));
        contact_us.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact_us.setText("Contact us");
        jPanel1.add(contact_us);
        contact_us.setBounds(10, 400, 80, 20);

        contact.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact.setText("(63)9917002148");
        jPanel1.add(contact);
        contact.setBounds(0, 410, 100, 20);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(640, 0, 20, 20);

        home1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home1.setText("Home");
        jPanel1.add(home1);
        home1.setBounds(350, 0, 60, 20);

        home2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        home2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home2.setText("About us");
        jPanel1.add(home2);
        home2.setBounds(500, 0, 60, 20);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\"Until one has loved an animal,");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 176, 210, 40);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("- Anatole France");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 216, 210, 40);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("a part of one's soul remains unawakened.\" ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(330, 196, 276, 40);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log In");
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(580, 10, 50, 20);

        background.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dog_background1_1.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(background);
        background.setBounds(0, -20, 670, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
     
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
         
    }//GEN-LAST:event_loginMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homedashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homedashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel background;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel contact_us;
    private javax.swing.JLabel fur;
    private javax.swing.JLabel furhomme;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    // End of variables declaration//GEN-END:variables
}
