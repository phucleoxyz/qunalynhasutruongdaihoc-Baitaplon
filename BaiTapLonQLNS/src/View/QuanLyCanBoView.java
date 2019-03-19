/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CanBoDAO;
import Model.CanBo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

public class QuanLyCanBoView extends javax.swing.JFrame implements ActionListener {

    private String sql = "SELECT*FROM dbo.tblcanbo";
    private CanBoDAO dao;
    private String macb1;

    public QuanLyCanBoView() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        dao = new CanBoDAO();
        btnthem.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
        btntimkiem.addActionListener(this);
        btnrefresh.addActionListener(this);
        showCT();
        processCrt(false);

    }

    public void showCT() {
        dao.loadData(sql, tb1);
    }

    public void processCrt(boolean b) {       
        btnsua.setEnabled(b);
        btnxoa.setEnabled(b);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnam = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtmacb = new javax.swing.JTextField();
        txttenxb = new javax.swing.JTextField();
        rbtnu = new javax.swing.JRadioButton();
        txtquequan = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtquoctich = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbbtrinhdo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbbchuyennganh = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsodt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtkiluat = new javax.swing.JTextField();
        txtthuongtru = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttamtru = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtgiadinhcs = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcmt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtnoicap = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtngaycap = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtmaluong = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtmakhenthuong = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmacbpb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtdantoc = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ma CB:");

        jLabel2.setText("Ten CB:");

        jLabel4.setText("Ngay Sinh:");

        jLabel5.setText("Gioi Tinh:");

        buttonGroup1.add(rbtnam);
        rbtnam.setText("Nam");

        jLabel7.setText("Que Quan:");

        buttonGroup1.add(rbtnu);
        rbtnu.setText("Nu");

        jLabel6.setText("Quoc Tich:");

        jLabel8.setText("Trinh Do:");

        cbbtrinhdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ki Su", "Thac Si", "Tien Si", "Giao Su", " " }));

        jLabel9.setText("Chuyen Nganh:");

        cbbchuyennganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "an toan thong tin", "cong nghe thong tin", "dien tu vien thong" }));

        jLabel10.setText("Email:");

        jLabel11.setText("So DT:");

        jLabel12.setText("Ki Luat:");

        jLabel13.setText("Thuong Tru:");

        jLabel14.setText("Tam Tru:");

        jLabel15.setText("Gia Dinh Chinh Sach:");

        jLabel16.setText("So CMT:");

        jLabel17.setText("Noi Cap:");

        jLabel18.setText("Ngay Cap:");

        jLabel19.setText("Ma Luong:");

        txtmaluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaluongActionPerformed(evt);
            }
        });

        jLabel20.setText("Ma Khen Thuong:");

        jLabel21.setText("Ma CvPb:");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        btntimkiem.setText("Tim Kiem");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnthem.setText("Them");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xoa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoat");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        jLabel22.setText("Dan Toc:");

        btnrefresh.setText("Reset");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnsua.setText("Sua");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jButton1.setText("quaylai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkiluat, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtthuongtru)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmacb, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txttenxb)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtquoctich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtquequan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtngaysinh))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(rbtnu)
                                .addGap(5, 5, 5))
                            .addComponent(cbbtrinhdo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbchuyennganh, javax.swing.GroupLayout.Alignment.TRAILING, 0, 131, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsodt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttamtru)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgiadinhcs, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(txtnoicap)
                    .addComponent(txtcmt)
                    .addComponent(txtngaycap)
                    .addComponent(txtmaluong)
                    .addComponent(txtmakhenthuong)
                    .addComponent(txtmacbpb)
                    .addComponent(txtdantoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntimkiem)
                    .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh))
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnthem)
                .addGap(131, 131, 131)
                .addComponent(btnsua)
                .addGap(104, 104, 104)
                .addComponent(btnxoa)
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(70, 70, 70)
                .addComponent(btnthoat)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbbtrinhdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txttenxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbbchuyennganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtquoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(txtkiluat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtthuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(txtgiadinhcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)))
                            .addComponent(txttamtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btntimkiem)
                        .addGap(65, 65, 65)
                        .addComponent(btnrefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmacb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(rbtnam)
                            .addComponent(rbtnu)
                            .addComponent(jLabel16)
                            .addComponent(txtcmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtnoicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtmaluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtmakhenthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtmacbpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthem)
                        .addComponent(btnxoa)
                        .addComponent(btnsua))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthoat)
                        .addComponent(jButton1)))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmaluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaluongActionPerformed

    }//GEN-LAST:event_txtmaluongActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        try {
            processCrt(true);            
            int row = tb1.getSelectedRow();
            String idrow = tb1.getModel().getValueAt(row, 0).toString();
            String sql1 = "SELECT*FROM dbo.tblcanbo where macb = '" + idrow + "'";
            ResultSet rs = dao.showTextField(sql1);
            if (rs.next()) {
                macb1 = rs.getString("macb");
                txtmacb.setText(rs.getString("macb"));
                txttenxb.setText(rs.getString("tencb"));
                txtngaysinh.setText(rs.getString("ngaysinh"));
                String gt1 = rs.getString("gioitinh");
                String gt = tb1.getModel().getValueAt(row, 3).toString();
                if (gt.toUpperCase().equals("NU")) {
                    rbtnu.setSelected(true);
                } else {
                    rbtnam.setSelected(true);
                }
                txtquequan.setText(rs.getString("quequan"));
                txtquoctich.setText(rs.getString("quoctich"));
                txtdantoc.setText(rs.getString("dantoc"));
                String td = rs.getString("trinhdo");
                switch (td) {
                    case "ki su":
                        cbbtrinhdo.setSelectedIndex(0);
                        break;
                    case "thac si":
                        cbbtrinhdo.setSelectedIndex(1);
                        break;
                    case "tien si":
                        cbbtrinhdo.setSelectedIndex(2);

                        break;
                    case "giao su":

                        cbbtrinhdo.setSelectedItem(3);
                        break;

                }
                String cn = rs.getString("chuyennganh");
                switch (cn) {
                    case "an toan thong tin":
                        cbbchuyennganh.setSelectedIndex(0);
                        break;
                    case "cong nghe thong tin":
                        cbbchuyennganh.setSelectedIndex(1);
                        break;
                    case "dien tu vien thong":
                        cbbchuyennganh.setSelectedIndex(2);
                        break;
                }
                txtemail.setText(rs.getString("email"));
                txtsodt.setText(rs.getString("sodt"));
                txtkiluat.setText(rs.getString("kiluat"));
                txtthuongtru.setText(rs.getString("thuongtru"));
                txttamtru.setText(rs.getString("tamtru"));
                txtgiadinhcs.setText(rs.getString("giadinhcs"));
                txtcmt.setText(rs.getString("socmt"));
                txtnoicap.setText(rs.getString("noicapcmt"));
                txtngaycap.setText(rs.getString("ngaycapcmt"));
                txtmaluong.setText(rs.getString("maluong"));
                txtmakhenthuong.setText(rs.getString("makhenthuong"));
                txtmacbpb.setText(rs.getString("macvpb"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tb1MouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed


    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed

    }//GEN-LAST:event_btnxoaActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed

    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        showCT();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed


    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new QuanLyNhanSuView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyCanBoView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyCanBoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbchuyennganh;
    private javax.swing.JComboBox<String> cbbtrinhdo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnam;
    private javax.swing.JRadioButton rbtnu;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtcmt;
    private javax.swing.JTextField txtdantoc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgiadinhcs;
    private javax.swing.JTextField txtkiluat;
    private javax.swing.JTextField txtmacb;
    private javax.swing.JTextField txtmacbpb;
    private javax.swing.JTextField txtmakhenthuong;
    private javax.swing.JTextField txtmaluong;
    private javax.swing.JTextField txtngaycap;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtnoicap;
    private javax.swing.JTextField txtquequan;
    private javax.swing.JTextField txtquoctich;
    private javax.swing.JTextField txtsodt;
    private javax.swing.JTextField txttamtru;
    private javax.swing.JTextField txttenxb;
    private javax.swing.JTextField txtthuongtru;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnthem)) {
            btnAddClick();
        } else if (e.getSource().equals(btnsua)) {
            btnEditClick();
        } else if (e.getSource().equals(btnxoa)) {
            btnDeleteClick();
        } else if (e.getSource().equals(btntimkiem)) {
            btnSearchClick();
        } else if (e.getSource().equals(btnrefresh)) {

            btnResetClick();
        } else  {

          //btnExitClick();
        }

    }

    public void btnAddClick() {  
        CanBo cb = new CanBo();
        cb.setMacb(txtmacb.getText());
        cb.setTencb(txttenxb.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            cb.setNgaysinh(sdf.parse(txtngaysinh.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyCanBoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String order = "";
        if (rbtnam.isSelected()) {
            order = "nam";
        } else {
            order = "nu";
        }

        cb.setGioitinh(order);
        cb.setQuequan(txtquequan.getText());
        cb.setQuoctich(txtquoctich.getText());
        cb.setDantoc(txtdantoc.getText());
        cb.setTrinhdo((String) cbbtrinhdo.getSelectedItem());
        cb.setChuyennganh((String) cbbchuyennganh.getSelectedItem());
        cb.setEmail(txtemail.getText());
        cb.setSodt(txtsodt.getText());
        cb.setKyluat(txtkiluat.getText());
        cb.setThuongtru(txtthuongtru.getText());
        cb.setTamtru(txttamtru.getText());
        cb.setGiadinhchinhsach(txtgiadinhcs.getText());
        cb.setSocmt(txtcmt.getText());
        cb.setNoicapcmt(txtnoicap.getText());

        try {
            cb.setNgayscapcmt(sdf.parse(txtngaycap.getText()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        cb.setMaluong(txtmaluong.getText());
        cb.setMakt(txtmakhenthuong.getText());
        cb.setMacbpb(txtmacbpb.getText());
        if (dao.themCanBo(cb)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "them thanh cong");
        } else {
            JOptionPane.showMessageDialog(rootPane, "them that bai");

        }

    }

    public void btnEditClick() {
        try {
            CanBo cb = new CanBo();
            cb.setMacb(txtmacb.getText());
            cb.setTencb(txttenxb.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                cb.setNgaysinh(sdf.parse(txtngaysinh.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyCanBoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            String order = "";
            if (rbtnam.isSelected()) {
                order = "nam";
            } else {
                order = "nu";
            }

            cb.setGioitinh(order);
            cb.setQuequan(txtquequan.getText());
            cb.setQuoctich(txtquoctich.getText());
            cb.setDantoc(txtdantoc.getText());
            cb.setTrinhdo((String) cbbtrinhdo.getSelectedItem());
            cb.setChuyennganh((String) cbbchuyennganh.getSelectedItem());
            cb.setEmail(txtemail.getText());
            cb.setSodt(txtsodt.getText());
            cb.setKyluat(txtkiluat.getText());
            cb.setThuongtru(txtthuongtru.getText());
            cb.setTamtru(txttamtru.getText());
            cb.setGiadinhchinhsach(txtgiadinhcs.getText());
            cb.setSocmt(txtcmt.getText());
            cb.setNoicapcmt(txtnoicap.getText());

            try {
                cb.setNgayscapcmt(sdf.parse(txtngaycap.getText()));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            cb.setMaluong(txtmaluong.getText());
            cb.setMakt(txtmakhenthuong.getText());
            cb.setMacbpb(txtmacbpb.getText());
            if (dao.suaCanBo(macb1, cb)) {
                showCT();
                JOptionPane.showMessageDialog(rootPane, "sua thanh cong");
            } else {
                JOptionPane.showMessageDialog(rootPane, "sua that bai");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void btnDeleteClick() {
        if (dao.xoa(macb1)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "xoa thanh cong");

        } else {
            JOptionPane.showMessageDialog(rootPane, "xoa that bai");

        }
    }

    public void btnSearchClick() {
        try {
            dao.loadData(dao.timkiem(this.txttimkiem.getText()), tb1);
        } catch (Exception e) {
        }
    }

    public void btnExitClick() {
        System.exit(0);
    }

    public void btnResetClick() {
        processCrt(false);
        btnthem.setEnabled(true);
        txtmacb.setText("");
        txttenxb.setText("");
        txtngaysinh.setText("");
        buttonGroup1.clearSelection();
        txtquequan.setText("");
        txtquoctich.setText("");
        txtdantoc.setText("");
        cbbtrinhdo.setSelectedItem(0);
        cbbchuyennganh.setSelectedItem(0);
        txtemail.setText("");
        txtsodt.setText("");
        txtkiluat.setText("");
        txtthuongtru.setText("");
        txttamtru.setText("");
        txtgiadinhcs.setText("");
        txtcmt.setText("");
        txtnoicap.setText("");
        txtngaycap.setText("");
        txtmaluong.setText("");
        txtmakhenthuong.setText("");
        txtmacbpb.setText("");
        txttimkiem.setText("");
    }
}
