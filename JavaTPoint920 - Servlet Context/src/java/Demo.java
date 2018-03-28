/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author omarhamdy
 */
public class Demo extends HttpServlet {

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
            out.println("<title>Servlet Demo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"margin-left:500px;\">");

            String name = request.getParameter("name");
            out.println("<h3>Hi " + name + "</h3>");

            ServletContext application = getServletConfig().getServletContext();

            Object lastUser = application.getAttribute("LastUser");

            if (lastUser != null) {
                out.println("Last user visited is: " + (String) lastUser);
            } else {
                out.println(getServletContext().getInitParameter("LastUser"));
            }

            //The Context Init Parameter has another name which is Context Attribute.
            application.setAttribute("LastUser", name);


            out.print("</br></br><a href=\"" + ((String) getServletContext().getInitParameter("OmarFaceBook")) + "\">");

            out.print("Omar Facebook");
            out.println("</a>");

            Enumeration<String> e = application.getInitParameterNames();

            while (e.hasMoreElements()) {
                String str =(String) e.nextElement();
                out.println("<h4>Attribute Name is: "+str+"</h4>");
                out.println("<h4>Attribute Value is:"+((String)application.getInitParameter(str))+"</h4>");
            }
            out.println("</div>");
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
