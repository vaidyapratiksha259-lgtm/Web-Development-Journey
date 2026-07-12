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
public class Vehicle implements Serializable {
    private String CustomerName;
    private String CustomerEmail;
    private long CustomerMobile;
    private String CustomerAddress;
    private String VehicleNo;
    private String OwnerName;
    private String Type;
    private String VehicleCompany;
    private String VehicleModel;
    private int Manufacturingyear;
    private int VehicleAge;
    private String IType;
    private String Addonoption;
    private double EstimateValue;

    
    public void setcustomername(String CustomerName)
    {
        this.CustomerName=CustomerName;
    }
    public String getcustomername()
    {
        return CustomerName;
    }
    public void setcustomeremail(String CustomerEmail)
    {
        this.CustomerEmail=CustomerEmail;
    }
    public String getcustomeremail()
    {
        return CustomerEmail;
    }
    public void setcustomermobile(long CustomerMobile)
    {
        this.CustomerMobile=CustomerMobile;
    }
    public long getcustomermobile()
    {
        return CustomerMobile;
    }
    public void setcustomeraddress(String CustomerAddress)
    {
        this.CustomerAddress=CustomerAddress;
    }
    public String getcustomeraddress()
    {
        return CustomerAddress;
    }
    public void setvehicleno(String VehicleNo)
    {
        this.VehicleNo=VehicleNo;
    }
    public String getvehicleno()
    {
        return VehicleNo;
    }
    public void setownername(String OwnerName)
    {
        this.OwnerName=OwnerName;
    }
    public String getownername()
    {
        return OwnerName;
    }
    public void settype(String Type)
    {
        this.Type=Type;
    }
    public String gettype()
    {
        return Type;
    }
     public void setvehiclecompany(String VehicleCompany)
    {
        this.VehicleCompany=VehicleCompany;
    }
    public String getvehiclecompany()
    {
        return VehicleCompany;
    }
    public void setvehiclemodel(String VehicleModel)
    {
        this.VehicleModel=VehicleModel;
    }
    public String getvehiclemodel()
    {
        return VehicleModel;
    }
    public void setmanufacturingyear(int Manufacturingyear)
    {
        this.Manufacturingyear=Manufacturingyear;
    }
    public int getmanufacturingyear()
    {
        return Manufacturingyear;
    }
    public void setvehicleage(int VehicleAge)
    {
        this.VehicleAge=VehicleAge;
    }
    public int getvehicleage()
    {
        return VehicleAge;
    }
    public void setitype(String IType)
    {
        this.IType=IType;
    }
    public String getitype()
    {
        return IType;
    }
    public void setaddonoption(String Addonoption)
    {
        this.Addonoption=Addonoption;
    }
    public String getaddonoption()
    {
        return Addonoption;
    }
    public void setestimatevalue(double EstimateValue)
    {
        this.EstimateValue=EstimateValue;
    }
    public double getestimatevalue()
    {
        return EstimateValue;
    }
    
    
}
