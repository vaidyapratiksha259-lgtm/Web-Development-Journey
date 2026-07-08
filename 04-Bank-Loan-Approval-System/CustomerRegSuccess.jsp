<%-- 
    Document   : CustomerRegSuccess
    Created on : 16 Jun 2026, 7:31:25 am
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
        <h1>Customer Details Submited Successfully</h1>
        <h3>------------ Check Datails --------------</h3>
        <p>Name : <b>${CName}</b></p>
        <p>Account No. : <b>${AccNo}</b></p>
        <p> Address : <b>${CAddress}</b></p>
        <p> Mobile No. : <b>${CMobNo}</b></p>
        <p> Email Id : <b>${CMail}</b></p>
        <p> Gender : <b>${Gender}</b></p>
        <p>Bank Name : <b>${BName}</b></p><!-- comment -->
        <p>Select Branch : <b>${Select}</b></p><!-- comment -->
        
        <input type="submit" value="Apply For Loan Now" />
        </center>
    </body>
</html>
