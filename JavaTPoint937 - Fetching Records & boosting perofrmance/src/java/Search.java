
import Bean.ResultBean;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import javax.servlet.ServletContext;

public class Search extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Create array list to boost performance by sharing data on the context scope instead
        //of calling it each time from DB.
        ArrayList results = new ArrayList();
        ResultBean result = new ResultBean();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext application = getServletContext();

        String rollno = (String) request.getParameter("roll");
        int roll = Integer.valueOf(rollno);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HRDep", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from result where rollno=?");
            ps.setInt(1, roll);

            out.print("<table width=50% border=1>");
            out.print("<caption>Result:</caption>");
            ResultSet rs = ps.executeQuery();

            /* Printing column names */
            ResultSetMetaData rsmd = rs.getMetaData();
            int total = rsmd.getColumnCount();
            out.print("<tr>");
            for (int i = 1; i <= total; i++) {
                out.print("<th>" + rsmd.getColumnName(i) + "</th>");

            }
            out.print("</tr>");

            /* Printing result */
            while (rs.next()) {
                out.print("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td></tr>");
                result.setRollNo(rs.getInt(1));
                result.setName(rs.getString(2));
                result.setResult(rs.getString(3));
                result.setGrade(rs.getString(4));
                results.add(result);
            }
            
            //We can use it wherever we want, without getting it again from Database.
            //and this will save alot of performance.
            application.setAttribute("results", results);
            out.print("</table>");
            
            out.println("</br>");
            
            out.print("<table width=50% border=2>");
            out.print("<caption>From Application Scope:</caption>");
            ArrayList resultsList = (ArrayList) application.getAttribute("results");

            for (int i = 0; i < resultsList.size(); i++) {
                ResultBean res= (ResultBean)resultsList.get(i);
                out.print("<tr><td>" +res.getRollNo()  + "</td><td>" + res.getName() + "</td><td>" + res.getResult() + "</td><td>" + res.getGrade() + "</td></tr>");
            }
            out.print("</table>");
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            out.close();
        }
    }

}
