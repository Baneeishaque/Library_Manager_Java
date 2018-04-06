/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_manager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class IssueRet extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public IssueRet() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        con = DbConnect.db();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        butret = new javax.swing.JButton();
        butis = new javax.swing.JButton();
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

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        id.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                idComponentRemoved(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Book ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("User ID");

        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        butret.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butret.setText("Return");
        butret.setPreferredSize(new java.awt.Dimension(80, 30));
        butret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butretActionPerformed(evt);
            }
        });

        butis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butis.setText("Issue");
        butis.setPreferredSize(new java.awt.Dimension(80, 30));
        butis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(390, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(butis, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(butret, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
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
        jTextField1.setBounds(0, 190, 810, 70);

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

        butisret.setBackground(new java.awt.Color(153, 153, 153));
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased

        try {
            String sql = "SELECT issuedto FROM book where Bkid=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String usr = rs.getString("issuedto");
                userid.setText(usr);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_idKeyReleased

    private void butretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butretActionPerformed

        try {
            String chk = "select Issuedate from bookreport where(Bkid='" + id.getText() + "' and Userid='" + userid.getText() + "' and (process='issue'or process='renew'))";
            pst = con.prepareStatement(chk);
            rs = pst.executeQuery();
            if (rs.last()) {
                java.sql.Date isdate = rs.getDate("issuedate");
                String sql = "insert into bookreport(Bkid,Userid,Issuedate,Returndate,Process)values(?,?,?,?,'Return')";
                pst = con.prepareStatement(sql);
                pst.setString(1, id.getText());
                pst.setString(2, userid.getText());
                pst.setDate(3, isdate);
                Date curDate = GregorianCalendar.getInstance().getTime();
                java.sql.Date retdate = new java.sql.Date(curDate.getTime());
                pst.setDate(4, retdate);
                pst.execute();
                
                String add = "update book set Status='Available',issuedto=''" + "where Bkid='" + id.getText() + "'";
                System.out.println(add);
                pst = con.prepareStatement(add);
                pst.executeUpdate();
                String bkh = "update user set bookinhand='0' where usrid='" + userid.getText() + "'";
                System.out.println(bkh);
                pst = con.prepareStatement(bkh);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Returned Successfully");
                
                id.setText(null);
                userid.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Book not issued");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_butretActionPerformed

    private void butisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butisActionPerformed

        try {
            String bk = "select * from book where Bkid=?";
            pst = con.prepareStatement(bk);
            pst.setString(1, id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                if (rs.getString("Status").equals("Available")) {
                    String usr = "select * from user where usrid=?";
                    pst = con.prepareStatement(usr);
                    pst.setString(1, userid.getText());
                    rs = pst.executeQuery();
                    if (rs.absolute(1)) {
                        String add = "update book set Status='Loaned',issuedto='" + userid.getText() + "'" + "where Bkid='" + id.getText() + "'";
                        pst = con.prepareStatement(add);
                        pst.executeUpdate();
                        String sql = "insert into bookreport(Bkid,Userid,Issuedate,Returndate,Process)values(?,?,?,?,'Issue')";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, id.getText());
                        pst.setString(2, userid.getText());
                        Date curDate = GregorianCalendar.getInstance().getTime();
                        java.sql.Date isdate = new java.sql.Date(curDate.getTime());
                        pst.setDate(3, isdate);
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.DATE, 14);
                        Date dt = cal.getTime();
                        java.sql.Date retdate = new java.sql.Date(dt.getTime());
                        pst.setDate(4, retdate);
                        pst.execute();
                        String bkh = "update user set bookinhand='1' where usrid='" + userid.getText() + "'";
                        pst = con.prepareStatement(bkh);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Issued Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect User ID");
                    }
                } else {
                    if (rs.getString("issuedto").equals(userid.getText())) {
                        String add = "update book set Status='Loaned',issuedto='" + userid.getText() + "'" + "where Bkid='" + id.getText() + "'";
                        pst = con.prepareStatement(add);
                        pst.executeUpdate();
                        String sql = "insert into bookreport(Bkid,Userid,Issuedate,Returndate,Process)values(?,?,?,?,'Renew')";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, id.getText());
                        pst.setString(2, userid.getText());
                        Date curDate = GregorianCalendar.getInstance().getTime();
                        java.sql.Date isdate = new java.sql.Date(curDate.getTime());
                        pst.setDate(3, isdate);
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.DATE, 14);
                        Date dt = cal.getTime();
                        java.sql.Date retdate = new java.sql.Date(dt.getTime());
                        pst.setDate(4, retdate);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Renewed Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not Available");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No Book Found");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_butisActionPerformed

    private void butadmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butadmnActionPerformed
        new Adminpanel().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butadmnActionPerformed

    private void butisretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butisretActionPerformed

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
        new ViewUsers().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_butviewuserActionPerformed

    private void butviewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butviewbookActionPerformed

        new ViewBook().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butviewbookActionPerformed

    private void butviewrqstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butviewrqstActionPerformed

        new Bookrqst().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butviewrqstActionPerformed

    private void idComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_idComponentRemoved

    }//GEN-LAST:event_idComponentRemoved

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you want to Logout", "Logout", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

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
            java.util.logging.Logger.getLogger(IssueRet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IssueRet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton butadmn;
    private javax.swing.JButton butbook;
    private javax.swing.JButton butis;
    private javax.swing.JButton butisret;
    private javax.swing.JButton butret;
    private javax.swing.JButton butrprt;
    private javax.swing.JButton butuser;
    private javax.swing.JButton butviewbook;
    private javax.swing.JButton butviewrqst;
    private javax.swing.JButton butviewuser;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imagetop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pic;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
