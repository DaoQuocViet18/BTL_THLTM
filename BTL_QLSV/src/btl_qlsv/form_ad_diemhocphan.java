/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlsv;

import btl_qlsv.Database_ad.DataAccess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class form_ad_diemhocphan extends javax.swing.JFrame {

    String maLopHocPhan;
    String maDienHocPhan;
    String maNganh;

    /**
     * Creates new form form_ad_diemhocphan
     */
    public form_ad_diemhocphan(String MaDienHocPhan, String maNganh, String maLopHocPhan) {
        initComponents();
        this.maLopHocPhan = maLopHocPhan;
        this.maDienHocPhan = MaDienHocPhan;
        this.maNganh = maNganh;

        Them_TenHP_vao_combTL();
        HienThi_tb_diemhocphan();
        // JOptionPane.showMessageDialog(null, "maDienHocPhan = " + this.maDienHocPhan, "Notification", JOptionPane.INFORMATION_MESSAGE);
    }

    private form_ad_diemhocphan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDHS1_2 = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        txtDHS2_1 = new javax.swing.JTextField();
        txtTKT = new javax.swing.JTextField();
        txtDHS2_2 = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDHS1_1 = new javax.swing.JTextField();
        txtDTCK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDTK = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDTCK_TD4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_diemlophocphan = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combTL = new javax.swing.JComboBox<>();
        combTSV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Điểm hệ số 1 - 2:");

        jLabel4.setText("Điểm hệ số 2 - 1:");

        jLabel6.setText("Điểm hệ số 2 - 2:");

        btnTimKiem.setText("Tìm kiếm");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm theo:");

        btnSua.setText("Sửa");

        btnXoa.setText("Xóa");

        jLabel2.setText("Tên sinh viên:");

        jLabel3.setText("Điểm hệ số 1 - 1:");

        jLabel7.setText("Điểm thi cuối kỳ:");

        jLabel8.setText("Điểm tổng kết:");

        jLabel9.setText("Điểm tổng kết - thang điểm 4:");

        tb_diemlophocphan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Điểm hs 1-1", "Điểm hs 1-2", "Điểm hs 2-1", "Điểm hs 2-2", "Điểm thi CKỳ", "Điểm TK", "Điểm TK - td4"
            }
        ));
        jScrollPane1.setViewportView(tb_diemlophocphan);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên lớp:");

        combTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTLActionPerformed(evt);
            }
        });

        combTSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(btnTimKiem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDTK, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDTCK_TD4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(combTL, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtDHS1_2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                        .addComponent(txtDHS2_1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                        .addComponent(txtDHS2_2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                        .addComponent(txtDTCK, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                        .addComponent(txtDHS1_1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                        .addComponent(combTSV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSua)
                                                    .addComponent(btnXoa)
                                                    .addComponent(btnThem)
                                                    .addComponent(btnThoat)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(txtDHS1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(txtDHS1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDHS2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDHS2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDTCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDTK)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtDTCK_TD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel5)
                    .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            String tenSV = combTSV.getItemAt(combTSV.getSelectedIndex());
            String maSV = this.getMaSV(tenSV);

            if (tb_diemlophocphan.getValueAt(0, 0) != null) {
                String sql = "UPDATE diemhocphan SET "
                        + "MaSinhVien = CASE WHEN MaSinhVien IS NULL OR MaSinhVien = '' THEN '" + maSV + "' ELSE CONCAT(MaSinhVien, '_" + maSV + "') END, "
                        + "DiemHeSo1_1 = CASE WHEN DiemHeSo1_1 IS NULL OR DiemHeSo1_1 = '' THEN '" + txtDHS1_1.getText() + "' ELSE CONCAT(DiemHeSo1_1, '_" + txtDHS1_1.getText() + "') END, "
                        + "DiemHeSo1_2 = CASE WHEN DiemHeSo1_2 IS NULL OR DiemHeSo1_2 = '' THEN '" + txtDHS1_2.getText() + "' ELSE CONCAT(DiemHeSo1_2, '_" + txtDHS1_2.getText() + "') END, "
                        + "DiemHeSo2_1 = CASE WHEN DiemHeSo2_1 IS NULL OR DiemHeSo2_1 = '' THEN '" + txtDHS2_1.getText() + "' ELSE CONCAT(DiemHeSo2_1, '_" + txtDHS2_1.getText() + "') END, "
                        + "DiemHeSo2_2 = CASE WHEN DiemHeSo2_2 IS NULL OR DiemHeSo2_2 = '' THEN '" + txtDHS2_2.getText() + "' ELSE CONCAT(DiemHeSo2_2, '_" + txtDHS2_2.getText() + "') END, "
                        + "DiemThiCuoiKy = CASE WHEN DiemThiCuoiKy IS NULL OR DiemThiCuoiKy = '' THEN '" + txtDTCK.getText() + "' ELSE CONCAT(DiemThiCuoiKy, '_" + txtDTCK.getText() + "') END, "
                        + "DiemTongKet = CASE WHEN DiemTongKet IS NULL OR DiemTongKet = '' THEN '" + txtDTK.getText() + "' ELSE CONCAT(DiemTongKet, '_" + txtDTK.getText() + "') END, "
                        + "DiemTongKet_TD4 = CASE WHEN DiemTongKet_TD4 IS NULL OR DiemTongKet_TD4 = '' THEN '" + txtDTCK_TD4.getText() + "' ELSE CONCAT(DiemTongKet_TD4, '_" + txtDTCK_TD4.getText() + "') END, "
                        + "WHERE MaDiemHocPhan = '" + this.maDienHocPhan + "'";
                DataAccess.inSertEditDelete(sql);

                sql = "UPDATE lophocphan "
                        + "SET DanhSachSinhVien = "
                        + "CASE "
                        + "WHEN DanhSachSinhVien IS NULL OR DanhSachSinhVien = '' THEN '" + maSV + "' "
                        + "ELSE CONCAT(DanhSachSinhVien, '_" + maSV + "') "
                        + "END "
                        + "WHERE MaLopHocPhan = '" + this.maLopHocPhan + "'";
                DataAccess.inSertEditDelete(sql);

                sql = "UPDATE sinhvien "
                        + "SET MaLopHocPhan = "
                        + "CASE "
                        + "WHEN MaLopHocPhan IS NULL OR MaLopHocPhan = '' THEN '" + this.maLopHocPhan + "' "
                        + "ELSE CONCAT(MaLopHocPhan, '_" + this.maLopHocPhan + "') "
                        + "END "
                        + "WHERE MaSinhVien = '" + maSV + "'";
                DataAccess.inSertEditDelete(sql);

                HienThi_tb_diemhocphan();
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_diemhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void combTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTLActionPerformed
        // Improved loop using try-with-resources for automatic closing
        try {
            DefaultTableModel model = (DefaultTableModel) tb_diemlophocphan.getModel();
            int rowCount = model.getRowCount();

            StringBuilder maSinhVien = new StringBuilder();
            for (int i = 0; i < rowCount; i++) {
                String maSV = (String) model.getValueAt(i, 0);
                maSinhVien.append("'" + maSV + "'");
                if (i < rowCount - 1) {
                    maSinhVien.append(", ");
                }
            }

            String allStudentIDs = maSinhVien.toString();

            combTSV.removeAllItems();
            String sql_l = "SELECT TenSinhVien FROM sinhvien "
                    + "WHERE MaLop LIKE (SELECT MaLop FROM lop WHERE TenLop =  '" + combTL.getItemAt(combTL.getSelectedIndex()) + "')"
                    + "AND MaSinhVien NOT IN (" + allStudentIDs + ")";
            ResultSet rs = DataAccess.getResult(sql_l);
            while (rs.next()) {
                String TenSinhVien = rs.getString("TenSinhVien"); // Assuming the column name is "TenLHP"            
                combTSV.addItem(TenSinhVien);
            }
        } catch (SQLException e) {
            // Handle SQL exceptions appropriately (e.g., log the error, display a message to the user)
            System.err.println("Error retrieving data from database: " + e.getMessage());
        }
    }//GEN-LAST:event_combTLActionPerformed

    private void combTSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combTSVActionPerformed

    //JOptionPane.showMessageDialog(null, "maDienHocPhan = " + this.maDienHocPhan, "Notification", JOptionPane.INFORMATION_MESSAGE);
    private void Them_TenHP_vao_combTL() {

        // Improved loop using try-with-resources for automatic closing
        try {
            String sql_l = "SELECT TenLop FROM lop WHERE MaNganh = '" + this.maNganh + "'";
            ResultSet rs = DataAccess.getResult(sql_l);
            combTL.addItem("");
            while (rs.next()) {
                String TenLop = rs.getString("TenLop"); // Assuming the column name is "TenLHP"
                combTL.addItem(TenLop);
            }
        } catch (SQLException e) {
            // Handle SQL exceptions appropriately (e.g., log the error, display a message to the user)
            System.err.println("Error retrieving data from database: " + e.getMessage());
        }
    }

    private String getMaSV(String TenSV) throws SQLException {
        try {
            String sql_l = "SELECT MaSinhVien "
                    + "FROM sinhvien "
                    + "WHERE TenSinhVien = '" + TenSV + "' "
                    + "LIMIT 1;";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private String getDSSV() throws SQLException {
        try {
            String sql_l = "SELECT DanhSachSinhVien "
                    + "FROM sinhvien "
                    + "WHERE MaLopHocPhan = '" + this.maLopHocPhan + "' "
                    + "LIMIT 1;";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private void HienThi_tb_diemhocphan() {
        try {
            ResultSet rs = this.getdiemHP();
            DefaultTableModel dtm = (DefaultTableModel) tb_diemlophocphan.getModel();
            dtm.setRowCount(0);
            rs.next();

            if (rs.getString(1) != null) {
                String[] maSinhVien = rs.getString(1).split("_");
                String[] diemHeSo1_1 = rs.getString(2).split("_");
                String[] diemHeSo1_2 = rs.getString(3).split("_");
                String[] diemHeSo2_1 = rs.getString(4).split("_");
                String[] diemHeSo2_2 = rs.getString(5).split("_");
                String[] diemThiCuoiKy = rs.getString(6).split("_");
                String[] diemTongKet = rs.getString(7).split("_");
                String[] diemTongKet_TD4 = rs.getString(8).split("_");

                // lấy tên sinh viên
                String maSV = "'" + maSinhVien[0] + "'";
                for (int i = 1; i < maSinhVien.length; i++) {
                    maSV += ", '" + maSinhVien[i] + "'";
                }
                String sql_l = "SELECT TenSinhVien FROM sinhvien WHERE MaSinhVien IN (" + maSV + ")"; // Re-throw the SQLException for proper handling
                rs = DataAccess.getResult(sql_l);

                List<String> tensvList = new ArrayList<>();

                while (rs.next()) {
                    String tenSinhVien = rs.getString(1); // Assuming "tenSinhVien" is the column name for student names
                    tensvList.add(tenSinhVien);
                }

                // hiển thị sinh viên
                for (int i = 0; i < maSinhVien.length; i++) {
                    Object objlist[] = {
                        maSinhVien[i],
                        tensvList.get(i),
                        diemHeSo1_1[i],
                        diemHeSo1_2[i],
                        diemHeSo2_1[i],
                        diemHeSo2_2[i],
                        diemThiCuoiKy[i],
                        diemTongKet[i],
                        diemTongKet_TD4[i], //    rs.getString(9),
                    };
                    dtm.addRow(objlist);
                }
                tb_diemlophocphan.setModel(dtm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(form_ad_diemhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ResultSet getdiemHP() throws SQLException {
        String sql_l = "SELECT MaSinhVien, DiemHeSo1_1, DiemHeSo1_2, DiemHeSo2_1, DiemHeSo2_2, DiemThiCuoiKy, DiemTongKet, DiemTongKet_TD4 "
                + "FROM diemhocphan "
                + "WHERE MaDiemHocPhan = '" + this.maDienHocPhan + "'"; // Re-throw the SQLException for proper handling
        ResultSet rs = DataAccess.getResult(sql_l);
        return rs;
    }

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
            java.util.logging.Logger.getLogger(form_ad_diemhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ad_diemhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ad_diemhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ad_diemhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ad_diemhocphan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> combTL;
    private javax.swing.JComboBox<String> combTSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_diemlophocphan;
    private javax.swing.JTextField txtDHS1_1;
    private javax.swing.JTextField txtDHS1_2;
    private javax.swing.JTextField txtDHS2_1;
    private javax.swing.JTextField txtDHS2_2;
    private javax.swing.JTextField txtDTCK;
    private javax.swing.JTextField txtDTCK_TD4;
    private javax.swing.JTextField txtDTK;
    private javax.swing.JTextField txtTKT;
    // End of variables declaration//GEN-END:variables
}
