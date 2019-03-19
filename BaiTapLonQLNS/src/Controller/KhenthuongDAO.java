/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.KhenThuong;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.*;

public class KhenthuongDAO {

    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public KhenthuongDAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Tutorial;"
                    + "username=sa;password=phanphuc1209");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData(String sql, JTable tb) {
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
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

    public boolean themKhenthuong(KhenThuong kt) {
        try {
            String sql = "INSERT INTO tblkhenthuong(makhenthuong,hinhthuckhenthuong,thanhtich) "
                    + "VALUES(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, kt.getMakhenthuong());
            ps.setString(2, kt.getHinhthuckhenthuong());
            ps.setString(3, kt.getThanhtich());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaKhenthuong(String ma, KhenThuong kt) {
        try {
            String sql = "update dbo.tblkhenthuong "
                    + "set makhenthuong = ?,"
                    + "hinhthuckhenthuong = ?,"
                    + "thanhtich = ? "
                    + "where makhenthuong = '" + ma + "'";
            ps = conn.prepareStatement(sql);
            ps.setString(1, kt.getMakhenthuong());
            ps.setString(2, kt.getHinhthuckhenthuong());
            ps.setString(3, kt.getThanhtich());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoaKhenthuong(String ma) {
        try {
            String sql = "DELETE dbo.tblkhenthuong where makhenthuong = '" + ma + "' ";
            ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String timkiemKhenthuong(String ma) {
        try {
            String sql = "SELECT*FROM dbo.tblkhenthuong where makhenthuong like '%" + ma + "%' ";
            return sql;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
