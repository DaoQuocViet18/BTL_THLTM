/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlsv;

import btl_qlsv.Database_ad.DataAccess;
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
public class form_ad_lophocphan extends javax.swing.JFrame {

    /**
     * Creates new form form_ad_lophocphan
     */
    public form_ad_lophocphan() {
        initComponents();

        Them_TenHP_vao_combTHP();
        HienThi_tb_lophocphan();
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
        btnXoa = new javax.swing.JButton();
        txtTLHP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lophocphan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        txtTKT = new javax.swing.JTextField();
        combTHP = new javax.swing.JComboBox<>();
        btnThemSV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMLHP1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tên lớp học phần:");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtTLHP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tb_lophocphan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã lớp học phần", "Tên lớp học phần", "Tên học phần", "Sĩ số", "Danh sách SV"
            }
        ));
        tb_lophocphan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_lophocphanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_lophocphan);

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

        jLabel5.setText("Tìm kiếm theo:");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        combTHP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnThemSV.setText("Thêm SV");
        btnThemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSVActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã lớp học phần:");

        txtMLHP1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combTHP, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(41, 41, 41)
                                    .addComponent(txtTLHP, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addComponent(txtMLHP1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnThemSV)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnThemSV)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMLHP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTLHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combTHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_lophocphanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_lophocphanMouseClicked
        int row = tb_lophocphan.getSelectedRow();

        txtTLHP.setText((String) tb_lophocphan.getValueAt(row, 1));
        combTHP.setSelectedItem(tb_lophocphan.getValueAt(row, 2));
    }//GEN-LAST:event_tb_lophocphanMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            if (!Ktra_txt_comb()) {
                return;
            }
            String tenLopHocPhan = txtTLHP.getText(); // Get text from txtTLHP
            int maHocPhan = this.getMaHP(combTHP.getSelectedItem().toString());

            String sql_l = "INSERT INTO diemhocphan() VALUES ()";
            DataAccess.inSertEditDelete(sql_l);

            sql_l = "SELECT MaDiemHocPhan "
                    + "FROM diemhocphan "
                    + "ORDER BY MaDiemHocPhan DESC "
                    + "LIMIT 1";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            int MaDiemHocPhan = rs.getInt(1);

            sql_l = "INSERT INTO lophocphan (TenLopHocPhan, MaHocPhan, MaDiemHocPhan) "
                    + "VALUES ('" + tenLopHocPhan + "'," + maHocPhan + "," + MaDiemHocPhan + ")";
            // stm = kn.createStatement();
            DataAccess.inSertEditDelete(sql_l);

            Reset_page_form_ad_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:                 
            if (!Ktra_txt_comb()) {
                return;
            }
            int row = tb_lophocphan.getSelectedRow();
            int maLopHocPhan = Integer.parseInt((String) tb_lophocphan.getValueAt(row, 0));

            String tenLopHocPhan = txtTLHP.getText(); // Get text from txtTLHP
            int maHocPhan = this.getMaHP(combTHP.getSelectedItem().toString());

            String sql_l = "UPDATE lophocphan "
                    + "SET TenLopHocPhan = '" + tenLopHocPhan + "', "
                    + "MaHocPhan = " + maHocPhan + " "
                    + "WHERE MaLopHocPhan = " + maLopHocPhan + " ";
            // stm = kn.createStatement();
            DataAccess.inSertEditDelete(sql_l);

            Reset_page_form_ad_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            // TODO add your handling code here:
            if (!Ktra_txt_comb()) {
                return;
            }
            int row = tb_lophocphan.getSelectedRow();
            int maLopHocPhan = Integer.parseInt((String) tb_lophocphan.getValueAt(row, 0));

            String sql_l = "DELETE FROM lophocphan WHERE MaLopHocPhan = " + maLopHocPhan + " ";
            DataAccess.inSertEditDelete(sql_l);
            int maDiemHocPhan = this.getMaDHP();
            
            sql_l = "DELETE FROM lophocphan WHERE MaLopHocPhan = " + maLopHocPhan + " ";
            DataAccess.inSertEditDelete(sql_l);
            
            sql_l = "DELETE FROM diemhocphan WHERE MaDiemHocPhan = " + maDiemHocPhan + " ";
            DataAccess.inSertEditDelete(sql_l);

            Reset_page_form_ad_lophocphan();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            // TODO add your handling code here:
            String sql_l = "SELECT lhp.MaLopHocPhan, lhp.TenLopHocPhan, hp.TenHocPhan, lhp.SiSo, lhp.DanhSachSinhVien "
                    + "FROM lophocphan as lhp "
                    + "JOIN hocphan as hp on lhp.MaHocPhan = hp.MaHocPhan "
                    + "WHERE INSTR(lhp.MaLopHocPhan, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(lhp.TenLopHocPhan, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(lhp.MaHocPhan, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(lhp.MaDiemHocPhan, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(lhp.SiSo, '" + txtTKT.getText() + "') > 0 OR "
                    + "INSTR(lhp.DanhSachSinhVien, '" + txtTKT.getText() + "') > 0";
            ResultSet rs = DataAccess.getResult(sql_l);
            DefaultTableModel dtm = (DefaultTableModel) tb_lophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                };
                dtm.addRow(objlist);
            }
            tb_lophocphan.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSVActionPerformed
        try {
            // TODO add your handling code here:
            int maDiemHocPhan = this.getMaDHP();
            form_ad_diemhocphan dhp = new form_ad_diemhocphan(maDiemHocPhan);
            dhp.setVisible(true);
            dhp.hienThi_maDHP();
        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemSVActionPerformed

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
            java.util.logging.Logger.getLogger(form_ad_lophocphan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ad_lophocphan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ad_lophocphan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ad_lophocphan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ad_lophocphan().setVisible(true);
            }
        });
    }

    private void Reset_page_form_ad_lophocphan() {
        txtTLHP.setText("");
        combTHP.setSelectedIndex(0);
        HienThi_tb_lophocphan();
    }

    private void HienThi_tb_lophocphan() {
        try {
            ResultSet rs = this.getLopHP();
            DefaultTableModel dtm = (DefaultTableModel) tb_lophocphan.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object objlist[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                };
                dtm.addRow(objlist);
            }
            tb_lophocphan.setModel(dtm);

        } catch (SQLException ex) {
            Logger.getLogger(form_ad_lophocphan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Them_TenHP_vao_combTHP() {

        // Improved loop using try-with-resources for automatic closing
        try {
            ResultSet rs = this.getTenLHP();
            while (rs.next()) {
                String TenHP = rs.getString("TenHocPhan"); // Assuming the column name is "TenLHP"
                combTHP.addItem(TenHP);
            }
        } catch (SQLException e) {
            // Handle SQL exceptions appropriately (e.g., log the error, display a message to the user)
            System.err.println("Error retrieving data from database: " + e.getMessage());
        }
    }

    private ResultSet getTenLHP() throws SQLException {
        try {
            String sql_l = "SELECT TenHocPhan FROM hocphan";
            ResultSet rs = DataAccess.getResult(sql_l);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    public ResultSet getLopHP() throws SQLException {
        try {
            String sql_l = "SELECT lhp.MaLopHocPhan, lhp.TenLopHocPhan, hp.TenHocPhan, lhp.SiSo, lhp.DanhSachSinhVien "
                    + "FROM lophocphan as lhp "
                    + "JOIN hocphan as hp on lhp.MaHocPhan = hp.MaHocPhan ";
            ResultSet rs = DataAccess.getResult(sql_l);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }

    private int getMaHP(String TenHP) throws SQLException {
        try {
            String sql_l = "SELECT MaHocPhan "
                    + "FROM hocphan "
                    + "WHERE TenHocPhan = '" + TenHP + "';";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            int kq = Integer.parseInt(rs.getString(1));
            return kq;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }
    
    private int getMaDHP() throws SQLException {
        try {
            int row = tb_lophocphan.getSelectedRow();

            String maLopHocPhan = tb_lophocphan.getValueAt(row, 0).toString();

            String sql_l = "SELECT MaDiemHocPhan "
                    + "FROM lophocphan "
                    + "WHERE MaLopHocPhan = " + maLopHocPhan + " "
                    + "LIMIT 1";
            ResultSet rs = DataAccess.getResult(sql_l);
            rs.next();
            return rs.getInt("MaDiemHocPhan");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
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
        String str_Ktra = txtTLHP.getText();
        if (str_Ktra.trim().equals("")) {
            String txtCanhBao = "Vui lòng nhập lại tên lớp học phần!";
            HienThiThongBao_Thieu(txtCanhBao);
            txtTLHP.setText("");
            txtTLHP.requestFocus();
            return false;
        }

        str_Ktra = (String) combTHP.getSelectedItem();
        if (str_Ktra.trim().equals("")) {
            String txtCanhBao = "Vui lòng nhập lại tên học phần!";
            HienThiThongBao_Thieu(txtCanhBao);
            combTHP.requestFocus();
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemSV;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> combTHP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_lophocphan;
    private javax.swing.JTextField txtMLHP1;
    private javax.swing.JTextField txtTKT;
    private javax.swing.JTextField txtTLHP;
    // End of variables declaration//GEN-END:variables
}
