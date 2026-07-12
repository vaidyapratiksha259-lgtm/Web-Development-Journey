<%-- 
    Document   : VehicalForm
    Created on : 8 Jul 2026, 6:30:12 pm
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
        <h1>Vehicle Insurance Form</h1>
        <form action="VehicleServlet">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td><h2>Customer Information : </h2></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><label for="cname">Enter Name : </label></td>
                        <td><input type="text" name="CustomerName" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="cmail">Enter Email : </label></td>
                        <td><input type="email" name="CustomerEmail" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="cmobile">Enter Mobile No. : </label></td>
                        <td><input type="text" name="CustomerMobile" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="cname">Enter Address : </label></td>
                        <td><textarea name="CustomerAddress" rows="4" cols="20">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td><h2>Vehicle Information : </h2></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><label for="vno">Vehicle No. : </label></td>
                        <td><input type="text" name="VehicleNo" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="vowner">Owner Name : </label></td>
                        <td><input type="text" name="OwnerName" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="vtype">Vehicle Type : </label></td>
                        <td><input type="radio" name="Type" value="Bike" />Bike <br>
                        <input type="radio" name="Type" value="Car" />Car <br>
                        <input type="radio" name="Type" value="Truck" />Truck </td>
                    </tr>
                    <tr>
                        <td><label for="vcompany">Vehicle Company : </label></td>
                        <td><select name="VehicleCompany">
                                <option value="Honda">Honda</option>
                                <option value="MarutiSuzuki">MarutiSuzuki</option>
                                <option value="Tata">Tata</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><label for="vmodel"> Model : </label></td>
                        <td><input type="text" name="VehicleModel" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="vmanufactureyr">Manufacturing Year : </label></td>
                        <td><input type="number" name="Manufacturingyear" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="vage">Vehicle Age : </label></td>
                        <td><input type="text" name="VehicleAge" value="" /></td>
                    </tr>
                    <tr>
                        <td><label for="vinsurance">Insurance Type : </label></td>
                        <td><input type="radio" name="IType" value="Third Party" />Third Party <br>
                            <input type="radio" name="IType" value="Comprensive" />Comprensive<br>
                            <input type="radio" name="IType" value="Zero Depreciation" />Zero Depreciation</td>
                    </tr>
                    <tr>
                        <td><label for="Addon">Add-on Covers : </label></td>
                        <td><input type="checkbox" name="Addonoption" value="Personal Accident Cover" />Personal Accident Cover <br>
                        <input type="checkbox" name="Addonoption" value="Engine Protection" />Engine Protection <br>
                        <input type="checkbox" name="Addonoption" value="RoadSide Assistance" />RoadSide Assistance <br></td>
                    </tr>
                    <tr>
                        <td><label for="EstimateValue">Estimate Value : </label></td>
                        <td><input type="number" name="EstimateValue" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit Information" /></td>
                        <td><input type="reset" value="Clear Information" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </center>
    </body>
</html>
