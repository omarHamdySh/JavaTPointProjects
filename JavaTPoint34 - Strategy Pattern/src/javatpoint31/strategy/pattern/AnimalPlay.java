/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint31.strategy.pattern;

/**
 *
 * @author omarhamdy
 */
public class AnimalPlay {

    public static void main(String args[]) {
        Animal sparky = new Dog();
        System.out.println("sparky says: " + sparky.tryToFly());

        sparky.setFlyAbility(new ItFlys());
        System.out.println("sparky says: " + sparky.tryToFly());
       
        
        Animal tweety = new Bird();
        System.out.println("tweety says: " + tweety.tryToFly());


    }

}
