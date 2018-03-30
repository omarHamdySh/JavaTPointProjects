
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        //EmpDao ed= new EmpDao();
        Emp e = new Emp();
        e.setName(name);
        e.setPassword(password);
        e.setEmail(email);
        e.setCountry(country);

        HttpSession session = request.getSession();
        String conState = (String) session.getAttribute("conState");
        out.println(conState);
        Connection con = (Connection) session.getAttribute("DBConn");
        int status = EmpDao.save(e,con);
        if (status > 0) {
            out.print("<p>Record saved successfully!</p>");
            request.getRequestDispatcher("index.html").include(request, response);
        } else {
            out.println("Sorry! unable to save record");
        }

        out.close();
    }

}
