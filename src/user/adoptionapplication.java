/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import config.dbConnector;
import for_log_in.admincustomers;
import for_log_in.admindashboard;
import internalpages.internalusers;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class adoptionapplication extends javax.swing.JFrame {

    /**
     * Creates new form tofillout
     */
    public adoptionapplication() {
        initComponents();
    }
    
     public String action;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ema = new javax.swing.JTextField();
        c_slabel = new javax.swing.JPanel();
        c_label = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        customerpanel.setBackground(new java.awt.Color(255, 255, 255));
        customerpanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 50, 20);
        jPanel1.add(nm);
        nm.setBounds(30, 40, 150, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 50, 20);
        jPanel1.add(age);
        age.setBounds(30, 110, 150, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 160, 50, 20);
        jPanel1.add(contact);
        contact.setBounds(30, 180, 150, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 230, 50, 20);
        jPanel1.add(add);
        add.setBounds(30, 250, 150, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 300, 50, 20);
        jPanel1.add(ema);
        ema.setBounds(30, 320, 150, 30);

        c_slabel.setBackground(new java.awt.Color(239, 186, 114));
        c_slabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_slabelMouseClicked(evt);
            }
        });
        c_slabel.setLayout(new java.awt.BorderLayout());

        c_label.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        c_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_label.setText("Save");
        c_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_labelMouseClicked(evt);
            }
        });
        c_slabel.add(c_label, java.awt.BorderLayout.CENTER);

        jPanel1.add(c_slabel);
        c_slabel.setBounds(250, 110, 80, 20);

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jPanel1.add(gen);
        gen.setBounds(250, 40, 80, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 20, 50, 20);

        customerpanel.add(jPanel1);
        jPanel1.setBounds(20, 20, 370, 370);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25-wall.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        customerpanel.add(jLabel8);
        jLabel8.setBounds(170, 30, 550, 340);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(null);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(650, 0, 24, 20);

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-forward-button-20.png"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 0, 20, 20);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        customerpanel.add(jPanel2);
        jPanel2.setBounds(-1, -1, 680, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_labelMouseClicked
       
    }//GEN-LAST:event_c_labelMouseClicked

    private void c_slabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_slabelMouseClicked
         dbConnector dbc = new dbConnector();
        if(action.equals("Add")){
            int result = dbc.insertData("INSERT INTO tbl_customers(c_name, c_age, c_gender, c_contact, c_address, c_email)VALUES('"+nm.getText()+"','"+age.getText()+"','"+gen.getSelectedItem()+"','"+contact.getText()+"','"+add.getText()+"','"+ema.getText()+"')");
            if(result==1){
                JOptionPane.showMessageDialog(null, "Successfully Save");
                admincustomers up = new admincustomers();
                up.setVisible(true);
                this.dispose();
            }else{
                System.out.println("Saving Data Failed");
            }
        }
           if(nm.getText().isEmpty()||age.getText().isEmpty()||contact.getText().isEmpty()||add.getText().isEmpty()||ema.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields are required");
        }else{
            JOptionPane.showMessageDialog(null,"Successfully Added");
            admincustomers up = new admincustomers();
            up.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_c_slabelMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       adoptinfo up = new adoptinfo();
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
            java.util.logging.Logger.getLogger(adoptionapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adoptionapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adoptionapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adoptionapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adoptionapplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField add;
    private javax.swing.JTextField age;
    public javax.swing.JLabel c_label;
    private javax.swing.JPanel c_slabel;
    private javax.swing.JTextField contact;
    private javax.swing.JPanel customerpanel;
    private javax.swing.JTextField ema;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nm;
    // End of variables declaration//GEN-END:variables
}
