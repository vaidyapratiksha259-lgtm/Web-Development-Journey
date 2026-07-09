<%-- 
    Document   : Admin
    Created on : 20 Jun 2026, 4:32:57 pm
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@page session="true"%>
    <body>
        <%
            String Username=(String)session.getAttribute("Username");
            String role=(String)session.getAttribute("Role");
            if(!role.equals("Admin"))
            {
            response.sendRedirect("Error.isp");
            return;
        }
        %>
        <h2>Admin Section</h2><!-- comment -->
        <h3>Welcome to Admin : <%=Username%></h3>
    </body>
</html>
