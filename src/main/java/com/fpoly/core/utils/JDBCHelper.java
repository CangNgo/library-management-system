/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.utils;

import java.sql.*;
import java.util.Arrays;

/**
 * @author acer
 */
public class JDBCHelper {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;database=QUANLYTHUVIEN;trustServerCertificate=true;encrypt=true;";
    static String user = "sa";
    static String pass = "123123";

    static {
        try {
            Class.forName(driver);

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

      public static PreparedStatement getstmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBCHelper.getstmt(sql, args);
            try {
                return stmt.executeUpdate();
            }
            catch(SQLException e){
                  System.out.println("stmt.excute");
                  System.out.println(e.getMessage());
            }
            finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println("JDBC");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JDBCHelper.getstmt(sql, args);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
