/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRefactoringTut;

import java.beans.Expression;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author omarhamdy
 */
public class JavaRefactoringMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create pop up window that asks for a question
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String name = JOptionPane.showInputDialog(frame, "What is your name?");

        String setterMethodName = "setName";
        String getterMethodName = "getName";

        try {

            // Get class based on the from conversion string
            Class tempClass = Class.forName(new String("javaproject.Human"));

            // Get the constructor dynamically for using the Class object that used string
            // value to get the class itself.
            Constructor con = tempClass.getConstructor();

            // Create a new instance of the class.
            Object HumanClass = con.newInstance();

            // Define the method parameters expected by the method that
            // will convert to your chosen unit of measure
            Class[] parameterDataType = new Class[]{String.class};

            // Get the method dynamically that will be needed to convert
            // into your chosen unit of measure
            /**
             * here as we learned earlier the binding depends on the method
             * signature; so the getMethod() method takes two parameters: 1st:
             * Method name; 2nd: Parameter DataType; method signature:
             * methodName + parameterDataType
             */
            Method setterMethod = tempClass.getMethod(setterMethodName, parameterDataType);

            // Define & Encapsulate the method's parameters values inside Object Array.
            Object[] params = new Object[]{name};

            //Invoke the setter method with the class object and the parameter value.
            setterMethod.invoke(HumanClass, params);
            
            //getting the second method from the class by passing just the MethodName.
            //because it takes no parameter then no need for passing parameterDataType.
            Method getterName = tempClass.getMethod(getterMethodName);
            
            //Invoke the getter method to retrieve the value we just set to make sure
            //that everything doing great.
            String returnedName = (String) getterName.invoke(HumanClass);

            JOptionPane.showMessageDialog(null, returnedName);

            // Closes the frame after OK is clicked
            frame.dispose();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
