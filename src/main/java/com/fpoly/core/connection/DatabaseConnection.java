package com.fpoly.core.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;database=QUANLYTHUVIEN;trustServerCertificate=true;encrypt=true;";
        String username = "sa";
        String password = "songlong";
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    }
}
