/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint45.flyweightpattern;

/**
 *
 * @author omarhamdy
 */
import java.awt.*;

public class MyRect {
   //Declaring and Instantiating Internsic state Variable
   private Color color = Color.black;
   
   private int x, y, x2, y2;
   
   public MyRect(Color color) {
	   
	   this.color = color;
	   
   }
   
   public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
	      g.setColor(color);
	      g.fillRect(upperX, upperY, lowerX, lowerY);
   }
   
   /* Original forces creation of a rectangle every time
     
   public MyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
      this.color = color;
      this.x = upperX;   
      this.y = upperY;
      this.x2 = lowerX; 
      this.y2 = lowerY;
   }
   
   public void draw(Graphics g) {
      g.setColor(color);
      g.fillRect(x, y, x2, y2);
   }
   */
}
