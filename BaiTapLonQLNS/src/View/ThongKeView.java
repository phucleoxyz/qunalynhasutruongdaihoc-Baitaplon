package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeView extends javax.swing.JFrame {

    public ThongKeView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btntkcb = new javax.swing.JButton();
        btntkl = new javax.swing.JButton();
        btntkkt = new javax.swing.JButton();
        btntkcbpb = new javax.swing.JButton();
        btnquaylai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btntkcb.setText("THONG KE CAN BO");
        btntkcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkcbActionPerformed(evt);
            }
        });

        btntkl.setText("THONG KE LUONG");
        btntkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntklActionPerformed(evt);
            }
        });

        btntkkt.setText("THONG KHEN THUONG");
        btntkkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkktActionPerformed(evt);
            }
        });

        btntkcbpb.setText("THONG KE CAN BO PHONG BAN");
        btntkcbpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkcbpbActionPerformed(evt);
            }
        });

        btnquaylai.setText("Quaylai");
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntkcb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntkl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntkkt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntkcbpb, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnquaylai)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btntkcb)
                .addGap(18, 18, 18)
                .addComponent(btntkl)
                .addGap(29, 29, 29)
                .addComponent(btntkkt)
                .addGap(27, 27, 27)
                .addComponent(btntkcbpb)
                .addGap(18, 18, 18)
                .addComponent(btnquaylai)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        try {
            new LoginView().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btntklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntklActionPerformed
        new ThongkeLuong().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntklActionPerformed

    private void btntkcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkcbActionPerformed
        try {
            new ThongkeCanbo().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btntkcbActionPerformed

    private void btntkktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkktActionPerformed
        new ThongkeKhenthuong().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntkktActionPerformed

    private void btntkcbpbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkcbpbActionPerformed
        new ThongkeChucvuPhongban().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntkcbpbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquaylai;
    private javax.swing.JButton btntkcb;
    private javax.swing.JButton btntkcbpb;
    private javax.swing.JButton btntkkt;
    private javax.swing.JButton btntkl;
    // End of variables declaration//GEN-END:variables
}
