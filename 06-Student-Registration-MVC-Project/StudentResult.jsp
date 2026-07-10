<%-- 
    Document   : StudentResult.jsp
    Created on : 10 Jul 2026, 10:46:58 am
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@page import="com.mycompany.mvcproject.Student"%>
    <body>
    <center>
        <%
            Student Stud=(Student)request.getAttribute("Stud");
                    %>
                    <h1>Student Information</h1><!-- comment -->
                    <p>Student Name :<b> <%=Stud.getStudName()%></b></p>
                    <p>Student Roll No. :<b> <%=Stud.getStudRollno()%></b></p>
                    <p>Student Gender : <b><%=Stud.getStudGender()%></b></p>
                    <p>Student Branch :<b> <%=Stud.getStudBranch()%></b></p>
                    </center>
    </body>
</html>
