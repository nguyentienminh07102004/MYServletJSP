/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Login;
import MODEL.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;

@WebServlet(name="LoginCookies", urlPatterns = {"/loginCookies"})
public class LoginCookies extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String user = req.getParameter("user");
         String pass = req.getParameter("pass");
         String remember = req.getParameter("remember");
         
         // Tạo 3 cookies
         Cookie userCookie = new Cookie("user", user);
         Cookie passCookie = new Cookie("pass", pass);
         Cookie RememberCookie = new Cookie("remember", remember);
         
         if(remember != null){
             RememberCookie.setMaxAge(60 * 60 * 24);
             passCookie.setMaxAge(60 * 60 * 24);
             userCookie.setMaxAge(60 * 60 * 24);
         }else{
             RememberCookie.setMaxAge(0);
             passCookie.setMaxAge(0);
             userCookie.setMaxAge(0);
         }
         
         // Add Cookies vào Browser
         resp.addCookie(passCookie);
         resp.addCookie(userCookie);
         resp.addCookie(RememberCookie);
         
         Admin admin = DAO_Login.checkLogin(user, pass);
         if(admin != null){
             HttpSession session = req.getSession();
             session.setAttribute("account", admin);
             resp.sendRedirect("welcome.jsp");
         }else{
             req.setAttribute("ERROR", "USERNAME OR PASSWORD INVALID!!");
             req.getRequestDispatcher("LOGINCookiesToRememberMe.jsp").forward(req, resp);
         }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("LOGINCookiesToRememberMe.jsp").forward(req, resp);
    }
    
}
