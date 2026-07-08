<%-- 
    Document   : CustomerRegForm
    Created on : 16 Jun 2026, 7:08:21 am
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
        <form action="CustomerRegServlet">
            <h1>Bank Loan Approval System</h1>
            <h3>Bank Details : </h3>
            <table border="0">
                
                <tbody>
                    <tr>
                        <td><label for="BName">Bank Name : </label></td>
                        <td><input type="text" name="BName" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="SBranch">Select Branch : </label></td>
                        <td><select name="Select">
                                <option value = "-1">Select Branch</option>
                                <option value = "Rajapeth">Rajapeth</option>
                                <option value = "Badnera">Badnera</option>
                                <option value ="Anjangaonbari">Anjangaonbari</option>
                                <option value = "Dabha">Dabha</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><h3>Customer Details : </h3></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><label for="CName">Enter Name : </label></td>
                        <td><input type="text" name="CName" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="AccNo.">Enter Account No. : </label></td>
                        <td><input type="text" name="AccNo." value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="SGender">Select Gender : </label></td>
                        <td><label for="Male">Male</label><input type="radio" name="Gender" value="Male" /><label for="Female">Female</label>
                            <input type="radio" name="Gender" value="Female" /></td>
                    </tr>
                    <tr>
                        <td><label for="CAddress">Enter Address : </label></td>
                        <td><textarea name="CAddress" rows="4" cols="20">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td><label for="CMobNo.">Enter Mobile No. : </label></td>
                        <td><input type="number" name="CMobNo." value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="CMail">Enter EmailId : </label></td>
                        <td><input type="email" name="CMail" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Clear" /></td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        </center>
    </body>
</html>
