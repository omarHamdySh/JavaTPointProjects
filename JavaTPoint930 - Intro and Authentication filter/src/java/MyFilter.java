
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter {
    
    public void init(FilterConfig arg0) throws ServletException {
    }
    
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {
        
        PrintWriter out = resp.getWriter();
        out.println("<h2>filter is invoked before</h2>&copy printed From MyFilter");
        
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        if (uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
            chain.doFilter(req, resp);//sends request to next resource
        }else{
            RequestDispatcher rs= req.getRequestDispatcher("ReLogin");
            rs.include(req, resp);            
        }
        
        out.println("<h2>filter is invoked after</h2>&copy printed From MyFilter");
        
    }
    
    public void destroy() {
    }
    
}
