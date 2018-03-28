/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Kindly have a look first on the class named Human and then come back to see
 * the magic.
 *
 * @author omarhamdy
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data="";
        try {
            //        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HRDep", "root", "");

            con.close();

            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            System.out.println("Not Connected");
            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Not Connected");
            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
        }
//            data = (String) Toolkit.getDefaultToolkit()
//                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
//        } catch (UnsupportedFlavorException ex) {
//            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(data);
    }

    public JavaProject() {
    }
   
    

}
