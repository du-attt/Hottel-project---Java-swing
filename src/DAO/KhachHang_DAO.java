/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.JDBCUtil;
import Model.KhachHang;
//import com.mysql.cj.xdevapi.PreparableStatement;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class KhachHang_DAO implements DAOInterface<KhachHang>{
    public static KhachHang_DAO getInstance(){
        return new KhachHang_DAO();
    }
    @Override
    public int insert(KhachHang t) {
        try {
            // Tạo kết nối SQL
            Connection con = JDBCUtil.getConnection();
            // Tạo câu lệnh SQL
            String sql = "INSERT INTO khach_hang VALUES (?,?,?,?,?)";
            // Tạo đối tượng Statement
            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
            pst.setString(1, t.getMaKH());
            pst.setString(2, t.getTenKH());
            pst.setString(3, t.getCCCD());
            pst.setString(4, t.getGioiTinh());
            pst.setString(5, t.getSDT());
            
            pst.executeUpdate();  
            // Ngắt kết nối
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(KhachHang t) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM khach_hang WHERE MaKH = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaKH());
//            ResultSet rs = pst.executeQuery();
            pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        ArrayList<KhachHang> List = new ArrayList<KhachHang>();
        try {
            // Tạo kết nối SQL
            Connection con = JDBCUtil.getConnection();
            // Tạo câu lệnh SQL
            String sql = "SELECT * FROM khach_hang";
            // Tạo đối tượng Statement
//            PreparedStatement pst = con.prepareStatement(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String MaKH = rs.getString("MaKH");
                String TenKH = rs.getString("TenKH");
                String CCCD = rs.getString("CCCD");
                String GioiTinh = rs.getString("GioiTinh");
                String SDT = rs.getString("SDT");
                KhachHang khachhang = new KhachHang(MaKH, TenKH, CCCD, GioiTinh, SDT);
                List.add(khachhang);
            }
            // Ngắt kết nối
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }

    @Override
    public KhachHang selectById(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
