
import javax.servlet.*;
//import java.sql.*;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
//		
//		String query="create table emp32(id number(10),name varchar2(40))";
//		PreparedStatement ps=con.prepareStatement(query);
//		ps.executeUpdate();
//		
//		System.out.println(query);
            ServletContext servletContext = event.getServletContext();
            servletContext.setAttribute("Welcome Message", "Ahlam Beek ya 7amada");
            System.out.print("The application scope is created and ready to be used.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("project undeployed");

    }
}
