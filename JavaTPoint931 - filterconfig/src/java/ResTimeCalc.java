
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Kindly Maintain this order:
 *
 * Myfilter filter class; AdminServlet servlet class; -> run and write down
 * Servlet1 URL: IP:Port/FilterConfig ResponseFilter filter class; -> run and
 * write down ResponseFilter URL: IP:Port/FilterConfig/Response VisitorCounter
 * filter class; -> run and write down VisitorCounter URL:
 * IP:Port/FilterConfig/CountVisits
 *
 */
import javax.servlet.*;

public class ResTimeCalc implements Filter {

    FilterConfig filterConfig;

    public void init(FilterConfig arg0) throws ServletException {
        this.filterConfig = arg0;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
//        out.println("<html><head></head><body>");

        long startTime =System.currentTimeMillis();
        //out.println("<h1>ay 7aga</h1>");

        chain.doFilter(req, resp);

        long endTime = System.currentTimeMillis();
        //out.println("<h1>ay 7aga</h1>");
        out.println("<h2>"+(((endTime - startTime)))+"</h2>");

//        out.println("</body></html>");

//        out.close();
    }

    public void destroy() {
    }

}
