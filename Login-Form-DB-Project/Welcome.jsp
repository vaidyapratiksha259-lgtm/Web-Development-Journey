<%-- 
    Document   : Welcome
    Created on : 10 Jul 2026, 6:47:14 pm
    Author     : USER
--%>

<%@page import="com.mycompany.dbapp.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
            User user=(User)request.getAttribute("user");
            %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>Welcome<b><%=user.getname()%></b></h2><!-- comment -->
        <hr>Name : <b><%=user.getname()%></b><br><br>
        Email : <b><%=user.getemail()%></b><br><br><!-- comment -->
        Address : <b><%=user.getaddress()%></b><br><br><!-- comment -->
        Gender : <b><%=user.getgender()%></b><br><br>
        City : <b><%=user.getcity()%></b><br><br>
        Education : <b><%=user.geteducation()%></b><br><br>
        Mobile : <b><%=user.getmobileno()%></b><br><br>
        </center>
    </body>
</html>
