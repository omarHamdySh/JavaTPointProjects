/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Kindly maintain this order:
 * Expression abstract class;
 * Gallons class;
 * Quarts class;
 * Pints class;
 * ConversionContext class;
 * MeasurementConversion class;
 * 
 * Note: <*Interpreter pattern here is not implemented alon factory pattern is used too*>
 * @author omarhamdy
 */
import java.beans.Expression;
import java.lang.reflect.*;

import javax.swing.*;

public class MeasurementConversion {

    public static void main(String[] args) {

        // Create pop up window that asks for a question
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String questionAsked = JOptionPane.showInputDialog(frame, "Enter values to convert\n"
                + "From/to Gallons,Quarts,Pints,Cups and tablespoons(write down names precisely)"," From/to ");

        // Add the question to the context for analysis
        ConversionContext question = new ConversionContext(questionAsked);

        //Getting class name of unit to be converted from.
        String fromConversion = question.getFromConversion();
        
        //Getting class name of unit to be converted to.
        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try {

            // Get class based on the from conversion string, Hence package name="Example1"
            Class tempClass = Class.forName("Example1."+fromConversion);

            // Get the constructor dynamically for the conversion string
            Constructor con = tempClass.getConstructor();

            // Create a new instance of the object you want to convert from
            Object convertFrom = con.newInstance();

            // Define the method parameters expected by the method that
            // will convert to your chosen unit of measure
            Class[] methodParams = new Class[]{Double.TYPE};

            // Get the method dynamically that will be needed to convert
            // into your chosen unit of measure
            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

            // Define the method parameters that will be passed to the above method
            Object[] params = new Object[]{new Double(quantity)};

            // Get the quantity after the conversion
            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            // Print the results
            String answerToQues = question.getResponse()
                    + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQues);

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
