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
// Has a "Has a" relationship with Pizza. This is an
// Aggregation Relationship
abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    // Assigns the type instance to this attribute
    // of a Pizza
    // All decorators can dynamically customize the Pizza
    // instance PlainPizza because of this
    public ToppingDecorator(Pizza newPizza) {

        tempPizza = newPizza;

    }

     @Override
    public String getDescription() {

        return tempPizza.getDescription();

    }

    @Override
    public double getCost() {

        return tempPizza.getCost();

    }

}
