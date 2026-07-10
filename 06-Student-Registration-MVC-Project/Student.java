/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcproject;
import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Student implements Serializable{
    private String Studname;
    private int Studrollno;
    private String Studgender;
    private String Studbranch;
    
    public Student()
    {
    }
    public Student(String Studname,int Studrollno, String Studgender, String Studbranch)
    {
        this.Studname=Studname;
        this.Studrollno=Studrollno;
        this.Studgender=Studgender;
        this.Studbranch=Studbranch;
    }
    public String getStudName()
    {
        return Studname;
    }
    public int getStudRollno()
    {
        return Studrollno;
    }
    public String getStudGender()
    {
        return Studgender;
    }
    public String getStudBranch()
    {
        return Studbranch;
    }
    
}
