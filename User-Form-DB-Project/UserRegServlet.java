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
@WebServlet(name = "UserRegServlet", urlPatterns = {"/UserRegServlet"})
public class UserRegServlet extends HttpServlet {

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
            out.println("<title>Servlet UserRegServlet</title>");
            out.println("</head>");
            out.println("<body>");
            String Name=request.getParameter("Name");
            String Address=request.getParameter("Address");
            String Gender=request.getParameter("Gender");
            String Email=request.getParameter("Email");
            String Mobileno=request.getParameter("Mobileno");
            String City=request.getParameter("City");
            String Education[]=request.getParameterValues("Education");
            String education="";
            for(int i=0;i<Education.length;i++)
            {
                education+=Education[i]+" ";
            }
            User U=new User();
            U.setname(Name);
            U.setaddress(Address);
            U.setgender(Gender);
            U.setemail(Email);
            U.setmobileno(Mobileno);
            U.setcity(City);
            U.seteducation(education);
            out.println(U.getname());
            out.println(U.getaddress());
            out.println(U.getgender());
            out.println(U.getemail());
            out.println(U.getmobileno());
            out.println(U.getcity());
            out.println(U.geteducation());
            UserDAO dao=new UserDAO();
            boolean status=dao.saveUser(U);
            if(status)
            {
                request.setAttribute("msg","Registration Successfull");
                request.getRequestDispatcher("UserResult.jsp").forward(request, response);
            }
            else
                {
                        out.println("Registration Failed");
                }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}
}
