<%-- 
    Document   : login
    Created on : Mar 21, 2024, 10:47:20 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <form action="login" method="Post">
            <table>
                <tr>
                    <td><label for="User">Username: </label></td>
                    <td><input type="text" name="user" placeholder="Username" id="User">
                </tr>
                <tr>
                    <td><label for="Password">Password: </label></td>
                    <td><input type="password" id="Password" name="pass" placeholder="Password"></td>
                </tr>
            </table>
            <input type="submit" value="LOGIN">
        </form>
        <% if(request.getAttribute("Error") != null){ %>
            <h2 style="color: red"><%= (String)request.getAttribute("Error") %></h2>
        <% } %>
    </body>
</html>
