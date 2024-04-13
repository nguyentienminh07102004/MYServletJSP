<%-- 
    Document   : MultiTable
    Created on : Mar 22, 2024, 7:33:30 PM
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
        <table  border="1px solid black" style="border-collapse: collapse">
            <% for(int i = 2; i < 10; i++){
            %>
            <tr>
                <% for(int j = 1; j < 10; j++){ %>
                <td>
                    <%= i %> x <%= j %> = <%= i * j %>
                </td>
                <% } %>
            </tr>
            <%     
                
             }%>
        </table>
    </body>
</html>
