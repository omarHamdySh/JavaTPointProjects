/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exmaple2_MultiThreadingSingletone;

/**
 *
 * @author omarhamdy
 */
public class User2 implements Runnable{

    @Override
    public void run() {
        SharedResource sh= SharedResource.getInstance();
        System.out.println("User2 Shared Resource Object: "+sh.hashCode());
        System.out.println("I will display the plan: \n"+sh.getWarPlan());
        
    }
    
}
