/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import config.dbConnector;
import for_log_in.add_userform;
import for_log_in.admindashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DERECHO
 */
public class internalusers extends javax.swing.JInternalFrame {

    /**
     * Creates new form internalusers
     */
    public internalusers() {
        initComponents();
            displayUser();
            
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
      public void displayUser(){
        dbConnector connector = new dbConnector();
        try{            
            try (ResultSet resultSet = connector.getData("SELECT u_id, u_fname, u_lname, u_email,u_username, u_type, u_status, u_password FROM tbl_user")) {
                usersTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sform = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        iconuser = new javax.swing.JLabel();
        useraccount_name = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(120, 0, 570, 20);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 20, 570, 420);

        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-94.png"))); // NOI18N
        jPanel2.add(iconuser);
        iconuser.setBounds(20, 10, 110, 100);

        useraccount_name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        useraccount_name.setForeground(new java.awt.Color(255, 255, 255));
        useraccount_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        useraccount_name.setText("Add");
        useraccount_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraccount_nameMouseClicked(evt);
            }
        });
        jPanel2.add(useraccount_name);
        useraccount_name.setBounds(0, 120, 120, 18);

        update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Edit");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(30, 160, 60, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, -50, 610, 500);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 400);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 130, 620, 480);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paw-3d-symbol-pet-paw-3d-rendering-illustration-pink-paw-print-icon-isolated-on-blue-background-dog-or-cat-paw-print-animal-track-minimalism-concept-3d-illustration-3d-render-photo.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 10, 610, 490);

        sform.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sformLayout = new javax.swing.GroupLayout(sform);
        sform.setLayout(sformLayout);
        sformLayout.setHorizontalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        sformLayout.setVerticalGroup(
            sformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(sform);
        sform.setBounds(0, 0, 689, 427);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useraccount_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccount_nameMouseClicked
       
        add_userform up = new add_userform();
        up.setVisible(true);
        up.action = "Add";
        up.st_label.setText("SAVE");
        this.dispose();
    }//GEN-LAST:event_useraccount_nameMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        int rowindex = usersTable.getSelectedRow();
        if(rowindex < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select An Item");
        }else{
            TableModel model = usersTable.getModel();
            add_userform kr = new add_userform();
            kr .id.setText(""+model.getValueAt(rowindex, 0));
            kr .fn.setText(""+model.getValueAt(rowindex, 1));
            kr .ln.setText(""+model.getValueAt(rowindex, 2));
            kr .em.setText(model.getValueAt(rowindex, 3).toString());
            kr .us.setText(""+model.getValueAt(rowindex, 4));
            kr .up.setSelectedItem(""+model.getValueAt(rowindex, 5));
            kr .usta.setSelectedItem(model.getValueAt(rowindex, 6).toString());
            kr .pss.setText(""+model.getValueAt(rowindex, 7));
            kr .setVisible(true);
            kr .action = "Update";
            kr .st_label.setText("UPDATE");
            this.dispose();
        }
       
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconuser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane sform;
    public javax.swing.JLabel update;
    public javax.swing.JLabel useraccount_name;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
