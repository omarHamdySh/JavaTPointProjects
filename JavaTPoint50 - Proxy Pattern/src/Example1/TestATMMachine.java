/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Kindly Maintain This order:
 * GetATMData interface;
 * ATMState interface;
 * ATMMachine class;
 * ATMProxy class;
 * TestATMMachine class;
 *
 * @author omarhamdy
 */
public class TestATMMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        //atmMachine.insertCard();

        atmMachine.insertPin(1991);

        //atmMachine.requestCash(2000);

        //atmMachine.insertCard();

        //atmMachine.insertPin(1234);

        // NEW STUFF : Proxy Design Pattern Code
        // The interface(getATMData) limits access to just the methods you want
        // made accessible
        GetATMData realATMMachine = new ATMMachine();

        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());

        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());

        // The user can't perform this action because ATMProxy doesn't
        // have access to that potentially harmful method
        // atmProxy.setCashInMachine(10000);
        atmMachine.ejectCard();

    }

}
