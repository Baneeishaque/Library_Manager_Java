package library_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ViewUsers extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private int insertion_flag = 0;

    public ViewUsers() {
        initComponents();
        con = DbConnect.db();
        setExtendedState(MAXIMIZED_BOTH);
        updatetable();
        insertcombov();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        coview = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        pic = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        imagetop = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        butadmn = new javax.swing.JButton();
        butisret = new javax.swing.JButton();
        butbook = new javax.swing.JButton();
        butuser = new javax.swing.JButton();
        butrprt = new javax.swing.JButton();
        butviewuser = new javax.swing.JButton();
        butviewbook = new javax.swing.JButton();
        butviewrqst = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 330));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 302));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usertable.setRowHeight(23);
        jScrollPane1.setViewportView(usertable);

        coview.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        coview.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coviewItemStateChanged(evt);
            }
        });
        coview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coviewActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(coview, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coview, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pic.setPreferredSize(new java.awt.Dimension(1100, 250));
        pic.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 0, 153));
        jTextField1.setFont(new java.awt.Font("Algerian", 2, 42)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 102, 51));
        jTextField1.setText("LIBRARY MANAGER AND BOOK FINDER");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        pic.add(jTextField1);
        jTextField1.setBounds(0, 190, 920, 70);

        imagetop.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        imagetop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/bktab.jpg"))); // NOI18N
        imagetop.setMaximumSize(new java.awt.Dimension(1100, 530));
        imagetop.setMinimumSize(new java.awt.Dimension(1100, 400));
        imagetop.setPreferredSize(new java.awt.Dimension(1100, 250));
        pic.add(imagetop);
        imagetop.setBounds(-100, -210, 1200, 600);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("LIBRARY MANAGER AND BOOK FINDER");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.setPreferredSize(new java.awt.Dimension(1100, 30));

        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 40));

        butadmn.setText("Admin Panel");
        butadmn.setPreferredSize(new java.awt.Dimension(90, 40));
        butadmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butadmnActionPerformed(evt);
            }
        });

        butisret.setText("Issue/Return Book");
        butisret.setPreferredSize(new java.awt.Dimension(90, 40));
        butisret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butisretActionPerformed(evt);
            }
        });

        butbook.setText("Book");
        butbook.setPreferredSize(new java.awt.Dimension(90, 40));
        butbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbookActionPerformed(evt);
            }
        });

        butuser.setText("User");
        butuser.setPreferredSize(new java.awt.Dimension(90, 40));
        butuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butuserActionPerformed(evt);
            }
        });

        butrprt.setText("Reports");
        butrprt.setPreferredSize(new java.awt.Dimension(90, 40));
        butrprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butrprtActionPerformed(evt);
            }
        });

        butviewuser.setBackground(new java.awt.Color(153, 153, 153));
        butviewuser.setText("View Users");
        butviewuser.setPreferredSize(new java.awt.Dimension(90, 40));
        butviewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butviewuserActionPerformed(evt);
            }
        });

        butviewbook.setText("View Books");
        butviewbook.setPreferredSize(new java.awt.Dimension(90, 40));
        butviewbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butviewbookActionPerformed(evt);
            }
        });

        butviewrqst.setText("Book Requests");
        butviewrqst.setPreferredSize(new java.awt.Dimension(120, 40));
        butviewrqst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butviewrqstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(butbook, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(butuser, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(butviewbook, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butviewuser, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butviewrqst, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(butisret, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(butrprt, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(butadmn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butbook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butviewrqst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butisret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butviewbook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butadmn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butrprt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butviewuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 102, 204));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/logout.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnlogout.setMaximumSize(new java.awt.Dimension(53, 50));
        btnlogout.setMinimumSize(new java.awt.Dimension(53, 50));
        btnlogout.setPreferredSize(new java.awt.Dimension(35, 30));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void insertcombov() {
        insertion_flag = 1;
        try {
            String st = "select usrdep from usrdepart ";
            pst = con.prepareStatement(st);
            rs = pst.executeQuery();
            while (rs.next()) {
                String s = rs.getString("usrdep");
                coview.addItem(s);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        insertion_flag = 0;
    }

    private void updatetable() {
        try {
            String sql = "select * from user";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            usertable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void butadmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butadmnActionPerformed
        new Adminpanel().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butadmnActionPerformed

    private void butisretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butisretActionPerformed
        new IssueRet().setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_butisretActionPerformed

    private void butbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbookActionPerformed
        new Book().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butbookActionPerformed

    private void butuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butuserActionPerformed
        new User().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_butuserActionPerformed

    private void butrprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butrprtActionPerformed
        new Reports().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butrprtActionPerformed

    private void butviewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butviewuserActionPerformed

    }//GEN-LAST:event_butviewuserActionPerformed

    private void butviewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butviewbookActionPerformed

        new ViewBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_butviewbookActionPerformed

    private void butviewrqstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butviewrqstActionPerformed

        new Bookrqst().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_butviewrqstActionPerformed

    private void coviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coviewActionPerformed
    }//GEN-LAST:event_coviewActionPerformed

    private void coviewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coviewItemStateChanged
        if (insertion_flag == 0) {
            if (coview.getSelectedItem().equals("All")) {
                try {
                    String sql = "select * from user";
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    usertable.setModel(DbUtils.resultSetToTableModel(rs));

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                try {
                    String sql = "select * from user where department= '" + coview.getSelectedItem() + "'  ";
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    usertable.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException e) {
                }
            }
        }
    }//GEN-LAST:event_coviewItemStateChanged

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you want to Logout", "Logout", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            if (coview.getSelectedItem() == "All") {
                String sql = "select * from user where usrid like '%" + search.getText() + "%'";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                usertable.setModel(DbUtils.resultSetToTableModel(rs));
            } else {

                String sql = "select * from user where department='" + coview.getSelectedItem() + "' AND usrid like '%" + search.getText() + "%'";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                usertable.setModel(DbUtils.resultSetToTableModel(rs));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton butadmn;
    private javax.swing.JButton butbook;
    private javax.swing.JButton butisret;
    private javax.swing.JButton butrprt;
    private javax.swing.JButton butuser;
    private javax.swing.JButton butviewbook;
    private javax.swing.JButton butviewrqst;
    private javax.swing.JButton butviewuser;
    private javax.swing.JComboBox<String> coview;
    private javax.swing.JLabel imagetop;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pic;
    private javax.swing.JTextField search;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
