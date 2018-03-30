
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"></head><body>");
        out.println("<h1>Employees List</h1>");

        HttpSession session = request.getSession();
        String conState = (String) session.getAttribute("conState");
        out.println(conState);
        Connection con = (Connection) session.getAttribute("DBConn");

        List<Emp> list = EmpDao.getAllEmployees(con);

        out.print("<table border='1' width='100%' class=\"table\"");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
        for (Emp e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>" + e.getEmail() + "</td><td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId() + "'>edit</a></td><td><a href='DeleteServlet?id=" + e.getId() + "'>delete</a></td></tr>");
        }
        out.print("</table>");
        out.println("</br>  <div style=\"margin-left:450px\"><h3> If you finished please click finish button</h3>\n"
                + "            <form action=\"FinishServlet\" method=\"get\" >\n"
                + "                <input type=\"submit\" value=\"Finish\" />\n"
                + "            </form>"
                + ("<a href='index.html?uname=admin' class=\"btn btn-info\" role=\"button\">Add New Employee</a>")
                + "        </div>");

        out.println("</body></html>");
        out.close();
    }
}
