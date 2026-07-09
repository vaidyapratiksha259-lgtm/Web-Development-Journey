<%-- 
    Document   : Login
    Created on : 20 Jun 2026, 4:32:42 pm
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Login System</h1><!-- comment -->
        <form action="LoginServlet">
            <table border="0">
            
            <tbody>
                <tr>
                    <td><label for="Username">Enter Username : </label></td>
                    <td><input type="text" name="Username" value="" /></td>
                </tr>
                <tr>
                    <td><label for="Password">Enter Password : </label></td>
                    <td><input type="text" name="Password" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        </form>

    </center>
    </body>
</html>
