/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_qlsv;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Database {

    public ResultSet getResult(String sql_l) throws SQLException {
        try {
            // TODO add your handling code here:
            Connection kn = KetNoi.KNCSDL();
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery(sql_l);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }
    
    public void inSertEditDelete(String sql_l) throws SQLException {
        try {
            // TODO add your handling code here:
            Connection kn = KetNoi.KNCSDL();
            Statement stm = kn.createStatement();
            stm.executeUpdate(sql_l);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;  // Re-throw the SQLException for proper handling
        }
    }    
}
