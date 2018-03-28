/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarhamdy
 * */
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.SingleThreadModel;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class MyServlet extends HttpServlet implements SingleThreadModel{  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    out.print("welcome");  
    try{Thread.sleep(10000);}catch(Exception e){e.printStackTrace();}  
    out.print(" to servlet");  
    out.close();  
    }  
}  