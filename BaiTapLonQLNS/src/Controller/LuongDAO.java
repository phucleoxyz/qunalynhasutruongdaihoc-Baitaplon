/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Luong;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

/**
 *
 * @author Phan Van Phuc
 */
public class LuongDAO {

    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public LuongDAO() {
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

    public boolean themLuong(Luong l) {
        try {
            String sql = "INSERT INTO dbo.tblluong(maluong,luongcoban,luongchinhthuc,hesoluong)"
                    + "VALUES(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, l.getMaluong());
            ps.setString(2, l.getLuongcoban());
            ps.setString(3, l.getLuongchinhthuc());
            ps.setFloat(4, l.getHesoluong());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean suaLuong(String ma, Luong l) {
        try {
            String sql = "update dbo.tblluong "
                    + "set maluong = ?,"
                    + "luongcoban = ?,"
                    + "luongchinhthuc = ?,"
                    + "hesoluong = ? "
                    + "where maluong = '" + ma + "'";

            ps = conn.prepareStatement(sql);
            ps.setString(1, l.getMaluong());
            ps.setString(2, l.getLuongcoban());
            ps.setString(3, l.getLuongchinhthuc());
            ps.setFloat(4, l.getHesoluong());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean xoaLuong(String ma) {
        try {
            String sql = "DELETE dbo.tblluong where maluong = '" + ma + "'";
            ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        

    }
    public String timkiemLuong(String ma){
        try {
            String sql = "SELECT*FROM dbo.tblluong where maluong like '%"+ma+"%'";
            return sql;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }

}
