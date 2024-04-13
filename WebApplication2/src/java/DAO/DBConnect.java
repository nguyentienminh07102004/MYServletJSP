package DAO;

import java.sql.*;
public class DBConnect {
    private static String url = "jdbc:mysql://localhost:3306/Tradding2024?allowPublicKeyRetrieval=true&useSSL=false";
    private static String username = "root";
    private static String password = "Minhnguyen12345!";
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (Connection)DriverManager.getConnection(url, username, password);
    }
}
