package DAO;

import MODEL.Admin;
import java.sql.*;

public class DAO_Login {
    public static Admin checkLogin(String user, String pass){
        String sql = "SELECT * FROM Admin WHERE Username = ? and Password = ?";
        try{
            PreparedStatement pre = DBConnect.getConnection().prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet set = pre.executeQuery();
            if(set.next()){
                return new Admin(set.getString(1), set.getString(2), set.getInt(3));
            }
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("FAIL");
        }
        return null;
    }
}
