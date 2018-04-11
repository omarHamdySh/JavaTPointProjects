/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websiteName.ListenerPackageName;

import DBProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application Life cycle listener.
 * 
 * Case study: because of the flexibility nature of the session especially when at destroy()
 * its risky to depend on it on critical issues at the sessionDestroyed() method, so we will
 * use Session attribute listener to watch the event of the removing or replacing the 
 * the attribute which is the connection object.
 *
 * @author omarhamdy
 */
public class DBConnListener implements HttpSessionListener {

    Connection con = null;
    HttpSession session = null;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        session = se.getSession();
        try {
           
            con = ConnectionProvider.getCon();
            session.setAttribute("DBConn", con);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.setAttribute("conState", "<Script>alert(\"Session Listener:DB connection couldn't be created, there are a problem in the connection.\");</Script>");

        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
//        try {
//            con.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//
//        }

//        session.setAttribute("conState", "alert(\"<Script>DB connection is closed successfuly.</Script>\");");
//        session.setAttribute("conState", "alert(\"<Script>Error Occured while closeing DB connection.</Script>\");");
    }

}
