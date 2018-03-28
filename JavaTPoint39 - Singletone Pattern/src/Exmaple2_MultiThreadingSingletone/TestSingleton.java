/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exmaple2_MultiThreadingSingletone;

import Example1_SimpleEg.*;

/**
 *
 * @author omarhamdy
 */
public class TestSingleton {

    /**
     * The reason we use Singleton pattern with threading is to share the same object
     * that holds the same data between different objects at specific domain of code or
     * program, suppose you want to share the same plan to be accessed by generals within
     * the same army, one of the generals will put the plan, all the other can see it or 
     * even change its values if its allowed.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User1 u1= new User1();
        User2 u2= new User2();
        
        new Thread(u1).start();
        new Thread(u2).start();
        
    }
    
}
