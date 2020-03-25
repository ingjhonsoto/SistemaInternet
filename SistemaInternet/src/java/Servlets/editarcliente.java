/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import controladores.con_editarcliente;
import include.in_editarcliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jsoto
 */
public class editarcliente extends HttpServlet {

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
        
            
    
            int idcliente=Integer.parseInt(request.getParameter("idcliente"));
            String dni=request.getParameter("dni");
            String nombre=request.getParameter("nombre").toUpperCase();
            String paterno=request.getParameter("apaterno").toUpperCase();
            String materno=request.getParameter("amaterno").toUpperCase();
            String direccion=request.getParameter("direccion").toUpperCase();
            int celular=Integer.parseInt(request.getParameter("celular"));
            String estado=request.getParameter("estado").substring(0,2);
            if (dni == "null") {
                dni=null;
            }else{dni=request.getParameter("dni").toUpperCase();}
            if (celular != 0) {
                celular=Integer.parseInt(request.getParameter("celular"));
            }else{celular=0;}
           // response.getWriter().println(idcliente+" "+dni+" "+nombre+" "+paterno+" "+materno+" "+direccion+" "+celular+" "+estado);
            con_editarcliente edc= new con_editarcliente();
            
           if (edc.editcliente(new in_editarcliente(idcliente, dni, nombre, paterno, materno, direccion, celular, estado))) {
               response.sendRedirect("clientestotales.jsp");

        }else{
            response.getWriter().println("Error al Actualizar");
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
