/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Login;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;

/**
 *
 * @author Phan Van Phuc
 */
public class LoginDAO {

    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public LoginDAO() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Tutorial;"
                    + "username=sa;password=phanphuc1209");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet Longin(Login l) {
        try {
            String sql = "SELECT*FROM tbllogin WHERE username = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, l.getUsername());
            ps.setString(2, l.getPassword());
            return ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public boolean change(String name, String pass1) {
        try {
            String sql = "UPDATE tbllogin set password = ? "
                    + "where username = '" + name + "'";
            ps = conn.prepareStatement(sql);
            ps.setString(1, pass1);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean change(String text, JPasswordField txtnew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
