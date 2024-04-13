/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Admin;
import MODEL.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name="Login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        HttpSession session = req.getSession();
        try {
            if(DAO_Admin.checkLogin(user, pass) != null){
                Admin admin = DAO_Admin.checkLogin(user, pass);
                session.setAttribute("account", admin);
                resp.sendRedirect("welcome.jsp");
            }else{
                req.setAttribute("Error", "Username or Password invalid!!!");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
    
}
