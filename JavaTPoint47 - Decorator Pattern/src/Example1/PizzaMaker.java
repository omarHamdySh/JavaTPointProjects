/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Kindly Maintain this order:
 *
 * Pizza interface; 
 * ThreeCheesePizza class; 
 * PlainPizza class;
 * ToppingDecorator abstract class;
 * Mozzarella class;
 * TomatoSauce class;
 * PizzaMaker class;
 *
 *
 * @author omarhamdy
 */
public class PizzaMaker {

    public static void main(String[] args) {

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }

}
