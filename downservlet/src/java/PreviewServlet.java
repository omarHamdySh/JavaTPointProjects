/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author omarhamdy
 */
@WebServlet(urlPatterns = {"/servlet/PreviewServlet"})
public class PreviewServlet extends HttpServlet {

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
        response.setContentType("image/jpeg");

        String filename = "aqsa.jpg";
        String filepath = "/Applications/NetBeans/glassfish-4.1.1/glassfish/domains/domain1/applications/";
        
        /**
         * Rule: 
         * You can use meany types of Stream Writers:
         * PrintWriter;
         * ServletOutputStream;
         * etc, if there more;
         * 
         * But the only factor that will determine weather the page will display or download
         * the file is the contentType property:
         * 
         * "APPLICATION/OCTET-STREAM" : will be download page or servlet.
         * "image/jpeg" : will be a preview or display page.
         */
        //response.setContentType("APPLICATION/OCTET-STREAM");
        //response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

        
        FileInputStream f= new FileInputStream(filepath + filename);
        ServletOutputStream out = response.getOutputStream();
        
        // sort of Adapter Pattern. also it is usless in such scenario sow we won't use it
        //BufferedOutputStream bout= new BufferedOutputStream(out);
        
        int i;
        while((i=f.read())!=-1){
            out.write(i);
        }

        out.close();
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
