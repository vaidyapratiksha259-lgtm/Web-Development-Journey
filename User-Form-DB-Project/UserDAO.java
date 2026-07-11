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
public class UserDAO {
    public Boolean saveUser(User U)
{
Boolean status=false;
try
{
Connection con=DBConnection.getConnection();
PreparedStatement ps=con.prepareStatement("insert into User(Username,address,gender,email,mobileno,city,education)values(?,?,?,?,?,?,?)");
ps.setString(1,U.getname());
ps.setString(2,U.getaddress());
ps.setString(3,U.getgender());
ps.setString(4,U.getemail());
ps.setString(5,U.getmobileno());
ps.setString(6,U.getcity());
ps.setString(7,U.geteducation());
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


    
