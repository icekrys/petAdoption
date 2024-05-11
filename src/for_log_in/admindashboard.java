/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.Session;
import internalpages.internalusers;
import java.awt.Color;
import javax.swing.JOptionPane;
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
    Color navColor = new Color(255,255,255);
    Color clickColor = new Color(164,87,14);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        account_fname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        report = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        petbutton = new javax.swing.JLabel();
        dogicon = new javax.swing.JLabel();
        caticon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel11.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-32.png"))); // NOI18N
        jPanel11.add(jLabel4);
        jLabel4.setBounds(10, 20, 30, 32);

        jLabel9.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Home ");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel9);
        jLabel9.setBounds(50, 20, 40, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cashbook-32.png"))); // NOI18N
        jPanel11.add(jLabel11);
        jLabel11.setBounds(10, 130, 30, 30);

        jLabel12.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Manage Account");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel12);
        jLabel12.setBounds(50, 130, 80, 30);

        jLabel10.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Log Out");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel10);
        jLabel10.setBounds(60, 370, 50, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-log-out-24.png"))); // NOI18N
        jPanel11.add(jLabel13);
        jLabel13.setBounds(30, 370, 30, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Archive");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel8);
        jLabel8.setBounds(50, 90, 40, 40);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-trash-24.png"))); // NOI18N
        jPanel11.add(jLabel16);
        jLabel16.setBounds(10, 100, 30, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        jPanel11.add(jLabel19);
        jLabel19.setBounds(10, 60, 30, 30);

        jLabel20.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Add Pet");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel20);
        jLabel20.setBounds(50, 60, 40, 30);

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 410));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 10));

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Back");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customers");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 10, 70, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 230, 200);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 250, 240));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Back ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(50, 10, 110, 16);

        account_fname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        account_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account_fname.setText("ADMIN!");
        account_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account_fnameMouseClicked(evt);
            }
        });
        jPanel3.add(account_fname);
        account_fname.setBounds(150, 10, 50, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-32.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(110, 30, 32, 40);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel3.setText("Your work today: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 70, 110, 20);

        jRadioButton1.setText("Customers");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(10, 90, 77, 23);

        jRadioButton2.setText("Reports ");
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(10, 120, 67, 23);

        jRadioButton3.setText("Pets");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(130, 90, 47, 23);

        jRadioButton4.setText("Archieve");
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(130, 120, 67, 23);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, 160));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel14.setText("Record Of Adopted Pets");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(10, 10, 150, 18);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 30, 200, 20);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 220, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(null);

        report.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        report.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        report.setText("Report");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        jPanel7.add(report);
        report.setBounds(10, 10, 50, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 200, 150);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 220, 190));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        petbutton.setBackground(new java.awt.Color(255, 255, 255));
        petbutton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        petbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petbutton.setText("Pets");
        petbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                petbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                petbuttonMouseExited(evt);
            }
        });
        jPanel4.add(petbutton);
        petbutton.setBounds(10, 10, 30, 20);

        dogicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-dog-100 (1).png"))); // NOI18N
        jPanel4.add(dogicon);
        dogicon.setBounds(110, 30, 100, 120);

        caticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cat-100.png"))); // NOI18N
        jPanel4.add(caticon);
        caticon.setBounds(10, 40, 100, 120);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 220, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getinstance();
        
        if(sess.getUid() == 0)
        {
            JOptionPane.showMessageDialog(null, "No account, Please Login!");
            logIn up = new logIn();
            up.setVisible(true);
            this.dispose();
        }else{
            account_fname.setText(""+sess.getFname());
        }
    }//GEN-LAST:event_formWindowActivated

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
       
    }//GEN-LAST:event_reportMouseClicked

    private void account_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_fnameMouseClicked
        internalusers up = new internalusers();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_account_fnameMouseClicked

    private void petbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petbuttonMouseEntered
       
    }//GEN-LAST:event_petbuttonMouseEntered

    private void petbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petbuttonMouseExited
   
    }//GEN-LAST:event_petbuttonMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       internalusers up = new internalusers();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
       adminpets up = new adminpets();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        roa up = new roa();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        adminreport up = new adminreport();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        admincustomers up = new admincustomers();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        admindashboard up = new admindashboard();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       adminarchieve up = new adminarchieve();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
       addpet up = new addpet();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

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
    private javax.swing.JLabel Exit;
    public javax.swing.JLabel account_fname;
    private javax.swing.JLabel caticon;
    private javax.swing.JLabel dogicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel petbutton;
    private javax.swing.JLabel report;
    // End of variables declaration//GEN-END:variables
}
