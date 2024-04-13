<%-- 
    Document   : home
    Created on : Mar 22, 2024, 11:14:32 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies</title>
    </head>
    <body>
        <% Cookie[] arr = request.getCookies(); %>
        <h1><%= arr[0].getValue()%></h1>
    </body>
</html>
