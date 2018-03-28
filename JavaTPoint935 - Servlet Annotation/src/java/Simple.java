/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarhamdy
 */
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
//We will use Empty mapping for the servlet to make it have the same url of servletContext
//off course we could name it but it will be needed from us to write the servlet name after
//the ServletContext path.
@WebServlet("")  
public class Simple extends HttpServlet {  
    private static final long serialVersionUID = 1L;  
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
          
  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        out.print("<html><body>");  
        out.print("<h3>Hello Servlet</h3>");  
        out.print("</body></html>");  
    }  
}  
