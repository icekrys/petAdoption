
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
import user.userDashboard;

/**
 *
 * @author DERECHO
 */
public final class internalusers extends javax.swing.JInternalFrame {

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
        useraccount_name = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        useraccount_name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        useraccount_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        useraccount_name.setText("Add");
        useraccount_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        useraccount_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraccount_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                useraccount_nameMouseEntered(evt);
            }
        });
        jPanel2.add(useraccount_name);
        useraccount_name.setBounds(210, 0, 60, 30);

        update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Edit");
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(280, 0, 80, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(370, 0, 70, 30);

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

        sform.add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 30);

        usersTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        sform.add(jScrollPane1);
        jScrollPane1.setBounds(0, 30, 670, 390);

        jPanel1.add(sform);
        sform.setBounds(0, 0, 670, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
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

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseEntered

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
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int rowindex = usersTable.getSelectedRow();
        if (rowindex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an item.");
        } else {
    int id = (int) usersTable.getValueAt(rowindex, 0); // Assuming account ID is in the first column
    dbConnector connector = new dbConnector();
    boolean deleted = connector.deleteData("DELETE FROM tbl_user WHERE u_id = '" + id + "' ");
    if (deleted) {
        System.out.println("Admin clicked Delete Account!");
        JOptionPane.showMessageDialog(null, "Deleted Account Successfully!");
        internalusers up = new internalusers();
        sform.add(up).setVisible(true);
    } else {
        System.out.println("Information Rejected!");
        JOptionPane.showMessageDialog(null, "Failed Successfully!");
    }
}
    }//GEN-LAST:event_jLabel1MouseClicked

    private void useraccount_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccount_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_useraccount_nameMouseEntered

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        admindashboard up = new admindashboard();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane sform;
    public javax.swing.JLabel update;
    public javax.swing.JLabel useraccount_name;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
