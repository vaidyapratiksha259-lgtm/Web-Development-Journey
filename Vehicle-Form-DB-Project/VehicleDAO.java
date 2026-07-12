/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapp;
import java.sql.*;

/**
 *
 * @author USER
 */
public class VehicleDAO {
    
     public Boolean saveVehicle(Vehicle v)
{
Boolean status=false;
try
{
Connection con=DBConnection.getConnection();
PreparedStatement ps=con.prepareStatement("insert into vehicle(CustomerName,CustomerEmail,CustomerMobile,CustomerAddress,VehicalNo,OwnerName,Type,VehicalCompany,VehicalModel,Manufacturingyear,VehicalAge,IType,Addonoption,EstimateValue)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
ps.setString(1,v.getcustomername());
ps.setString(2,v.getcustomeremail());
ps.setLong(3,v.getcustomermobile());
ps.setString(4,v.getcustomeraddress());
ps.setString(5,v.getvehicleno());
ps.setString(6,v.getownername());
ps.setString(7,v.gettype());
ps.setString(8,v.getvehiclecompany());
ps.setString(9,v.getvehiclemodel());
ps.setInt(10,v.getmanufacturingyear());
ps.setInt(11,v.getvehicleage());
ps.setString(12,v.getitype());
ps.setString(13,v.getaddonoption());
ps.setDouble(14,v.getestimatevalue());
int i=ps.executeUpdate();
if(i>0)
{
status=true;
}
}catch(Exception e)
{
e.printStackTrace();
}
return status;
}
     
}
