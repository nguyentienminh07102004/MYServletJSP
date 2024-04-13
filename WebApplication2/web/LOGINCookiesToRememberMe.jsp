<%-- 
    Document   : LOGINCookiesToRememberMe
    Created on : Mar 22, 2024, 11:36:23 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>THIS IS A LOGIN PAGE</h1>
        <% Cookie[] cookies = request.getCookies();
            String user = "";
            String pass = "";
            String remember = "";
            for(int i = 0; i < cookies.length; i++){
                if(cookies[i].getName().equals("user")){
                    user = cookies[i].getValue();
                }else if(cookies[i].getName().equals("pass")){
                    pass = cookies[i].getValue();
                }else if(cookies[i].getName().equals("remember")){
                    remember = cookies[i].getValue();
                }
            }
        %>
        <form action="loginCookies" method="POST">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" id="user" name="user" placeholder="Username" value="<%= user %>"></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" id="pass" name="pass" placeholder="Password" value="<%= pass %>"></td>
                </tr>
            </table>
            <input type="checkbox" value="ON" name="remember" <%= remember %>>Remember me<br>
            <input type="submit" value="LOGIN">
        </form>
    </body>
</html>
