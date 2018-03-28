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
// In this situation the proxy both creates and destroys
// an ATMMachine Object
public class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the 
    // Object ATMMachine
    public ATMState getATMState() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine 
    // in the Object ATMMachine
    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getCashInMachine();

    }

} 
