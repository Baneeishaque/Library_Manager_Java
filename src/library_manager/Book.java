package library_manager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Book extends javax.swing.JFrame {

    int flag = 0;
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Book() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        con = DbConnect.db();
        addshelf();
        slfno.setSelectedItem(null);
        addrow();
        rowno.setSelectedItem(null);
        addcolumn();
        posno.setSelectedItem(null);
        adddep();
        comdep.setSelectedItem(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butbook = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        butsub = new javax.swing.JButton();
        butrst = new javax.swing.JButton();
        butdel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        vol = new javax.swing.JTextField();
        posno = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        rowno = new javax.swing.JComboBox<>();
        slfno = new javax.swing.JComboBox<>();
        num = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        togstat = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comdep = new javax.swing.JComboBox();
        pic = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        imagetop = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        butadmn2 = new javax.swing.JButton();
        butisret = new javax.swing.JButton();
        butbook1 = new javax.swing.JButton();
        butuser = new javax.swing.JButton();
        butrprt = new javax.swing.JButton();
        butviewuser = new javax.swing.JButton();
        butviewbook = new javax.swing.JButton();
        butviewrqst = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        butbook.setText("Book");
        butbook.setPreferredSize(new java.awt.Dimension(90, 40));
        butbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbookActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 330));

        btnupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/update icon.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));
        btnupdate.setPreferredSize(new java.awt.Dimension(80, 30));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        butsub.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/Save-icon.png"))); // NOI18N
        butsub.setText("Add Book");
        butsub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));
        butsub.setPreferredSize(new java.awt.Dimension(80, 30));
        butsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsubActionPerformed(evt);
            }
        });

        butrst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butrst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/erase-128.png"))); // NOI18N
        butrst.setText("Clear");
        butrst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));
        butrst.setPreferredSize(new java.awt.Dimension(80, 30));
        butrst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butrstActionPerformed(evt);
            }
        });

        butdel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butdel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_manager/images/delete_16x16.gif"))); // NOI18N
        butdel.setText("Delete");
        butdel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));
        butdel.setPreferredSize(new java.awt.Dimension(80, 30));
        butdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdelActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("TITLE");

        des.setColumns(20);
        des.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        des.setRows(5);
        des.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        des.setPreferredSize(new java.awt.Dimension(343, 87));
        jScrollPane1.setViewportView(des);

        vol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });

        posno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posnoActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        num.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("NUMBER");

        aut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("AUTHOR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("DESCRIPTION");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("STATUS");

        togstat.setText("Loaned");
        togstat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        togstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togstatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Book ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("POSITION");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("VOLUME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(slfno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(rowno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(posno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(togstat, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vol, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(slfno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(togstat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setText("DEPARTMENT");

        comdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comdepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butsub, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butdel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butrst, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(comdep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butsub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butrst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butdel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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
        jTextField1.setBounds(0, 190, 860, 70);

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

        butadmn2.setText("Admin Panel");
        butadmn2.setPreferredSize(new java.awt.Dimension(90, 40));
        butadmn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butadmn2ActionPerformed(evt);
            }
        });

        butisret.setText("Issue/Return Book");
        butisret.setPreferredSize(new java.awt.Dimension(90, 40));
        butisret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butisretActionPerformed(evt);
            }
        });

        butbook1.setBackground(new java.awt.Color(153, 153, 153));
        butbook1.setText("Book");
        butbook1.setPreferredSize(new java.awt.Dimension(90, 40));
        butbook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbook1ActionPerformed(evt);
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
                .addComponent(butbook1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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
                .addComponent(butadmn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butbook1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butviewrqst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butisret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butviewbook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butadmn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addshelf() {
        try {
            String sql = "select shelf from shelf";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String st = rs.getString("shelf");
                slfno.addItem(st);
            }
        } catch (SQLException e) {
        }

    }

    private void addrow() {
        try {
            String sql = "select row from row";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String st = rs.getString("row");
                rowno.addItem(st);

            }
        } catch (SQLException e) {
        }
    }

    private void addcolumn() {
        try {
            String sql = "select col from coln";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String st = rs.getString("col");
                posno.addItem(st);

            }
        } catch (SQLException e) {
        }
    }

    private void adddep() {

        try {
            String s = "select bkdep from bkdepart";
            pst = con.prepareStatement(s);
            rs = pst.executeQuery();
            while (rs.next()) {
                String st = rs.getString("bkdep");
                comdep.addItem(st);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void clear() {
        title.setText(null);
        id.setText(null);
        aut.setText(null);
        vol.setText(null);
        num.setText(null);
        des.setText(null);
        slfno.setSelectedItem(null);
        rowno.setSelectedItem(null);
        posno.setSelectedItem(null);
        comdep.setSelectedItem(null);
    }

    public void clearothr() {
        title.setText(null);
        aut.setText(null);
        vol.setText(null);
        num.setText(null);
        des.setText(null);
        slfno.setSelectedItem(null);
        rowno.setSelectedItem(null);
        posno.setSelectedItem(null);
        comdep.setSelectedItem(null);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void autActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autActionPerformed

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volActionPerformed

    private void togstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togstatActionPerformed

        if (togstat.isSelected()) {
            togstat.setText("Available");
        } else {

            togstat.setText("Loaned");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_togstatActionPerformed

    public void authentication() {
        if (aut.getText() == null || title.getText() == null || vol.getText() == null || des.getText() == null || num.getText() == null || id.getText() == null || slfno.getSelectedItem() == null || rowno.getSelectedItem() == null || posno.getSelectedItem() == null || comdep.getSelectedItem() == null) {

            flag = 1;
        } else {
            flag = 0;
        }
    }

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        authentication();
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Fill All The Fields");
        } else {

            try {
                String sql = "update book set Bkid='" + id.getText() + "',Title='" + title.getText() + "',Author='" + aut.getText() + "',Number='" + num.getText() + "',Description='" + des.getText() + "',Volume='" + vol.getText() + "',shelf='" + slfno.getSelectedItem() + "',row='" + rowno.getSelectedItem() + "',Position='" + posno.getSelectedItem() + "',Department='" + comdep.getSelectedItem() + "'" + "where Bkid='" + id.getText() + "'";

                pst = con.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Success");
                clear();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pst.close();

                } catch (SQLException e) {

                }
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed


    private void butsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsubActionPerformed
        authentication();
        if (flag == 0) {
            try {
                String sql = "insert into book (Bkid,Title,Author,Number,Status,Description,Volume,shelf,row,Position,Department) values(?,?,?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, id.getText());
                pst.setString(2, title.getText());
                pst.setString(3, aut.getText());
                pst.setString(4, num.getText());
                pst.setString(5, togstat.getText());
                pst.setString(6, des.getText());
                pst.setString(7, vol.getText());
                pst.setString(8, (String) slfno.getSelectedItem());
                pst.setString(9, (String) rowno.getSelectedItem());
                pst.setString(10, (String) posno.getSelectedItem());
                pst.setString(11, (String) comdep.getSelectedItem());
                String chk = "select * from book where shelf='" + slfno.getSelectedItem() + "' and row='" + rowno.getSelectedItem() + "' and Position='" + posno.getSelectedItem() + "'";
                PreparedStatement pchk = con.prepareStatement(chk);
                rs = pchk.executeQuery();
                if (rs.absolute(1)) {
                    JOptionPane.showMessageDialog(null, "Position already filled..\nChoose another location..");
                } else {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Success");
                    String upd = "insert into bookupdates(bookid) values(?)";
                    pst = con.prepareStatement(upd);
                    pst.setString(1, id.getText());
//                    pst.execute();
                    String s1 = id.getText();
                    String s2 = title.getText();
                    QrGen.codegen(s1);
                    clear();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill All The Fields");

        }
    }//GEN-LAST:event_butsubActionPerformed

    private void butrstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butrstActionPerformed

        clear();
    }//GEN-LAST:event_butrstActionPerformed

    private void butdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdelActionPerformed
        try {
            String sql = "delete from  book where Bkid=?";
            PreparedStatement pst_delete = con.prepareStatement(sql);
            pst_delete.setString(1, id.getText());
            pst_delete.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            clear();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }// TODO add your handling code here:
    }//GEN-LAST:event_butdelActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        try {
            String check = "select * from book where Bkid=?";
            pst = con.prepareStatement(check);
            pst.setString(1, id.getText());
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                rs = pst.executeQuery();
                if (rs.next()) {
                    String tit = rs.getString("Title");
                    title.setText(tit);
                    String author = rs.getString("Author");
                    aut.setText(author);
                    String volm = rs.getString("volume");
                    vol.setText(volm);
                    String numb = rs.getString("Number");
                    num.setText(numb);
                    String stat = rs.getString("Status");
                    togstat.setText(stat);
                    String desc = rs.getString("Description");
                    des.setText(desc);
                    String dep = rs.getString("Department");
                    comdep.setSelectedItem(dep);
                    String slf = rs.getString("shelf");
                    slfno.setSelectedItem(slf);
                    String row = rs.getString("row");
                    rowno.setSelectedItem(row);
                    String pos = rs.getString("Position");
                    posno.setSelectedItem(pos);

                }
            } else {
                clearothr();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_idActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyReleased

    private void butbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbookActionPerformed
        new Book().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butbookActionPerformed

    private void butadmn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butadmn2ActionPerformed
        new Adminpanel().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_butadmn2ActionPerformed

    private void butisretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butisretActionPerformed
        new IssueRet().setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_butisretActionPerformed

    private void butbook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbook1ActionPerformed

    }//GEN-LAST:event_butbook1ActionPerformed

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

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you want to Logout", "Logout", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void posnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posnoActionPerformed

    private void comdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comdepActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aut;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton butadmn2;
    private javax.swing.JButton butbook;
    private javax.swing.JButton butbook1;
    private javax.swing.JButton butdel;
    private javax.swing.JButton butisret;
    private javax.swing.JButton butrprt;
    private javax.swing.JButton butrst;
    private javax.swing.JButton butsub;
    private javax.swing.JButton butuser;
    private javax.swing.JButton butviewbook;
    private javax.swing.JButton butviewrqst;
    private javax.swing.JButton butviewuser;
    private javax.swing.JComboBox comdep;
    private javax.swing.JTextArea des;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imagetop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField num;
    private javax.swing.JPanel pic;
    private javax.swing.JComboBox<String> posno;
    private javax.swing.JComboBox<String> rowno;
    private javax.swing.JComboBox<String> slfno;
    private javax.swing.JTextField title;
    private javax.swing.JToggleButton togstat;
    private javax.swing.JTextField vol;
    // End of variables declaration//GEN-END:variables
}
