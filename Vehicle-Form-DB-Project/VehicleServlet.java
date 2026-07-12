/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.dbapp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "VehicleServlet", urlPatterns = {"/VehicleServlet"})
public class VehicleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VehicleServlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            String CustomerName=request.getParameter("CustomerName");
            String CustomerEmail=request.getParameter("CustomerEmail");
            long CustomerMobile=Long.parseLong(request.getParameter("CustomerMobile"));
            String CustomerAddress=request.getParameter("CustomerAddress");
            String VehicleNo=request.getParameter("VehicleNo");
            String OwnerName=request.getParameter("OwnerName");
            String Type=request.getParameter("Type");
            String VehicleCompany=request.getParameter("VehicleCompany");
            String VehicleModel=request.getParameter("VehicleModel");
            int Manufacturingyear=Integer.parseInt(request.getParameter("Manufacturingyear"));
            int VehicleAge=Integer.parseInt(request.getParameter("VehicleAge"));
            String IType=request.getParameter("IType");
            double EstimateValue=Double.parseDouble(request.getParameter("EstimateValue"));

            
           
            String Addonoption[]=request.getParameterValues("Addonoption");
            String addonoption="";
          for(int i=0;i<Addonoption.length;i++)
            {
                addonoption+=Addonoption[i]+" ";
            
            }

            Vehicle v=new Vehicle();
            v.setcustomername(CustomerName);
            v.setcustomeremail(CustomerEmail);
            v.setcustomermobile(CustomerMobile);
            v.setcustomeraddress(CustomerAddress);
            v.setvehicleno(VehicleNo);
            v.setownername(OwnerName);
            v.settype(Type);
            v.setvehiclecompany(VehicleCompany);
            v.setvehiclemodel(VehicleModel);
            v.setmanufacturingyear(Manufacturingyear);
            v.setvehicleage(VehicleAge);
            v.setestimatevalue(EstimateValue);


            v.setitype(IType);
            v.setaddonoption(addonoption);
            v.setestimatevalue(EstimateValue);
            out.println(v.getcustomername());
            out.println(v.getcustomeremail());
            out.println(v.getcustomermobile());
            out.println(v.getcustomeraddress());
            out.println(v.getvehicleno());
            out.println(v.getownername());
            out.println(v.gettype());
            out.println(v.getvehiclecompany());
            out.println(v.getvehiclemodel());
            out.println(v.getmanufacturingyear());
            out.println(v.getitype());
            out.println(v.getaddonoption());
            out.println(v.getestimatevalue());
            
            VehicleDAO dao=new VehicleDAO();
            boolean status=dao.saveVehicle(v);
            if(status)
            {
                request.setAttribute("msg","Registration Successfull");
                request.getRequestDispatcher("VehicleResult.jsp").forward(request, response);
            }
            else
                {
                        out.println("Registration Failed");
                }
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
