/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author omarhamdy
 */
public class Home extends HttpServlet {

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
            out.println("<title>Servlet Home</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"margin-left:350px;\">");

            boolean exists = false;
            Cookie ck[] = request.getCookies();
            if (ck != null) {
                for (Cookie cookie : ck) {
                    if (cookie.getName().equals("uname")) {
                        out.println("<h3>Welcome back at home " + cookie.getValue() + "</h3>");
                        exists = true;
                    }
                }

                if (exists) {
                    for (Cookie cookie2 : ck) {
                        if (cookie2.getName().equals("pass")) {
                            out.println("<h3>You'd used <strong>" + cookie2.getValue() + "</strong> as a password</h3>");
                        }
                    }

                }
            }
            if (exists == false) {

                String uname = request.getParameter("uname");
                String pass = request.getParameter("pass");

                Cookie cookie1 = new Cookie("uname", uname);
                Cookie cookie2 = new Cookie("pass", pass);

                response.addCookie(cookie1);
                response.addCookie(cookie2);

                out.println("<h3>You've logged in successfuly home " + uname + "</h3>");
                out.println("<h3>You'd used <strong>" + pass + "</strong> as a password</h3>");
            }

            out.println("<Form action=\"Logout\"  method=\"get\">");
            out.println("<input type=\"submit\" value=\"Logout\">");
            out.println("</form>");
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
