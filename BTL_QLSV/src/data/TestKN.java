package data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Admin
 */
public class TestKN {
    public static void main(String[] args) throws SQLException {
        Connection kn = KetNoi.KNCSDL();
        if (kn==null) 
            System.out.println("kết nối thất bại");       
        else 
            System.out.println("kết nối thành công");
    }
}
