/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint45.flyweightpattern;

/**
 * Kindly maintain this order:
 * 
 *
 * @author omarhamdy
 */

// The Flyweight design pattern is used when you need to
// create a large number of similar objects
// To reduce memory this pattern shares Objects that are 
// the same rather than creating new ones
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyWeightTest extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 1000;

    // A new rectangle is created only if a new color is needed
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
        Color.blue, Color.pink, Color.cyan, Color.magenta,
        Color.black, Color.gray};

    public static void main(String[] args) {

        new FlyWeightTest();

    }

    public FlyWeightTest() {

        // Create the frame, position it and handle closing it
        this.setSize(windowWidth, windowHeight);
        
        //set the rectangle location to the center of the screen.
        this.setLocationRelativeTo(null);
        //Exit On Close button clicked
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the title of the Frame.
        this.setTitle("Flyweight Test");
        

        //Creating a Panal, to hold sub panels and buttons.
        JPanel contentPane = new JPanel();

        //setting panel layout to border layout.
        contentPane.setLayout(new BorderLayout());
        //Creating a sub panel to hold the rectangles will be drawn.
        final JPanel drawingPanel = new JPanel();

        //Instantiating the button givin it a Text value.
        startDrawing = new JButton("Draw stuff");
        //adding the sub panel to the main panel; giving it the position at the center.
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        //adding the button to the main panel and giving it the position at the bottom.
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        //Implementing the on Action event for the button using Anonymous inner class.
        startDrawing.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; ++i) {

                    // 
                    // Uses rectangles stored in the HashMap to
                    // speed up the program
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(),
                            getRandX(), getRandY());

                    // 
                    /*
	            	MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
	            	rect.draw(g);
                     */
                    // 
                    /*
	            	g.setColor(getRandColor());
	            	g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
                     */
                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime) + " milliseconds");

            }
        });

        this.add(contentPane);

        this.setVisible(true);

    }

    // Picks random x & y coordinates
    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    // Picks a random Color from the 9 available
    private Color getRandColor() {
        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];

    }

}
