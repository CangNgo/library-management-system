package com.fpoly.core.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fpoly.core.utils.XEmail;

public class QuenMatKhauDAO {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;database=QUANLYTHUVIEN;trustServerCertificate=true;encrypt=true;";
    private static final String USER = "sa";
    private static final String PASS = "221105";

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static String getPassword(String accountType, String username, String email) {
        String query;
        if ("DocGia".equalsIgnoreCase(accountType)) {
            query = "SELECT MatKhau FROM DocGia WHERE TaiKhoan = ? AND Email = ?";
        } else {
            query = "SELECT MatKhau FROM NhanVien WHERE TaiKhoan = ? AND Email = ?";
        }

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String password = rs.getString("MatKhau");
                sendPasswordEmail(email, password);
                return password;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void sendPasswordEmail(String to, String password) {
        String subject = "Your Password Recovery";
        String content = "Your password is: " + password;
        XEmail.sendEmail(to, subject, content);
    }
}
