<%-- 
    Document   : SignUpUser
    Created on : Mar 21, 2024, 3:25:50 PM
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
        <h1>SIGN UP FOR USER</h1>
        <form action="signUpUser" method="post">
            <table>
                <tr>
                    <td><label for="user">Username: </label></td>
                    <td><input type="text" name="user" id="user" placeholder="Username"></td>
                </tr>
                <tr>
                    <td><label for="pass">Password: </label></td>
                    <td><input id="pass" name="pass" placeholder="Password" type="password"></td>
                </tr>
            </table>
            <input type="submit" value="SIGN UP">
        </form>
    </body>
</html>
