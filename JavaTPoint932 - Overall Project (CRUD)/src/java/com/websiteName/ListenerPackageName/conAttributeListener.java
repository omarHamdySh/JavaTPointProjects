/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websiteName.ListenerPackageName;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Web application lifecycle listener.
 *
 * @author omarhamdy
 */
public class conAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String attributeName = event.getName();
        if (attributeName.equalsIgnoreCase("DBConn")) {
            session.setAttribute("conState", "<Script>alert(\"Session Attribute Listener:DB connection is ready to be used.\");</Script>");

        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String attributeName = event.getName();
        if (attributeName.equalsIgnoreCase("DBConn")) {
            try {
                Connection con = (Connection) event.getValue();
                con.close();
                session.setAttribute("conState", "<Script>alert(\"Session Attribute Listener: DB connection is closed successfuly.\");</Script>");
                session.setAttribute("conStateBool", true);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                session.setAttribute("conState", "<Script>alert(\"Session Attribute Listener: Error Occured while closeing DB connection.\");</Script>");
                session.setAttribute("conStateBool", false);

            }
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    }
}
