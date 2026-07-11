<%-- 
    Document   : UserForm
    Created on : 4 Jul 2026, 6:18:12 pm
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
        <h1>User Registration Form</h1>
        <form action="UserRegServlet">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td><label for="Name">Enter UserName : </label></td>
                        <td><input type="text" name="Name" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="Address">Enter Address : </label></td>
                        <td><input type="text" name="Address" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="Gender"> Address : </label></td>
                        <td><input type="radio" name="Gender" value="Male" />Male<br><!-- comment -->
                        <input type="radio" name="Gender" value="FeMale" />FeMale
                        </td>
                    </tr>
                    <tr>
                        <td><label for="Email">Enter Email : </label></td>
                        <td><input type="text" name="Email" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="Mobileno">Enter Mobile no. : </label></td>
                        <td><input type="text" name="Mobileno" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="City">Select City : </label></td>
                        <td><select name="City">
                                <option value="Mumbai">Mumbai</option>
                                <option value="Pune">Pune</option>
                                <option value="Yavatmal">Yavatmal</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><label for="Education">Select Education : </label></td>
                        <td><input type="checkbox" name="Education" value="UG" />UG<br>
                            <input type="checkbox" name="Education" value="PG" />PG<br><!-- comment -->
                            <input type="checkbox" name="Education" value="Diploma" />Diploma<br><!-- comment -->
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit Data" /></td>
                        <td><input type="reset" value="Clear Data" /></td>
                    </tr>
                    
                </tbody>
            </table>

        </form>
    </center>
    </body>
</html>
