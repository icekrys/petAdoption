/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_log_in;

import config.dbConnector;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class addpet extends javax.swing.JFrame {

    /**
     * Creates new form addpet
     */
    public addpet() {
        initComponents();
    }

     public String action;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        petnm = new javax.swing.JTextField();
        first_name1 = new javax.swing.JLabel();
        e_mail4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ownerem = new javax.swing.JTextField();
        first_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        s_petlabel = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        e_mail5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        petbd1 = new javax.swing.JTextField();
        first_name3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        petage = new javax.swing.JTextField();
        first_name2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petnmActionPerformed(evt);
            }
        });
        jPanel5.add(petnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

        first_name1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name1.setForeground(new java.awt.Color(153, 153, 153));
        first_name1.setText("Name:");
        jPanel5.add(first_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 70, 270, 70);

        e_mail4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail4.setForeground(new java.awt.Color(153, 153, 153));
        e_mail4.setText("Date of Birth:");
        jPanel1.add(e_mail4);
        e_mail4.setBounds(30, 340, 110, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(30, 370, 40, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(90, 370, 77, 20);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", " " }));
        jPanel1.add(jComboBox7);
        jComboBox7.setBounds(190, 370, 49, 20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ownerem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owneremActionPerformed(evt);
            }
        });
        jPanel4.add(ownerem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

        first_name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name.setForeground(new java.awt.Color(153, 153, 153));
        first_name.setText("Email:");
        jPanel4.add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(new java.awt.BorderLayout());

        s_petlabel.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        s_petlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s_petlabel.setText("Save Pet");
        s_petlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_petlabelMouseClicked(evt);
            }
        });
        jPanel2.add(s_petlabel, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, -1));

        e_mail5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        e_mail5.setForeground(new java.awt.Color(153, 153, 153));
        e_mail5.setText("Gender:");
        jPanel3.add(e_mail5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 20));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 30, 310, 400);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petbd1ActionPerformed(evt);
            }
        });
        jPanel7.add(petbd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

        first_name3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name3.setForeground(new java.awt.Color(153, 153, 153));
        first_name3.setText("Breed:");
        jPanel7.add(first_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel7);
        jPanel7.setBounds(30, 250, 270, 70);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petageActionPerformed(evt);
            }
        });
        jPanel6.add(petage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

        first_name2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        first_name2.setForeground(new java.awt.Color(153, 153, 153));
        first_name2.setText("Age:");
        jPanel6.add(first_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jPanel1.add(jPanel6);
        jPanel6.setBounds(30, 160, 270, 70);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel8.setLayout(null);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel8.add(Exit);
        Exit.setBounds(640, 0, 30, 20);

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-forward-button-20.png"))); // NOI18N
        jPanel8.add(jLabel18);
        jLabel18.setBounds(30, 0, 20, 20);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(-2, 0, 670, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void owneremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owneremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_owneremActionPerformed

    private void petnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petnmActionPerformed

    private void petageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petageActionPerformed

    private void s_petlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_petlabelMouseClicked
     dbConnector dbc = new dbConnector();
        if(action.equals("Add")){
            int result = dbc.insertData("INSERT INTO tbl_pet(p_name, p_age, p_breed, p_gender, c_email)VALUES('"+petnm.getText()+"','"+petage.getText()+"','"+petbd1.getText()+"','"+sex.getSelectedItem()+"','"+ownerem.getText()+"')");
            if(result==1){
                JOptionPane.showMessageDialog(null, "Successfully Save");
                adminpets ig = new adminpets();
                ig.setVisible(true);
                this.dispose();
            }else{
                System.out.println("Saving Data Failed");
            }
        }
           if(petnm.getText().isEmpty()||petage.getText().isEmpty()||petbd1.getText().isEmpty()||ownerem.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields are required");
        }else{
            JOptionPane.showMessageDialog(null,"Successfully Added");
        }
    }//GEN-LAST:event_s_petlabelMouseClicked

    private void petbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petbd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petbd1ActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       admindashboard up = new admindashboard();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

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
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel e_mail4;
    private javax.swing.JLabel e_mail5;
    private javax.swing.JLabel first_name;
    private javax.swing.JLabel first_name1;
    private javax.swing.JLabel first_name2;
    private javax.swing.JLabel first_name3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JTextField ownerem;
    public javax.swing.JTextField petage;
    public javax.swing.JTextField petbd1;
    public javax.swing.JTextField petnm;
    private javax.swing.JLabel s_petlabel;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
