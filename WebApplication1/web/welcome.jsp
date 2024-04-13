<%-- 
    Document   : welcome
    Created on : Mar 21, 2024, 11:09:22 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MODEL.Admin" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELCOME</title>
    </head>
    <body>
        <% Admin admin = (Admin)session.getAttribute("account"); %>
        <h1> Hello <%= admin.getUseName() %></h1>
    </body>
</html>
