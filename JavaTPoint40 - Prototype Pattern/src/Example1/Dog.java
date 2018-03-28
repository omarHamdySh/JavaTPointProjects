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
public class Dog implements Animal {

    public Dog() {
        System.out.println("A dog is Created.");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Dog is bieng Created.");

        Dog dog=null;
        
        try {
            dog= (Dog) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dog;
    }

    public String toString(){
    return "This object is an object of a type Dog";
    }
}
