
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

public class MyFilter implements Filter {

    FilterConfig filterConfig;

    public void init(FilterConfig arg0) throws ServletException {
        this.filterConfig = arg0;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
        out.println("<html><head></head><body>");

        String construction = filterConfig.getInitParameter("Construction");
        if (construction.equalsIgnoreCase("yes")) {
            chain.doFilter(req, resp);//sends request to next resource
        } else if (construction.equalsIgnoreCase("no")) {
            out.print("<h3>Go take a leak the page is under construction</h3>");
        }

        out.println("</body></html>");

        out.close();
    }

    public void destroy() {
    }

}
