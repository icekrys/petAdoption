
package internalpages;

import config.dbConnector;
import for_log_in.add_userform;
import for_log_in.adminarchive;
import for_log_in.admindashboard;
import for_log_in.individualPrinting;
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
        archive = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        useraccount_name.setBounds(130, 20, 50, 20);

        archive.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        archive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        archive.setText("Archive");
        archive.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archiveMouseEntered(evt);
            }
        });
        jPanel2.add(archive);
        archive.setBounds(360, 20, 70, 20);

        print.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("Print");
        print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jPanel2.add(print);
        print.setBounds(450, 20, 60, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delete");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 20, 60, 20);

        update1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        update1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update1.setText("Edit");
        update1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update1MouseEntered(evt);
            }
        });
        jPanel2.add(update1);
        update1.setBounds(200, 20, 60, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.setLayout(null);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel5.add(Exit);
        Exit.setBounds(620, 0, 24, 20);

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-forward-button-20.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(30, 0, 20, 20);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(-1, 0, 640, 20);

        sform.add(jPanel2);
        jPanel2.setBounds(0, 0, 640, 40);

        usersTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        sform.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 640, 490);

        jPanel1.add(sform);
        sform.setBounds(0, 0, 640, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
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

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_archiveMouseEntered

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        
  
    
    }//GEN-LAST:event_archiveMouseClicked
    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
                int rowindex = usersTable.getSelectedRow();
        if(rowindex < 0)
        {
            JOptionPane.showMessageDialog(null,"Please Select An Item");
        }else{
            try{
             dbConnector dbc = new dbConnector();
            TableModel model = usersTable.getModel();
            ResultSet rs = dbc.getData("Select * FROM tbl_user WHERE u_id = '"+model.getValueAt(rowindex, 0)+"'");
            if(rs.next()){
            individualPrinting pf = new individualPrinting();
            pf .id.setText(""+model.getValueAt(rowindex, 0));
            pf .fn.setText(""+model.getValueAt(rowindex, 1));
            pf .ln.setText(""+model.getValueAt(rowindex, 2));
            pf .em.setText(model.getValueAt(rowindex, 3).toString());
            pf .us.setText(""+model.getValueAt(rowindex, 4));
            pf .up.setText(""+model.getValueAt(rowindex, 5));
            pf .usta.setText(model.getValueAt(rowindex, 6).toString());
            pf.setVisible(true);
            this.dispose();
            }                      
        }catch(SQLException ex){
                    System.out.println(""+ex);
            }
        }        
    }//GEN-LAST:event_printMouseClicked

    private void useraccount_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccount_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_useraccount_nameMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int rowindex = usersTable.getSelectedRow();
        if (rowindex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an item.");
        } else {
    int id = (int) usersTable.getValueAt(rowindex, 0); 
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
    }//GEN-LAST:event_jLabel2MouseClicked

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
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
    }//GEN-LAST:event_update1MouseClicked

    private void update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update1MouseEntered

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        internalusers up = new internalusers();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    public javax.swing.JLabel archive;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel print;
    private javax.swing.JDesktopPane sform;
    public javax.swing.JLabel update1;
    public javax.swing.JLabel useraccount_name;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
