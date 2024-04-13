package DAO;

import MODEL.Admin;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO_Admin {
    public static Admin checkLogin(String user, String pass) throws ClassNotFoundException, SQLException{
        Connection connect = DBConnect.getConnection();
        Admin admin = new Admin();
        if(connect != null){
            String sql = "SELECT * FROM Admin WHERE Username = ? And Password = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet set = pre.executeQuery();
            if(set.next()){
                admin.setUseName(set.getString(1));
                admin.setPassword(set.getString(2));
                admin.setRole(set.getInt(3));
                return admin;
            }
        }
        return null;
    }
}
