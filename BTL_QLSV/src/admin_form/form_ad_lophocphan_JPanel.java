/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin_form;

import data.DataAccess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Admin
 */
public class form_ad_lophocphan_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form form_ad_lophocphan_JPanel
     */
    public form_ad_lophocphan_JPanel() {
        initComponents();
        
        txtNamKyHoc.setEditable(false);
        
        Them_TenHP_vao_combTHP();
        HienThi_tb_lophocphan();
        
        
    }

    public void Reset() {
        txtTLHP.setText("");
        combTHP.setSelectedIndex(0);
        HienThi_tb_lophocphan();
    }
    
    
    private void HienThi_tb_lophocphan() {
        try {
            String sql_l = "SELECT lhp.MaLopHocPhan, lhp.TenLopHocPhan, hp.TenHocPhan, hp.NamKyHoc "
                    + "FROM lophocphan as lhp "
                    + "JOIN hocphan as hp on lhp.MaHocPhan = hp.MaHocPhan ";
            ResultSet rs = DataAccess.getResult(sql_l);
            DefaultTableModel dtm = (DefaultTableModel) tb_lophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    siSo(rs.getString(1)),
                    rs.getString(4)
                };
                dtm.addRow(objlist);
            }
            tb_lophocphan.setModel(dtm);

        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int siSo(String MaLopHocPhan) throws SQLException {
        String sql_l = "SELECT count(*) "
                    + "FROM dangkyhocphan "
                    + "WHERE MaLopHocPhan = '" + MaLopHocPhan + "' ";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getInt(1);
    }

    private void Them_TenHP_vao_combTHP() {

        // Improved loop using try-with-resources for automatic closing
        try {
            String sql_l = "SELECT TenHocPhan FROM hocphan";
            ResultSet rs = DataAccess.getResult(sql_l);
            while (rs.next()) {
                String TenHP = rs.getString("TenHocPhan"); // Assuming the column name is "TenLHP"
                combTHP.addItem(TenHP);
            }
        } catch (SQLException e) {
            // Handle SQL exceptions appropriately (e.g., log the error, display a message to the user)
            System.err.println("Error retrieving data from DataAccess: " + e.getMessage());
        }
    }

    private String getMaHP(String TenHP) throws SQLException {
        try {
            String sql_l = "SELECT MaHocPhan "
                    + "FROM hocphan "
                    + "WHERE TenHocPhan = '" + TenHP + "';";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private String getMaNganh() throws SQLException {
        try {
            int row = tb_lophocphan.getSelectedRow();

            String maLopHocPhan = tb_lophocphan.getValueAt(row, 0).toString();

            String sql_l = "SELECT hp.MaNganh "
                    + "FROM hocphan AS hp "
                    + "JOIN lophocphan AS lhp ON lhp.MaLopHocPhan = '" + maLopHocPhan + "' AND  lhp.MaHocPhan = hp.MaHocPhan "
                    + "LIMIT 1";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getString("MaNganh");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private void HienThiThongBao_Thieu(String txtCanhBao) {
        JOptionPane.showConfirmDialog(
                null, // Parent component
                txtCanhBao, // Message
                "Lỗi", // Title
                JOptionPane.OK_CANCEL_OPTION, // Option type
                JOptionPane.WARNING_MESSAGE // Message type
        );
    }

    private boolean Ktra_txt_comb() {
        if (tb_lophocphan.getSelectedRow() < 0) {
            String txtCanhBao = "Vui lòng chọn lớp học phần trong bảng !";
            HienThiThongBao_Thieu(txtCanhBao);
            return false;
        }
        
//        String str_Ktra = txtTLHP.getText();
//        if (str_Ktra.trim().equals("")) {
//            String txtCanhBao = "Vui lòng nhập lại tên lớp học phần!";
//            HienThiThongBao_Thieu(txtCanhBao);
//            txtTLHP.setText("");
//            txtTLHP.requestFocus();
//            return false;
//        }
//
//        str_Ktra = (String) combTHP.getSelectedItem();
//        if (str_Ktra.trim().equals("")) {
//            String txtCanhBao = "Vui lòng nhập lại tên học phần!";
//            HienThiThongBao_Thieu(txtCanhBao);
//            combTHP.requestFocus();
//            return false;
//        }
        return true;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        txtTKT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combTHP = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        txtTLHP = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lophocphan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNamKyHoc = new javax.swing.JTextField();

        jLabel3.setText("Tên học phần:");

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

        jLabel5.setText("Tìm kiếm (mã, tên):");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên lớp học phần:");

        combTHP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combTHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTHPActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnChiTiet.setText("Chi tiết");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        txtTLHP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tb_lophocphan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã lớp học phần", "Tên lớp học phần", "Tên học phần", "Sĩ số", "Năm Kỳ Học"
            }
        ));
        tb_lophocphan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_lophocphanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_lophocphan);

        jLabel4.setText("Năm Kỳ Học:");

        txtNamKyHoc.setBackground(new java.awt.Color(204, 204, 204));
        txtNamKyHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTKT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combTHP, javax.swing.GroupLayout.Alignment.TRAILING, 0, 319, Short.MAX_VALUE)
                            .addComponent(txtTLHP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamKyHoc))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChiTiet)
                            .addComponent(btnReset))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnChiTiet))
                        .addGap(20, 20, 20)
                        .addComponent(btnSua))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTLHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combTHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXoa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNamKyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnReset))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            // TODO add your handling code here:
            //            String sql_l = "SELECT lhp.MaLopHocPhan, lhp.TenLopHocPhan, hp.TenHocPhan, lhp.SiSo, lhp.DanhSachSinhVien "
            //                    + "FROM lophocphan as lhp "
            //                    + "JOIN hocphan as hp on lhp.MaHocPhan = hp.MaHocPhan "
            //                    + "WHERE INSTR(lhp.MaLopHocPhan, '" + txtTKT.getText() + "') > 0 OR "
            //                    + "INSTR(lhp.TenLopHocPhan, '" + txtTKT.getText() + "') > 0 OR "
            //                    + "INSTR(lhp.MaHocPhan, '" + txtTKT.getText() + "') > 0 OR "
            //                    + "INSTR(lhp.MaDiemHocPhan, '" + txtTKT.getText() + "') > 0 OR "
            //                    + "INSTR(lhp.SiSo, '" + txtTKT.getText() + "') > 0 OR "
            //                    + "INSTR(lhp.DanhSachSinhVien, '" + txtTKT.getText() + "') > 0";

            String sql_l = "SELECT lhp.MaLopHocPhan, lhp.TenLopHocPhan, hp.TenHocPhan "
            + "FROM lophocphan as lhp "
            + "JOIN hocphan as hp on lhp.MaHocPhan = hp.MaHocPhan "
            + "WHERE INSTR(lhp.MaLopHocPhan, '" + txtTKT.getText() + "') > 0 OR "
            + "INSTR(lhp.TenLopHocPhan, '" + txtTKT.getText() + "') > 0";
            ResultSet rs = DataAccess.getResult(sql_l);
            DefaultTableModel dtm = (DefaultTableModel) tb_lophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    siSo(rs.getString(1))
                };
                dtm.addRow(objlist);
            }
            tb_lophocphan.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            String tenLopHocPhan = txtTLHP.getText();
            String maHocPhan = this.getMaHP(combTHP.getSelectedItem().toString());

            String sql_l = "SELECT Count(*) FROM lophocphan";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            int MaLopHocPhan = rs.getInt(1) + 1;

            String MaLHP = "";
            if (MaLopHocPhan < 10) {
                MaLHP = "0" + MaLopHocPhan;
            }
            else
            MaLHP += MaLopHocPhan;

            sql_l = "INSERT INTO lophocphan (MaLopHocPhan, TenLopHocPhan, MaHocPhan) "
            + "VALUES ('LHP" + MaLHP + "', '" + tenLopHocPhan + "', '" + maHocPhan + "')";
            // stm = kn.createStatement();
            DataAccess.inSertEditDelete(sql_l);
            HienThi_tb_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            if (!Ktra_txt_comb()) {
                return;
            }
            int row = tb_lophocphan.getSelectedRow();
            String maLopHocPhan = (String) tb_lophocphan.getValueAt(row, 0);

            String tenLopHocPhan = txtTLHP.getText(); // Get text from txtTLHP
            String maHocPhan = this.getMaHP(combTHP.getSelectedItem().toString());

            String sql_l = "UPDATE lophocphan "
            + "SET TenLopHocPhan = '" + tenLopHocPhan + "', "
            + "MaHocPhan = '" + maHocPhan + "' "
            + "WHERE MaLopHocPhan = '" + maLopHocPhan + "' ";
            // stm = kn.createStatement();
            DataAccess.inSertEditDelete(sql_l);
            HienThi_tb_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            // TODO add your handling code here:
            if (!Ktra_txt_comb()) {
                return;
            }
            int row = tb_lophocphan.getSelectedRow();
            String maLopHocPhan = (String) tb_lophocphan.getValueAt(row, 0);

            String sql_l = "DELETE FROM lophocphan WHERE MaLopHocPhan = '" + maLopHocPhan + "' ";
            DataAccess.inSertEditDelete(sql_l);

            HienThi_tb_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        try {
            // TODO add your handling code here:
            if (!Ktra_txt_comb()) {
                return;
            }
            int row = tb_lophocphan.getSelectedRow();
            String maLopHocPhan = (String) tb_lophocphan.getValueAt(row, 0);

            String maNganh = this.getMaNganh();
            form_ad_dangkyhocphan dhp = new form_ad_dangkyhocphan(maNganh, maLopHocPhan, this);
            // this.setVisible(false);
            dhp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tb_lophocphanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_lophocphanMouseClicked
        int row = tb_lophocphan.getSelectedRow();

        txtTLHP.setText((String) tb_lophocphan.getValueAt(row, 1));
        combTHP.setSelectedItem(tb_lophocphan.getValueAt(row, 2));
    }//GEN-LAST:event_tb_lophocphanMouseClicked

    private void combTHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTHPActionPerformed
        try {
            // TODO add your handling code here:
            this.txtTLHP.setText(this.combTHP.getSelectedItem().toString());
            
            String sql_l = "SELECT NamKyHoc "
                    + "FROM hocphan "
                    + "WHERE TenHocPhan = '" + this.combTHP.getSelectedItem().toString() + "' ";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            this.txtNamKyHoc.setText(rs.getString(1).toString());
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combTHPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> combTHP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_lophocphan;
    private javax.swing.JTextField txtNamKyHoc;
    private javax.swing.JTextField txtTKT;
    private javax.swing.JTextField txtTLHP;
    // End of variables declaration//GEN-END:variables
}
