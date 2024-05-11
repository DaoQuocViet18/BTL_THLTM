/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_qlsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class KetNoi {
    public static Connection KNCSDL() throws SQLException
    {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/th_ltm_qlsv","root","");
        return c;
    }
}
