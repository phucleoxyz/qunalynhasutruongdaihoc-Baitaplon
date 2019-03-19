
package View;
import Controller.KhenthuongDAO;
import Model.KhenThuong;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class QuanLyKhenThuongView extends javax.swing.JFrame implements ActionListener {

    private KhenthuongDAO dao;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = "SELECT*FROM tblkhenthuong";
    private String ma;

    public QuanLyKhenThuongView() {
        initComponents();
        setLocationRelativeTo(null);
        btnthem.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
        btntimkiem.addActionListener(this);
        btnreset.addActionListener(this);
        dao = new KhenthuongDAO();
        showCT();
        processCrt(false);
    }

    private void showCT() {
        dao.loadData(sql, tb);
    }

    public void processCrt(boolean b) {
        btnsua.setEnabled(b);
        btnxoa.setEnabled(b);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtmakhenthuong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthinhthuckhenthuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtthanhtich = new javax.swing.JTextField();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnquaylai = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MaKhenthuong:");

        jLabel2.setText("HinhthucKhenthuong:");

        jLabel3.setText("Thanhtich:");

        btntimkiem.setText("Timkiem");

        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        btnthem.setText("Them");

        btnsua.setText("Sua");

        btnxoa.setText("Xoa");

        btnquaylai.setText("Quaylai");
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoat");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(txtmakhenthuong)
                    .addComponent(txthinhthuckhenthuong)
                    .addComponent(txtthanhtich))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnthem)
                .addGap(47, 47, 47)
                .addComponent(btnsua)
                .addGap(37, 37, 37)
                .addComponent(btnxoa)
                .addGap(47, 47, 47)
                .addComponent(btnquaylai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnthoat)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntimkiem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmakhenthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnhome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthinhthuckhenthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtthanhtich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnquaylai)
                    .addComponent(btnthoat))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        try {
            processCrt(true);
            int row = tb.getSelectedRow();
            String idrow = tb.getModel().getValueAt(row, 0).toString();
            String sql1 = "SELECT*FROM tblkhenthuong where makhenthuong = '" + idrow + "'";
            rs = dao.showTextField(sql1);
            while (rs.next()) {
                ma = rs.getString("makhenthuong");
                txtmakhenthuong.setText(rs.getString("makhenthuong"));
                txthinhthuckhenthuong.setText(rs.getString("hinhthuckhenthuong"));
                txtthanhtich.setText(rs.getString("thanhtich"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbMouseClicked

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        showCT();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
       new QuanLyNhanSuView().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhenThuongView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txthinhthuckhenthuong;
    private javax.swing.JTextField txtmakhenthuong;
    private javax.swing.JTextField txtthanhtich;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnthem)) {
            btnThemClick();
        } else if (e.getSource().equals(btnsua)) {
            btnSuaClick();
        } else if (e.getSource().equals(btnxoa)) {
            btnXoaClick();
        } else if (e.getSource().equals(btntimkiem)) {
            btnTimkiemClick();
        } else {
            btnResetClick();
        }
    }

    private void btnThemClick() {
        KhenThuong kt = new KhenThuong();
        kt.setMakhenthuong(txtmakhenthuong.getText());
        kt.setHinhthuckhenthuong(txthinhthuckhenthuong.getText());
        kt.setThanhtich(txtthanhtich.getText());
        if (dao.themKhenthuong(kt)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "them khen thuong thanh cong");
        } else {
            JOptionPane.showMessageDialog(rootPane, "them khen thuong that bai");

        }

    }

    private void btnSuaClick() {
        KhenThuong kt = new KhenThuong();
        kt.setMakhenthuong(txtmakhenthuong.getText());
        kt.setHinhthuckhenthuong(txthinhthuckhenthuong.getText());
        kt.setThanhtich(txtthanhtich.getText());
        if (dao.suaKhenthuong(ma, kt)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "sua khen thung thanh cong");
        } else {
            JOptionPane.showMessageDialog(rootPane, "sua khen thuong that bai");

        }

    }

    private void btnXoaClick() {
        if (dao.xoaKhenthuong(ma)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "xoa thanh cong");

        } else {
            JOptionPane.showMessageDialog(rootPane, "xoa that bai");

        }
    }

    private void btnTimkiemClick() {
        dao.loadData(dao.timkiemKhenthuong(txttimkiem.getText()), tb);

    }

    private void btnResetClick() {
        txtmakhenthuong.setText("");
        txthinhthuckhenthuong.setText("");
        txtthanhtich.setText("");
        txttimkiem.setText("");

    }

}
