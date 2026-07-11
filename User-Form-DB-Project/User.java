/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapp;
import java.io.Serializable;


/**
 *
 * @author USER
 */
public class User implements Serializable {
    private String Name;
    private String Address;
    private String Gender;
    private String Email;
    private String Mobileno;
    private String City;
    private String Education;
  
    public void setname(String Name)
    {
        this.Name=Name;
    }
    public String getname()
    {
        return Name;
    }
    public void setaddress(String Address)
    {
        this.Address=Address;
    }
    public String getaddress()
    {
        return Address;
    }
    public void setemail(String Email)
    {
        this.Email=Email;
    }
    public String getemail()
    {
        return Email;
    }
    public void setgender(String Gender)
    {
        this.Gender=Gender;
    }
    public String getgender()
    {
        return Gender;
    }
    public void setmobileno(String Mobileno)
    {
        this.Mobileno=Mobileno;
    }
    public String getmobileno()
    {
        return Mobileno;
    }
    public void setcity(String City)
    {
        this.City=City;
    }
    public String getcity()
    {
        return City;
    }
    public void seteducation(String Education)
    {
        this.Education=Education;
    }
    public String geteducation()
    {
        return Education;
    }
    
}
