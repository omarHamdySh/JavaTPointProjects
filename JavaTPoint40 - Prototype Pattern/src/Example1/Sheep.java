/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omarhamdy
 */
public class Sheep implements Animal {

    public Sheep(){
        System.out.println("A sheep is made.");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made.");
        Sheep sheep=null;
        
        try {
            sheep= (Sheep) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sheep;
    }
    
    public String toString(){
        return "This object is an object of type sheep";
    }
    
}
