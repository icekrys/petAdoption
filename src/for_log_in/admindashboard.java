/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import internalpages.internalusers;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author DERECHO
 */
public class admindashboard extends javax.swing.JFrame {

    /**
     * Creates new form admindashboard
     */
    public admindashboard() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        account_fname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Back");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 0, 40, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 690, 30);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-team-94.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(400, 50, 90, 90);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(410, 130, 70, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-100.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 100, 100);

        account_fname.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        account_fname.setForeground(new java.awt.Color(255, 255, 255));
        account_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account_fname.setText("ADMIN");
        account_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account_fnameMouseClicked(evt);
            }
        });
        jPanel2.add(account_fname);
        account_fname.setBounds(-40, 130, 220, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(160, -50, 610, 500);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, -50, 610, 500);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, -50, 610, 500);

        maindesktop.add(jPanel2);
        jPanel2.setBounds(0, 0, 690, 400);

        jPanel1.add(maindesktop);
        maindesktop.setBounds(0, 30, 690, 400);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("LogOut");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 400, 50, 18);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("WELCOME BACK ADMIN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 40, 600, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, -20, 620, 490);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 440);

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

    private void account_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_fnameMouseClicked
       internalusers up = new internalusers();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_account_fnameMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        internalusers up = new  internalusers();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        
                
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       internalusers up = new internalusers();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel account_fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDesktopPane maindesktop;
    // End of variables declaration//GEN-END:variables
}
