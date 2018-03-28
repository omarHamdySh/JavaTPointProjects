
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;
import java.util.Enumeration;
/**
 * In this project we gonna use 2 external librariesl:
 * 1st Database JDBC Driver.
 * 2nd cos.jar for reading the multipartReqiesv
 * @author omarhamdy
 */
public class UploadServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        MultipartRequest m = new MultipartRequest(request, "/Applications/NetBeans/glassfish-4.1.1/glassfish/domains/domain1/applications");
        
        //Not necessary at the moment to memorize the following part.
        Enumeration en = m.getFileNames();
        while (en.hasMoreElements()) {
            String fileName = (String) en.nextElement();
            out.println("<h1>"+fileName+"</h2></br>");
        }
        
        out.print("successfully uploaded");
        out.close();
    }
}
