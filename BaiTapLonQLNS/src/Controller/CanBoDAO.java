/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CanBo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CanBoDAO {

    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public CanBoDAO() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Tutorial;"
                    + "username=sa;password=phanphuc1209");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void loadData(String sql, JTable tb1) {
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            tb1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet showTextField(String sql) {
        try {
            ps = conn.prepareStatement(sql);
            return ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean themCanBo(CanBo cb) {
        try {
            String sql = "INSERT INTO  dbo.tblcanbo(macb,tencb,ngaysinh,gioitinh,quequan,quoctich,"
                    + "dantoc,trinhdo,chuyennganh,email,sodt,kiluat,thuongtru,tamtru,giadinhcs,"
                    + "socmt,noicapcmt,ngaycapcmt,maluong,makhenthuong,macvpb)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cb.getMacb());
            ps.setString(2, cb.getTencb());
            ps.setDate(3, new java.sql.Date(cb.getNgaysinh().getTime()));
            ps.setString(4, cb.getGioitinh());
            ps.setString(5, cb.getQuequan());
            ps.setString(6, cb.getQuoctich());
            ps.setString(7, cb.getDantoc());
            ps.setString(8, cb.getTrinhdo());
            ps.setString(9, cb.getChuyennganh());
            ps.setString(10, cb.getEmail());
            ps.setString(11, cb.getSodt());
            ps.setString(12, cb.getKyluat());
            ps.setString(13, cb.getThuongtru());
            ps.setString(14, cb.getTamtru());
            ps.setString(15, cb.getGiadinhchinhsach());
            ps.setString(16, cb.getSocmt());
            ps.setString(17, cb.getNoicapcmt());
            ps.setDate(18, new java.sql.Date(cb.getNgayscapcmt().getTime()));
            ps.setString(19, cb.getMaluong());
            ps.setString(20, cb.getMakt());
            ps.setString(21, cb.getMacbpb());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaCanBo(String ma, CanBo cb) {
        try {
            String sql = "update dbo.tblcanbo "
                    + "set macb = ?,"
                    + "tencb = ?,"
                    + "ngaysinh = ?,"
                    + "gioitinh = ?,"
                    + "quequan = ?,"
                    + "quoctich = ?,"
                    + "dantoc = ?,"
                    + "trinhdo = ?,"
                    + "chuyennganh = ?,"
                    + "email = ?,"
                    + "sodt = ?,"
                    + "kiluat = ?,"
                    + "thuongtru = ?,"
                    + "tamtru = ?,"
                    + "giadinhcs = ?,"
                    + "socmt = ?,"
                    + "noicapcmt = ?,"
                    + "ngaycapcmt = ?,"
                    + "maluong = ?,"
                    + "makhenthuong = ?,"
                    + "macvpb = ? "
                    + "where macb = '" + ma + "'";

            ps = conn.prepareStatement(sql);
            ps.setString(1, cb.getMacb());
            ps.setString(2, cb.getTencb());
            ps.setDate(3, new java.sql.Date(cb.getNgaysinh().getTime()));
            ps.setString(4, cb.getGioitinh());
            ps.setString(5, cb.getQuequan());
            ps.setString(6, cb.getQuoctich());
            ps.setString(7, cb.getDantoc());
            ps.setString(8, cb.getTrinhdo());
            ps.setString(9, cb.getChuyennganh());
            ps.setString(10, cb.getEmail());
            ps.setString(11, cb.getSodt());
            ps.setString(12, cb.getKyluat());
            ps.setString(13, cb.getThuongtru());
            ps.setString(14, cb.getTamtru());
            ps.setString(15, cb.getGiadinhchinhsach());
            ps.setString(16, cb.getSocmt());
            ps.setString(17, cb.getNoicapcmt());
            ps.setDate(18, new java.sql.Date(cb.getNgayscapcmt().getTime()));
            ps.setString(19, cb.getMaluong());
            ps.setString(20, cb.getMakt());
            ps.setString(21, cb.getMacbpb());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean xoa(String ma) {
        try {
            String sql = "DELETE tblcanbo where macb = '" + ma + "'";
            ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public String timkiem(String ma) {
        try {
            String sql = "SELECT * FROM tblcanbo "
                    + "where macb like '%" + ma
                    + "%' or tencb like '%" + ma + "%'";
            return sql;

        } catch (Exception e) {
        }
        return null;
    }

    public String timkiem(JTextField txttimkiem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
