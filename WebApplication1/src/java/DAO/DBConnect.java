package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
    private static String url = "jdbc:mysql://localhost:3306/Tradding2024?allowPublicKeyRetrieval=true&useSSL=false";
    private static String user = "root";
    private static String pass = "Minhnguyen12345!";
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (Connection)DriverManager.getConnection(url, user, pass);
    }
}
