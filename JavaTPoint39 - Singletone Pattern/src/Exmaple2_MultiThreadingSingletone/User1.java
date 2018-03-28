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
public class User1 implements Runnable{

    @Override
    public void run() {
        SharedResource sh= SharedResource.getInstance();
        System.out.println("User1 Shared Resource Object: "+sh.hashCode());
        System.out.println("I will set the war plan: ");
        sh.setWarPlan("We will attack in advance using 3asf Ma2kol plan as a plan A \n"
                + "and Nisr plan as a plan B");
        System.out.println(sh.getWarPlan());
    }
    
}
