/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package btl_qlsv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class form_ad_thongke_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form form_ad_thongke_JPanel
     */
    public form_ad_thongke_JPanel() {
        initComponents();
        
        loadComboBox();
    }

    
    private void loadComboBox() {
        try {
            Connection kn = KetNoi.KNCSDL();
            String sql = "SELECT TenKhoa FROM khoa";
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            this.combKhoa.addItem(" ");
            while (rs.next()) {
                this.combKhoa.addItem(rs.getString("TenKhoa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_thongke_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void load_btnNam(int nam) {
        try {
            String khoa = (String) this.combKhoa.getSelectedItem();
            int namVaoTruong = Integer.parseInt((String) this.combNam.getSelectedItem()) - (nam - 1);
            Map<String, Double> sv_dc_chon = Map_thutuSV("Năm " + nam);

            if (sv_dc_chon.isEmpty()) {
                DefaultTableModel dtm = (DefaultTableModel) tbHTDiem.getModel();
                dtm.setRowCount(0);
                tbHTDiem.setModel(dtm);
                JOptionPane.showMessageDialog(this, "Hiện tại năm "+nam+" khoa này chưa có sinh viên có điểm tổng kết", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                String str_svDC = MapToString(sv_dc_chon);
                HienThi_tb(namVaoTruong, khoa, sv_dc_chon, str_svDC);
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_thongke_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Map<String, Double> Map_thutuSV(String nam) throws SQLException {
        String sql = "SELECT DKHP.MaSinhVien, DKHP.DiemTongKet_TD4 "
                + "FROM dangkyhocphan AS DKHP "
                + "JOIN lophocphan AS LHP ON DKHP.MaLopHocPhan = LHP.MaLopHocPhan "
                + "                    AND LHP.MaLopHocPhan IN (SELECT MaLopHocPhan "
                + "                                                FROM `lophocphan` "
                + "                                                WHERE MaHocPhan IN (SELECT MaHocPhan  "
                + "                                                                    FROM hocphan AS HP "
                + "                                                                    JOIN khoa AS K ON K.TenKhoa = '" + this.combKhoa.getSelectedItem() + "' "
                + "                                                                    JOIN nganh AS N ON HP.MaNganh = N.MaNganh AND N.MaKhoa = K.MaKhoa  "
                + "                                                                    WHERE HP.NamKyHoc LIKE '" + nam + "%' "
                + "                                                                    )"
                + "                                               )";
        ResultSet rs = DataAccess.getResult(sql);

        Map<String, Double> sv_TongDTK_TD4 = new HashMap<>(); // Using a Map to store student data

        while (rs.next()) {
            String maSinhVien = rs.getString("MaSinhVien");
            double diemTongKetTD4 = rs.getDouble("DiemTongKet_TD4");

            // Check if the student exists in the map
            if (sv_TongDTK_TD4.containsKey(maSinhVien)) {
                // Update the existing total with the new value
                sv_TongDTK_TD4.put(maSinhVien, sv_TongDTK_TD4.get(maSinhVien) + diemTongKetTD4);
            } else {
                // Add the new student to the map
                sv_TongDTK_TD4.put(maSinhVien, diemTongKetTD4);
            }
        }

        return sv_TongDTK_TD4;
    }

    private String MapToString(Map<String, Double> sv_TongDTK_TD4) {
        // Convert the sorted Entry array to a String array (optional)
        String[][] sortedData = new String[sv_TongDTK_TD4.size()][2];
        int index = 0;
        for (Map.Entry<String, Double> entry : sv_TongDTK_TD4.entrySet()) {
            sortedData[index][0] = entry.getKey(); // Assuming student ID is at index 0
            sortedData[index][1] = String.valueOf(entry.getValue()); // Convert double to String
            index++;
        }

        String str_svDC = "";
        for (String[] student : sortedData) {
            str_svDC += "'" + student[0] + "',";
        }

        str_svDC = str_svDC.substring(0, str_svDC.length() - 1);
        return str_svDC;
    }

    private void HienThi_tb(int namVaoTruong, String khoa, Map<String, Double> sv_dc_chon, String str_svDC) {
        try {

            String sql = "SELECT SV.MaSinhVien, SV.TenSinhVien, L.TenLop, SV.Email, SV.SoDienThoai, SV.DiaChi, SV.NgaySinh, SV.GioiTinh "
                    + "FROM sinhvien AS SV "
                    + "JOIN lop AS L ON SV.MaLop = L.MaLop AND L.MaNganh IN (SELECT MaNganh "
                    + "                                                     FROM nganh "
                    + "                                                     WHERE MaKhoa LIKE (SELECT MaKhoa "
                    + "                                                                         FROM khoa "
                    + "                                                                         WHERE TenKhoa = '" + khoa + "')) "
                    + "WHERE  NgayVaoTruong LIKE '" + namVaoTruong + "%' AND SV.MaSinhVien IN (" + str_svDC + ") ";
            ResultSet rs = DataAccess.getResult(sql);
            DefaultTableModel dtm = (DefaultTableModel) tbHTDiem.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    sv_dc_chon.get(rs.getString(1))
                };
                dtm.addRow(objlist);
            }

            if (dtm.getRowCount() != 0) {
                double MaxDiemTK_TD4 = 0;
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    double diemTK_TD4 = (double) dtm.getValueAt(i, 8);
                    if (diemTK_TD4 >= MaxDiemTK_TD4) {
                        MaxDiemTK_TD4 = diemTK_TD4;
                        dtm.moveRow(i, i, 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hiện tại ko có dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            tbHTDiem.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_thongke_JPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        combKhoa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHTDiem = new javax.swing.JTable();
        btnNam1 = new javax.swing.JButton();
        btnNam2 = new javax.swing.JButton();
        btnNam3 = new javax.swing.JButton();
        btnNam4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combNam = new javax.swing.JComboBox<>();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Năm");

        combKhoa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tbHTDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Tên lớp", "Email", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Giới tính", "Điểm tổng kết"
            }
        ));
        jScrollPane1.setViewportView(tbHTDiem);

        btnNam1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNam1.setText("Năm 1");
        btnNam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNam1ActionPerformed(evt);
            }
        });

        btnNam2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNam2.setText("Năm 2");
        btnNam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNam2ActionPerformed(evt);
            }
        });

        btnNam3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNam3.setText("Năm 3");
        btnNam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNam3ActionPerformed(evt);
            }
        });

        btnNam4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNam4.setText("Năm 4");
        btnNam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNam4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Khoa");

        combNam.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        combNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       ", "2020", "2021", "2022", "2023" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combNam, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnNam2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNam3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnNam4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNam4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNam2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNam3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNam1ActionPerformed
        load_btnNam(1);
    }//GEN-LAST:event_btnNam1ActionPerformed

    private void btnNam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNam2ActionPerformed
        load_btnNam(2);
    }//GEN-LAST:event_btnNam2ActionPerformed

    private void btnNam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNam3ActionPerformed
        load_btnNam(3);
    }//GEN-LAST:event_btnNam3ActionPerformed

    private void btnNam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNam4ActionPerformed
        load_btnNam(4);
    }//GEN-LAST:event_btnNam4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNam1;
    private javax.swing.JButton btnNam2;
    private javax.swing.JButton btnNam3;
    private javax.swing.JButton btnNam4;
    private javax.swing.JComboBox<String> combKhoa;
    private javax.swing.JComboBox<String> combNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHTDiem;
    // End of variables declaration//GEN-END:variables
}
