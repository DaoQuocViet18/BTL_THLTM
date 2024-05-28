/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlsv;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class form_ad_dangkyhocphan extends javax.swing.JFrame {

    form_ad_lophocphan_JPanel ad_LHP;
    String maLopHocPhan;
    String maNganh;

    /**
     * Creates new form form_ad_diemhocphan
     *
     * @param maNganh
     * @param maLopHocPhan
     * @param ad_LHP
     */
    public form_ad_dangkyhocphan(String maNganh, String maLopHocPhan, form_ad_lophocphan_JPanel ad_LHP) {
        initComponents();
        this.maLopHocPhan = maLopHocPhan;
        this.maNganh = maNganh;
        this.ad_LHP = ad_LHP;

        txtMDKHP.setEditable(false);
        txtDTK.setEditable(false);
        txtDTCK_TD4.setEditable(false);
        Them_TenL_vao_combTL();
        HienThi_tb_diemhocphan();

        // JOptionPane.showMessageDialog(null, "maDienHocPhan = " + this.maDienHocPhan, "Notification", JOptionPane.INFORMATION_MESSAGE);
    }

    private form_ad_dangkyhocphan() {
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
        tb_dangkylophocphan = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combTL = new javax.swing.JComboBox<>();
        combTSV = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMDKHP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Điểm hệ số 1 - 2:");

        jLabel4.setText("Điểm hệ số 2 - 1:");

        jLabel6.setText("Điểm hệ số 2 - 2:");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm  (mã, tên):");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên sinh viên:");

        jLabel3.setText("Điểm hệ số 1 - 1:");

        jLabel7.setText("Điểm thi cuối kỳ:");

        txtDTK.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setText("Điểm tổng kết:");

        txtDTCK_TD4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Điểm tổng kết - thang điểm 4:");

        tb_dangkylophocphan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã DKHP", "Mã SV", "Tên SV", "Điểm hs 1-1", "Điểm hs 1-2", "Điểm hs 2-1", "Điểm hs 2-2", "Điểm thi CKỳ", "Điểm TK", "Thang điểm 4", "Điểm chữ"
            }
        ));
        tb_dangkylophocphan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dangkylophocphanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_dangkylophocphan);

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

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel11.setText("Mã DKHP");

        txtMDKHP.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDHS1_1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtDHS1_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDHS2_1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtDHS2_2))
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(combTL, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDTCK, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDTK, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtMDKHP, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTKT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDTCK_TD4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                                        .addGap(52, 52, 52)
                                        .addComponent(btnTimKiem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnThem)
                            .addComponent(btnThoat))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMDKHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDHS1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDHS2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDHS1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDHS2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(combTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(20, 20, 20)
                        .addComponent(btnSua)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoa)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(jLabel7)
                            .addComponent(txtDTCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThoat)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDTK))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDTCK_TD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ad_LHP.Reset();
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            String tenSV = combTSV.getItemAt(combTSV.getSelectedIndex());
            String maSV = this.getMaSV(tenSV);

            String sql = "SELECT Count(*) FROM dangkyhocphan";
            ResultSet rs = DataAccess.getResult(sql);
            rs.next();
            int MaDangKyHocPhan = rs.getInt(1) + 1;

            String MaDKHP = "";
            if (MaDangKyHocPhan < 10) {
                MaDKHP = "0" + MaDangKyHocPhan;
            }
            else
                MaDKHP += MaDangKyHocPhan;
            
            
            sql = "INSERT INTO `dangkyhocphan`(`MaDangKyHocPhan`, `MaSinhVien`, `MaLopHocPhan`, `DiemHeSo1_1`, `DiemHeSo1_2`, `DiemHeSo2_1`, `DiemHeSo2_2`, `DiemThiCuoiKy`, `DiemTongKet`, `DiemTongKet_TD4`) "
                    + "VALUES "
                    + "('DKHP" + MaDKHP + "', "
                    + "'" + maSV + "', "
                    + "'" + this.maLopHocPhan + "', "
                    + "CASE WHEN " + this.txtDHS1_1.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS1_1.getText() + "' ELSE NULL END, "
                    + "CASE WHEN " + this.txtDHS1_2.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS1_2.getText() + "' ELSE NULL END, "
                    + "CASE WHEN " + this.txtDHS2_1.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS2_1.getText() + "' ELSE NULL END, "
                    + "CASE WHEN " + this.txtDHS2_2.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS2_2.getText() + "' ELSE NULL END, "
                    + "CASE WHEN " + this.txtDTCK.getText().trim().isEmpty() + " IS false THEN '" + this.txtDTCK.getText() + "' ELSE NULL END, "
                    + "CASE WHEN " + ktra_diemTK() + " IS true THEN '" + getdiemTK() + "' ELSE NULL END, "
                    + "CASE WHEN " + ktra_diemTK() + " IS true THEN '" + getdiemTK_TD4(getdiemTK()) + "' ELSE NULL END  )";
            DataAccess.inSertEditDelete(sql);

            HienThi_tb_diemhocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void combTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTLActionPerformed
        // Improved loop using try-with-resources for automatic closing
        resetTenSV_chuaDK();
    }//GEN-LAST:event_combTLActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (tb_dangkylophocphan.getValueAt(0, 0) != null) {
            try {
                String tenSV = combTSV.getItemAt(combTSV.getSelectedIndex());
                String maSV = this.getMaSV(tenSV);



                String sql = "UPDATE dangkyhocphan SET "
                        + "MaSinhVien = '" + maSV + "', "
                        + "DiemHeSo1_1 = CASE WHEN " + this.txtDHS1_1.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS1_1.getText() + "' ELSE NULL END, "
                        + "DiemHeSo1_2 = CASE WHEN " + this.txtDHS1_2.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS1_2.getText() + "' ELSE NULL END, "
                        + "DiemHeSo2_1 = CASE WHEN " + this.txtDHS2_1.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS2_1.getText() + "' ELSE NULL END, "
                        + "DiemHeSo2_2 = CASE WHEN " + this.txtDHS2_2.getText().trim().isEmpty() + " IS false THEN '" + this.txtDHS2_2.getText() + "' ELSE NULL END, "
                        + "DiemThiCuoiKy = CASE WHEN " + this.txtDTCK.getText().trim().isEmpty() + " IS false THEN '" + this.txtDTCK.getText() + "' ELSE NULL END, "
                        + "DiemTongKet = CASE WHEN " + ktra_diemTK() + " IS true THEN '" + getdiemTK() + "' ELSE NULL END, "
                        + "DiemTongKet_TD4 = CASE WHEN " + ktra_diemTK() + " IS true THEN '" + getdiemTK_TD4(getdiemTK()) + "' ELSE NULL END "
                        + "WHERE MaDangKyHocPhan = '" + txtMDKHP.getText() + "'";
                DataAccess.inSertEditDelete(sql);

                HienThi_tb_diemhocphan();
            } catch (SQLException ex) {
                Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tb_dangkylophocphanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dangkylophocphanMouseClicked
        try {
            // TODO add your handling code here:
            String MaSV = (String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 1);
            String sql_l = "SELECT l.TenLop "
                    + "FROM lop AS l "
                    + "JOIN sinhvien as sv ON sv.MaLop = l.MaLop AND sv.MaSinhVien = '" + MaSV + "' "
                    + "LIMIT 1";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();

            txtMDKHP.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 0));
            combTL.setSelectedItem(rs.getString(1));
//            combTSV.removeAllItems();
//            combTSV.addItem((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 1));
            combTSV.setSelectedItem(tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 2));
            txtDHS1_1.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 3));
            txtDHS1_2.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 4));
            txtDHS2_1.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 5));
            txtDHS2_2.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 6));
            txtDTCK.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 7));
            txtDTK.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 8));
            txtDTCK_TD4.setText((String) tb_dangkylophocphan.getValueAt(tb_dangkylophocphan.getSelectedRow(), 9));

        } catch (SQLException ex) {
            Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tb_dangkylophocphanMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetTenSV_chuaDK();
        txtMDKHP.setText("");
        combTL.setSelectedIndex(0);
        txtDHS1_1.setText("");
        txtDHS1_2.setText("");
        txtDHS2_1.setText("");
        txtDHS2_2.setText("");
        txtDTCK.setText("");
        txtDTK.setText("");
        txtDTCK_TD4.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (tb_dangkylophocphan.getValueAt(0, 0) != null) {
            try {
                String sql = "DELETE FROM dangkyhocphan "
                        + "WHERE MaDangKyHocPhan = '" + txtMDKHP.getText() + "'";
                DataAccess.inSertEditDelete(sql);

                HienThi_tb_diemhocphan();
            } catch (SQLException ex) {
                Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            // TODO add your handling code here:
            String sql_l = "SELECT dkhp.MaDangKyHocPhan, dkhp.MaSinhVien, sv.TenSinhVien, dkhp.DiemHeSo1_1, dkhp.DiemHeSo1_2, dkhp.DiemHeSo2_1, dkhp.DiemHeSo2_2, dkhp.DiemThiCuoiKy, dkhp.DiemTongKet, dkhp.DiemTongKet_TD4 "
                    + "FROM dangkyhocphan AS dkhp "
                    + "JOIN sinhvien AS sv ON sv.MaSinhVien = dkhp.MaSinhVien "
                    + "WHERE dkhp.MaLopHocPhan = '" + this.maLopHocPhan + "' AND ("
                    + "INSTR(dkhp.MaDangKyHocPhan, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(dkhp.MaSinhVien, '" + txtTKT.getText() + "') > 0  OR "
                    + "INSTR(sv.TenSinhVien, '" + txtTKT.getText() + "') > 0)";
            
            ResultSet rs = DataAccess.getResult(sql_l);
            DefaultTableModel dtm = (DefaultTableModel) this.tb_dangkylophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1) != null ? rs.getString(1) : " ",
                    rs.getString(2) != null ? rs.getString(2) : " ",
                    rs.getString(3) != null ? rs.getString(3) : " ",
                    rs.getString(4) != null ? rs.getString(4) : " ",
                    rs.getString(5) != null ? rs.getString(5) : " ",
                    rs.getString(6) != null ? rs.getString(6) : " ",
                    rs.getString(7) != null ? rs.getString(7) : " ",
                    rs.getString(8) != null ? rs.getString(8) : " ",
                    rs.getString(9) != null ? rs.getString(9) : " ",
                    rs.getString(10) != null ? rs.getString(10) : " ",
                    rs.getString(10) != null ? getTDChu(rs.getString(10)) : " "
                };
                dtm.addRow(objlist);
            }
            this.tb_dangkylophocphan.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    //JOptionPane.showMessageDialog(null, "maDienHocPhan = " + this.maDienHocPhan, "Notification", JOptionPane.INFORMATION_MESSAGE);
    private void Them_TenL_vao_combTL() {

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
            System.err.println("Error retrieving data from DataAccess: " + e.getMessage());
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
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private boolean ktra_diemTK() {
        if (this.txtDHS1_1.getText().trim().isEmpty()
                || this.txtDHS1_2.getText().trim().isEmpty()
                || this.txtDHS2_1.getText().trim().isEmpty()
                || this.txtDHS2_2.getText().trim().isEmpty()
                || this.txtDTCK.getText().trim().isEmpty()) {
            return false;
        }
        return true;
    }

    private float getdiemTK() {

        if (!ktra_diemTK()) {
            return 0;
        }
        float d1_1 = Float.parseFloat(txtDHS1_1.getText());
        float d1_2 = Float.parseFloat(txtDHS1_2.getText());
        float d2_1 = Float.parseFloat(txtDHS2_1.getText());
        float d2_2 = Float.parseFloat(txtDHS2_2.getText());
        float dCK = Float.parseFloat(txtDTCK.getText());

        float diemTK = (d1_1 + d1_2 + (2 * d2_1) + (2 * d2_2) + (3 * dCK)) / 9;
//        System.out.println("diemTK = " + diemTK);
        return diemTK;
    }

    private float getdiemTK_TD4(float diemTK) {
        if (!ktra_diemTK()) {
            return 0;
        }

        if (diemTK >= 8.5 && diemTK <= 10.0) {
            return 4;
        } else if (diemTK >= 7.8 && diemTK < 8.4) {
            return 3.5f;
        } else if (diemTK >= 7.0 && diemTK < 7.7) {
            return 3;
        } else if (diemTK >= 6.3 && diemTK < 6.9) {
            return 2.5f;
        } else if (diemTK >= 5.5 && diemTK < 6.2) {
            return 2;
        } else if (diemTK >= 4.8 && diemTK < 5.4) {
            return 2;
        } else if (diemTK >= 4.0 && diemTK < 5.7) {
            return 1.5f;
        } else if (diemTK >= 3.0 && diemTK < 3.9) {
            return 1;
        } else {
            return 0;
        }
    }

    private void HienThi_tb_diemhocphan() {
        try {
            String sql_l = "SELECT dkhp.MaDangKyHocPhan, dkhp.MaSinhVien, sv.TenSinhVien, dkhp.DiemHeSo1_1, dkhp.DiemHeSo1_2, dkhp.DiemHeSo2_1, dkhp.DiemHeSo2_2, dkhp.DiemThiCuoiKy, dkhp.DiemTongKet, dkhp.DiemTongKet_TD4 "
                    + "FROM dangkyhocphan AS dkhp "
                    + "JOIN sinhvien AS sv ON sv.MaSinhVien = dkhp.MaSinhVien "
                    + "WHERE dkhp.MaLopHocPhan = '" + this.maLopHocPhan + "'"; // Re-throw the SQLException for proper handling
            ResultSet rs = DataAccess.getResult(sql_l);
            DefaultTableModel dtm = (DefaultTableModel) tb_dangkylophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1) != null ? rs.getString(1) : " ",
                    rs.getString(2) != null ? rs.getString(2) : " ",
                    rs.getString(3) != null ? rs.getString(3) : " ",
                    rs.getString(4) != null ? rs.getString(4) : " ",
                    rs.getString(5) != null ? rs.getString(5) : " ",
                    rs.getString(6) != null ? rs.getString(6) : " ",
                    rs.getString(7) != null ? rs.getString(7) : " ",
                    rs.getString(8) != null ? rs.getString(8) : " ",
                    rs.getString(9) != null ? rs.getString(9) : " ",
                    rs.getString(10) != null ? rs.getString(10) : " ",
                    rs.getString(10) != null ? getTDChu(rs.getString(10)) : " "
                };
                dtm.addRow(objlist);
            }
            tb_dangkylophocphan.setModel(dtm);

        } catch (SQLException ex) {
            Logger.getLogger(form_ad_dangkyhocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getTDChu(String TKSo) {

        if (TKSo.trim().isEmpty()) {
            return " ";
        }

        float tkSo = Float.parseFloat(TKSo.trim());
        if (tkSo == 0) {
            return "F";
        } else if (tkSo == 0.5) {
            return "F+";
        } else if (tkSo == 1) {
            return "D";
        } else if (tkSo == 1.5) {
            return "D+";
        } else if (tkSo == 2) {
            return "C";
        } else if (tkSo == 2.5) {
            return "C+";
        } else if (tkSo == 3) {
            return "B";
        } else if (tkSo == 3.5) {
            return "B+";
        } else if (tkSo == 4) {
            return "A";
        } else {
            return null;
        }
    }

    private void resetTenSV_chuaDK() {
        try {
            DefaultTableModel model = (DefaultTableModel) tb_dangkylophocphan.getModel();
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
            java.util.logging.Logger.getLogger(form_ad_dangkyhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ad_dangkyhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ad_dangkyhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ad_dangkyhocphan.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ad_dangkyhocphan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> combTL;
    private javax.swing.JComboBox<String> combTSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_dangkylophocphan;
    private javax.swing.JTextField txtDHS1_1;
    private javax.swing.JTextField txtDHS1_2;
    private javax.swing.JTextField txtDHS2_1;
    private javax.swing.JTextField txtDHS2_2;
    private javax.swing.JTextField txtDTCK;
    private javax.swing.JTextField txtDTCK_TD4;
    private javax.swing.JTextField txtDTK;
    private javax.swing.JTextField txtMDKHP;
    private javax.swing.JTextField txtTKT;
    // End of variables declaration//GEN-END:variables
}
