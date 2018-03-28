/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
// Implements the Pizza interface with only the required
// methods from the interface
// Every Pizza made will start as a PlainPizza
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {

        return "Thin dough";

    }

    @Override
    public double getCost() {

        System.out.println("Cost of Dough: " + 4.00);

        return 4.00;

    }

}
