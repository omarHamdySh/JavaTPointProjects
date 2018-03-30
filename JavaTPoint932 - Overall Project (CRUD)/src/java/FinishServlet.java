/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author omarhamdy
 */
public class FinishServlet extends HttpServlet {

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

            //Note that we made the conState variable after removing the DBConn attribute
            //because then the conState will have a new value of string, which is saying:
            //Weather or not the DBConn is closed successfully.
            HttpSession session = request.getSession();
            session.removeAttribute("DBConn");
            String DBConn = (String) session.getAttribute("DBConn");
            String conState = (String) session.getAttribute("conState");
            out.println(conState);
            boolean conStateBool = (boolean) session.getAttribute("conStateBool");
            if (conStateBool) {
                RequestDispatcher rd = request.getRequestDispatcher("Home.html");
                rd.include(request, response);
                session.invalidate();
                
            } else if (!conStateBool) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet FinishServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Connection can't be closed & eventually the system will crash.</h1>");
                out.println("</body>");
                out.println("</html>");
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet FinishServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Session Attribute Listener didn't noticed that we removed the attribute DBConn</h1>");
                out.println("<h1>DBConn current Value: " + DBConn + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
           
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
