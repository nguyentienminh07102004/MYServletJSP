package CONTROLLER;

import DAO.DBConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import DAO.DBConnect;
import java.sql.SQLException;

@WebServlet(name = "AddLogin", urlPatterns = {"/signUpAdmin"})
public class SignUpAdmin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        String sql = "INSERT INTO Admin VALUES (?, ?, '1');";
        try {
            PreparedStatement pre = DBConnect.getConnection().prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            pre.executeUpdate();
            resp.sendRedirect("login.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            req.setAttribute("Error", "Nhap du lieu sai");
            req.getRequestDispatcher("SignUpAdmin.jsp").forward(req, resp);
            System.out.println(ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
