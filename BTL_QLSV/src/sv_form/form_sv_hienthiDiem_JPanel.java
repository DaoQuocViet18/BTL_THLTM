/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sv_form;

import data.DataAccess;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class form_sv_hienthiDiem_JPanel extends javax.swing.JPanel {

    String maSinhVien;

    /**
     * Creates new form form_sv_hienthiDiem_JPanel
     */
    public form_sv_hienthiDiem_JPanel(String maSinhVien) {
        initComponents();
        this.maSinhVien = maSinhVien;
    }

    private String chuyenDoiDiemChu(double diemHe4) {
        if (diemHe4 == 4.0) {
            return "A";
        } else if (diemHe4 == 3.5) {
            return "B+";
        } else if (diemHe4 == 3.0) {
            return "B";
        } else if (diemHe4 == 2.5) {
            return "C+";
        } else if (diemHe4 == 2.0) {
            return "C";
        } else if (diemHe4 == 1.5) {
            return "D+";
        } else if (diemHe4 == 1.0) {
            return "D";
        } else {
            return "F";
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHienThi = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHTDiem = new javax.swing.JTable();

        btnHienThi.setText("Hiển Thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        combo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm 1 Kỳ 1", "Năm 1 Kỳ 2", "Năm 2 Kỳ 1", "Năm 2 Kỳ 2", "Năm 3 Kỳ 1", "Năm 3 Kỳ 2", "Năm 4 Kỳ 1", "Năm 4 Kỳ 2" }));

        tbHTDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên lớp học phần", "Điểm hs 1-1", "Điểm hs 1-2", "Điểm hs 2-1", "Điểm hs 2-2", "Điểm thi CKỳ", "Điểm TK", "Thang điểm 4", "Điểm chữ"
            }
        ));
        jScrollPane1.setViewportView(tbHTDiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btnHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        try {
            String xuat = "SELECT lhp.TenLopHocPhan, dkhp.DiemHeSo1_1, dkhp.DiemHeSo1_2, dkhp.DiemHeSo2_1, dkhp.DiemHeSo2_2, dkhp.DiemThiCuoiKy, dkhp.DiemTongKet, dkhp.DiemTongKet_TD4 "
                    + "FROM dangkyhocphan AS dkhp "
                    + "JOIN lophocphan AS lhp ON dkhp.MaLopHocPhan = lhp.MaLopHocPhan "
                    + "JOIN hocphan AS hp ON lhp.MaHocPhan = hp.MaHocPhan AND hp.NamKyHoc = '" + this.combo.getSelectedItem() + "'"
                    + "WHERE dkhp.MaSinhVien = '" + this.maSinhVien + "'";
            ResultSet rs = DataAccess.getResult(xuat);
            DefaultTableModel dtm = (DefaultTableModel) tbHTDiem.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(8) != null ? chuyenDoiDiemChu(rs.getDouble(8)) : " " // Chuyển đổi điểm từ thang điểm 4 sang điểm chữ
                };
                dtm.addRow(data);
            }
            tbHTDiem.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(form_sv_hienthiDiem_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnHienThiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHTDiem;
    // End of variables declaration//GEN-END:variables
}
