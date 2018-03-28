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
public class ATMMachine implements GetATMData, ATMState {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;
    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.atmState = this;
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    // NEW STUFF
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }

    @Override
    public void insertPin(int i) {
        if (i == 1991) {
            correctPinEntered = true;
            System.out.println("You've Entered correct Pin, Welcome back.");
        } else {
            System.out.println("You've Entered incorrect Pin, Please Try Again!!");
        }
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted Pleas Insert Your Pin:");
    }

    @Override
    public void requestCash(int i) {

    }

    @Override
    public void ejectCard() {
        System.out.println("Thanks for using our services, happy to help you :)");
    }
}
