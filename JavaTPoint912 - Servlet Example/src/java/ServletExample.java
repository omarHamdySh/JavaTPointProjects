/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Congratulations you Made it to the JAVA EE Course.
 * Here its the First Project of the java EE part.
 * 
 *
 * The Netbeans differs from the JavaTPoint sequence of tutoring, so we will put it together
 * some points we miss:
 * 
 * 1)Standard Servlets' directory structure, it won't match the Netbeans web projects,
 * because actually those projects its not in the final format that will be deployed in
 * the server or may be check hand with other projects which made by other IDEs,
 * Just Build the project and the Netbeans will generate a directory inside your project called
 * Build -> web (directory), then you will have the standard structure you was looking for.
 * 
 * 2)Generating War file, Netbeand doing it on your behave too, and the ware file
 * will be generated and located at a directory called dist.
 * 
 * 3)Changing server port, in glass fish server, if you have more than one server
 * on the same system, both might have the default port:8080, so to change the port
 * in glassfish server, first get to the server-config change the port.
 * How to get the server-config, just write down the following URL:
 * Localhost:4848 and you will be directed to the glass fish server Admin panel,
 * then choose Configurations -> server-config from the navigation bar,
 * then choose HTTP Service -> HTTP Listener -> HTTP listener1 and HTTP listener2,
 * HTTP the port of one or both of the HTTP listeners.
 * 
 * The next two steps will be discussed later in details:
 * 4) How to setup and configure one of the JAVA EE standalone servers.
 * 5) How to deploy applications to those standalone servers.
 *
 * Note: Each of the Upcoming Web projects, will have a Description file that will have 
 * the same name of the project inside the JavaTPoint EE Course Directory.
 * @author omarhamdy
 */
public class ServletExample extends HttpServlet {

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
            out.println("<title>Servlet ServletExample</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletExample at " + request.getContextPath() + "</h1>");
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
