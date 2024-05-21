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
    Color clickColor = new Color(118,199,234);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        home1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        login1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        aboutus1 = new javax.swing.JLabel();
        service2 = new javax.swing.JPanel();
        service1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(118, 199, 234));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 80)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Friend");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Find ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("your ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/25-wall.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -20, 540, -1));

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 20, 660, 230);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.setLayout(null);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24 (2).png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(640, 0, 20, 20);

        jLabel18.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-forward-button-20.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 0, 20, 20);

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-20.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 0, 20, 20);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel23.setText("Feedback");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(null);

        jLabel26.setText("write a feedback");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(20, 10, 90, 14);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 450, 120));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-forward-24 (1).png"))); // NOI18N
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-24 (3).png"))); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel28.setText("jLabel5");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 110, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel29.setText("jLabel5");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eedcf4ff189d37226b0dae8353a1357e_1.jpg"))); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 90));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face6.jpg"))); // NOI18N
        jLabel27.setText(" ");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 170, 200));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 110, 90));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/face8.jpg"))); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 90));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3c12985fa7345871ea3e7d44bdad069f.jpg"))); // NOI18N
        jLabel33.setText("jLabel5");
        jLabel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 90));

        jLabel14.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel14.setText(" See More");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel30.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel30.setText(" See More");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel31.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel31.setText(" See More");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel35.setText(" See More");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        jLabel36.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel36.setText(" See More");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel37.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel37.setText(" See More");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 208, 144));
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Know our Numbers");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(170, 0, 130, 18);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("14");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(350, 40, 100, 60);

        jLabel17.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("years of service");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(350, 100, 100, 20);

        jLabel20.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("|");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(300, 30, 30, 100);

        jLabel21.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("50+");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(30, 40, 100, 50);

        jLabel48.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("serving");
        jPanel6.add(jLabel48);
        jLabel48.setBounds(190, 100, 100, 20);

        jLabel49.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("100+");
        jPanel6.add(jLabel49);
        jLabel49.setBounds(180, 40, 120, 50);

        jLabel50.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("staff");
        jPanel6.add(jLabel50);
        jLabel50.setBounds(30, 100, 100, 20);

        jLabel51.setFont(new java.awt.Font("Candara", 0, 100)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("|");
        jPanel6.add(jLabel51);
        jLabel51.setBounds(140, 30, 30, 100);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 480, 140));

        jLabel57.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Lost and Found");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -140, -1, -1));

        jScrollPane5.setViewportView(jPanel5);

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(0, 330, 660, 240);

        jPanel8.setBackground(new java.awt.Color(118, 199, 234));
        jPanel8.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Find Here");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(10, 0, 80, 20);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(20, 300, 100, 20);

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home1MouseExited(evt);
            }
        });
        home1.setLayout(null);

        home.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
        });
        home1.add(home);
        home.setBounds(10, 0, 40, 20);

        jPanel3.add(home1);
        home1.setBounds(140, 270, 60, 20);

        login.setBackground(new java.awt.Color(255, 255, 255));
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
        login.setLayout(null);

        login1.setBackground(new java.awt.Color(255, 255, 255));
        login1.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login1.setText("Log In");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        login.add(login1);
        login1.setBounds(20, 0, 33, 20);

        jPanel3.add(login);
        login.setBounds(440, 270, 70, 20);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        aboutus1.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        aboutus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutus1.setText("About Us");
        aboutus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutus1MouseExited(evt);
            }
        });
        jPanel11.add(aboutus1);
        aboutus1.setBounds(10, 0, 50, 20);

        jPanel3.add(jPanel11);
        jPanel11.setBounds(340, 270, 70, 20);

        service2.setBackground(new java.awt.Color(255, 255, 255));
        service2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                service2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                service2MouseExited(evt);
            }
        });
        service2.setLayout(null);

        service1.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        service1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        service1.setText("Services");
        service1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                service1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                service1MouseExited(evt);
            }
        });
        service2.add(service1);
        service1.setBounds(10, 0, 42, 20);

        jPanel3.add(service2);
        service2.setBounds(240, 270, 60, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(10, 260, 640, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login1MouseClicked

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
       login1.setBackground(clickColor);
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        login1.setBackground(navColor);
    }//GEN-LAST:event_login1MouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
         home.setBackground(clickColor);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBackground(navColor);
    }//GEN-LAST:event_homeMouseEntered

    private void aboutus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutus1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutus1MouseEntered

    private void aboutus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutus1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutus1MouseExited

    private void service1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service1MouseEntered
        service1.setBackground(clickColor);
    }//GEN-LAST:event_service1MouseEntered

    private void service1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service1MouseExited
        service1.setBackground(navColor);
    }//GEN-LAST:event_service1MouseExited

    private void home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseEntered
        home1.setBackground(clickColor);
    }//GEN-LAST:event_home1MouseEntered

    private void home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseExited
        home1.setBackground(navColor);
    }//GEN-LAST:event_home1MouseExited

    private void service2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service2MouseEntered
       service2.setBackground(clickColor);
    }//GEN-LAST:event_service2MouseEntered

    private void service2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service2MouseExited
       service2.setBackground(navColor);
    }//GEN-LAST:event_service2MouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
       login.setBackground(clickColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       login.setBackground(navColor);
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        logIn up = new logIn();
        up.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loginMouseClicked

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
    private javax.swing.JLabel aboutus1;
    private javax.swing.JLabel home;
    private javax.swing.JPanel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel login1;
    private javax.swing.JLabel service1;
    private javax.swing.JPanel service2;
    // End of variables declaration//GEN-END:variables
}
