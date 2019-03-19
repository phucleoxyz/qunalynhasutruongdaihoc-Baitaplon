/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChucvuPhongban;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Phan Van Phuc
 */
public class ChucvuPhongbanDAO {

    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ChucvuPhongbanDAO() {
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

    public boolean themChucvuPhongban(ChucvuPhongban cp) {
        try {
            String sql = "INSERT INTO dbo.chucvuphongban(macvpb,tenchucvu,tenphongban)"
                    + "VALUES(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cp.getMacvpb());
            ps.setString(2, cp.getTenchucvu());
            ps.setString(3, cp.getTenphongban());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
        }
        return false;
    }

    public boolean suaChucvuPhongban(String ma, ChucvuPhongban cp) {
        try {
            String sql = "UPDATE dbo.chucvuphongban set macvpb = ? , tenchucvu = ? , tenphongban = ? "
                    + "WHERE macvpb = '" + ma + "'";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cp.getMacvpb());
            ps.setString(2, cp.getTenchucvu());
            ps.setString(3, cp.getTenphongban());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;

    }

    public boolean xoaChucvuPhongban(String ma) {
        try {
            String sql = "DELETE dbo.chucvuphongban WHERE macvpb = '" + ma + "'";
            ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String timkiemChucvuPhongban(String ma) {
        try {
            String sql = "SELECT*FROM dbo.chucvuphongban where macvpb like '%" + ma + "%'";
            return sql;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
