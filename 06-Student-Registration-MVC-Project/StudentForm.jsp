<%-- 
    Document   : StudentForm
    Created on : 10 Jul 2026, 10:21:19 am
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
        <h1>Student Registration Form </h1><!-- comment -->
        <form action="StudentControllerServlet">
            <table border="0">
               
                <tbody>
                    <tr>
                        <td><label for="sname">Enter Name : </label></td>
                        <td><input type="text" name="sname" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="srollno">Enter Roll No. : </label></td>
                        <td><input type="text" name="srollno" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="sgender">Select Gender : </label></td>
                        <td><input type="radio" name="Gender" value="Male" />Male<br><!-- comment -->
                            <input type="radio" name="Gender" value="Female" />Female</td>
                    </tr>
                    <tr>
                        <td><label for="sbranch">Select Branch : </label></td>
                        <td><select name="sbranch">
                                <option value="CSE">CSE</option>
                                <option value="IT">IT</option>
                                <option value="AIDS">AIDS</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit Form" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </center>
    </body>
</html>
