
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        HttpSession session = request.getSession();
        String conState = (String) session.getAttribute("conState");
        //out.println(conState);
        Connection con = (Connection) session.getAttribute("DBConn");

        EmpDao.delete(id, con);
        response.sendRedirect("ViewServlet");
    }
}
