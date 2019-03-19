
package View;
import Controller.ChucvuPhongbanDAO;
import Model.ChucvuPhongban;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class QuanLyCvPbView extends javax.swing.JFrame implements ActionListener {

    private ChucvuPhongbanDAO dao;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = "SELECT*FROM dbo.chucvuphongban";
    private String ma;

    public QuanLyCvPbView() {
        initComponents();
        setLocationRelativeTo(null);
        btnthem.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
        btntimkiem.addActionListener(this);
        btnreset.addActionListener(this);
        dao = new ChucvuPhongbanDAO();
        showCT();
        processCrt(false);
    }

    public void showCT() {
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
        txtmachucvuphongban = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttenchucvu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttenphongban = new javax.swing.JTextField();
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

        jLabel1.setText("MaChucvuPhongban:");

        jLabel2.setText("TenChucvu:");

        jLabel3.setText("TenPhongban:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtmachucvuphongban)
                            .addComponent(txttenchucvu)
                            .addComponent(txttenphongban))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnthem)
                                .addGap(45, 45, 45)
                                .addComponent(btnsua)
                                .addGap(43, 43, 43)
                                .addComponent(btnxoa)
                                .addGap(31, 31, 31)
                                .addComponent(btnquaylai)
                                .addGap(30, 30, 30)
                                .addComponent(btnthoat))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmachucvuphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttenchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttenphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnquaylai)
                    .addComponent(btnthoat))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        try {
            processCrt(true);
            int row = tb.getSelectedRow();
            String idrow = tb.getModel().getValueAt(row, 0).toString();
            String sql1 = "SELECT*FROM dbo.chucvuphongban where macvpb = '" + idrow + "'";
            rs = dao.showTextField(sql1);
            while (rs.next()) {
                ma = rs.getString("macvpb");
                txtmachucvuphongban.setText(rs.getString("macvpb"));
                txttenchucvu.setText(rs.getString("tenchucvu"));
                txttenphongban.setText(rs.getString("tenphongban"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbMouseClicked

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        new QuanLyNhanSuView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
       showCT();
    }//GEN-LAST:event_btnhomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyCvPbView().setVisible(true);
            }
        });
    }

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
    private javax.swing.JTextField txtmachucvuphongban;
    private javax.swing.JTextField txttenchucvu;
    private javax.swing.JTextField txttenphongban;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    private void btnThemClick() {
        ChucvuPhongban cp = new ChucvuPhongban();
        cp.setMacvpb(txtmachucvuphongban.getText());
        cp.setTenchucvu(txttenchucvu.getText());
        cp.setTenphongban(txttenphongban.getText());
        if (dao.themChucvuPhongban(cp)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "them  thanh cong");
        } else {
            JOptionPane.showMessageDialog(rootPane, "them  that bai");

        }

    }

    private void btnSuaClick() {
        ChucvuPhongban cp = new ChucvuPhongban();
        cp.setMacvpb(txtmachucvuphongban.getText());
        cp.setTenchucvu(txttenchucvu.getText());
        cp.setTenphongban(txttenphongban.getText());
        if (dao.suaChucvuPhongban(ma, cp)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "sua thanh cong");
        } else {
            JOptionPane.showMessageDialog(rootPane, "sua that bai");

        }
    }

    private void btnXoaClick() {
        if (dao.xoaChucvuPhongban(ma)) {
            showCT();
            JOptionPane.showMessageDialog(rootPane, "xoa thanh cong");

        } else {
            JOptionPane.showMessageDialog(rootPane, "xoa that bai");

        }
    }

    private void btnTimkiemClick() {
        dao.loadData(dao.timkiemChucvuPhongban(this.txttimkiem.getText()), tb);
    }

    private void btnResetClick() {
        txtmachucvuphongban.setText("");
        txttenchucvu.setText("");
        txttenphongban.setText("");
        txttimkiem.setText("");

    }
}
