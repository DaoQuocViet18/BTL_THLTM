/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlsv;

import java.awt.BorderLayout;

/**
 *
 * @author Admin
 */
public class form_ad_main extends javax.swing.JFrame {

    /**
     * Creates new form form_ad_main
     */
    public form_ad_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_ChucNang = new javax.swing.JPanel();
        btnKhoa = new javax.swing.JButton();
        btnNganh = new javax.swing.JButton();
        btnLop = new javax.swing.JButton();
        btnSinhVien = new javax.swing.JButton();
        btnLopHocPhan = new javax.swing.JButton();
        btnHocPhan = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jPanel_HienThi = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_ChucNang.setBackground(new java.awt.Color(102, 102, 102));

        btnKhoa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnKhoa.setText("Khoa");
        btnKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaActionPerformed(evt);
            }
        });

        btnNganh.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNganh.setText("Ngành");
        btnNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNganhActionPerformed(evt);
            }
        });

        btnLop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLop.setText("Lớp");
        btnLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopActionPerformed(evt);
            }
        });

        btnSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSinhVien.setText("Sinh viên");
        btnSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhVienActionPerformed(evt);
            }
        });

        btnLopHocPhan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLopHocPhan.setText("Lớp học phần");
        btnLopHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopHocPhanActionPerformed(evt);
            }
        });

        btnHocPhan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHocPhan.setText("Học phần");
        btnHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocPhanActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ChucNangLayout = new javax.swing.GroupLayout(jPanel_ChucNang);
        jPanel_ChucNang.setLayout(jPanel_ChucNangLayout);
        jPanel_ChucNangLayout.setHorizontalGroup(
            jPanel_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLopHocPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHocPhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_ChucNangLayout.setVerticalGroup(
            jPanel_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLopHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_HienThiLayout = new javax.swing.GroupLayout(jPanel_HienThi);
        jPanel_HienThi.setLayout(jPanel_HienThiLayout);
        jPanel_HienThiLayout.setHorizontalGroup(
            jPanel_HienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        jPanel_HienThiLayout.setVerticalGroup(
            jPanel_HienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_HienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_HienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocPhanActionPerformed
        // TODO add your handling code here:\
        form_ad_hocphan_JPanel form = new form_ad_hocphan_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnHocPhanActionPerformed

    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaActionPerformed
        // TODO add your handling code here:
//        form_ad_khoa form = new form_ad_khoa();
//        form.setVisible(true);
        form_ad_khoa_JPanel form = new form_ad_khoa_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnKhoaActionPerformed

    private void btnNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNganhActionPerformed
        // TODO add your handling code here:
        form_ad_nganh_JPanel form = new form_ad_nganh_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnNganhActionPerformed

    private void btnLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopActionPerformed
        // TODO add your handling code here:
        form_ad_lop_JPanel form = new form_ad_lop_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnLopActionPerformed

    private void btnSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhVienActionPerformed
        // TODO add your handling code here:
        form_ad_sinhvien form = new form_ad_sinhvien();
        form.setVisible(true);
    }//GEN-LAST:event_btnSinhVienActionPerformed

    private void btnLopHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopHocPhanActionPerformed
        // TODO add your handling code here:
        form_ad_lophocphan_JPanel form = new form_ad_lophocphan_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnLopHocPhanActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        form_ad_thongke_JPanel form = new form_ad_thongke_JPanel();
        this.jPanel_HienThi.removeAll();
        this.jPanel_HienThi.setLayout(new BorderLayout());
        this.jPanel_HienThi.add(form, BorderLayout.CENTER);
        this.jPanel_HienThi.validate();
        this.jPanel_HienThi.repaint();
    }//GEN-LAST:event_btnThongKeActionPerformed

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
            java.util.logging.Logger.getLogger(form_ad_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ad_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ad_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ad_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ad_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHocPhan;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnLop;
    private javax.swing.JButton btnLopHocPhan;
    private javax.swing.JButton btnNganh;
    private javax.swing.JButton btnSinhVien;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jPanel_ChucNang;
    private javax.swing.JPanel jPanel_HienThi;
    // End of variables declaration//GEN-END:variables
}
