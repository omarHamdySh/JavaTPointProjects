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
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
