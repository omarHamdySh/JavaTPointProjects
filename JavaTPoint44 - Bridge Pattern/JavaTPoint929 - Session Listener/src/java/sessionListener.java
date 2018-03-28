
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Web application lifecycle listener.
 *
 * @author omarhamdy
 */
public class sessionListener implements HttpSessionListener {

    ServletContext ctx=null;
    //HttpSession stx = null;
    static int total = 0, current = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        total++;
        current++;
        
        //stx = se.getSession();
        ctx= se.getSession().getServletContext();
        /**
         * You could declare and initialize the session object as following:
         *
         * class data member: HttpSession ctx;
         *
         * method: ctx=se.getSession();
         *
         */
        ctx.setAttribute("totalUsers", total);
        ctx.setAttribute("currentUsers", current);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        current--;
        ctx.setAttribute("currentUsers", current);

    }
}
