/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exampl1;

/**
 *
 * @author omarhamdy
 */
// The chain of responsibility pattern has a 
// group of objects that are expected to between
// them be able to solve a problem. 
// If the first Object can't solve it, it passes
// the data to the next Object in the chain
public interface Chain {

    // Defines the next Object to receive the data
    // if this Object can't process it
    public void setNextChain(Chain nextChain);

    // Either solves the problem or passes the data
    // to the next Object in the chain
    public void calculate(Numbers request);

}
