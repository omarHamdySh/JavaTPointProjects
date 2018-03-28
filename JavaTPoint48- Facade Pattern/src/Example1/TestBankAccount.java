/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Kindly maintain this order:
 *
 * WelcomeToBank class; 
 * AccountNumberCheck class; 
 * SecurityCodeCheck class;
 * FundsCheck class; 
 * BankAccountFacade class; 
 * TestBankAccount class;
 *
 * @author omarhamdy
 */
public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

    }

}
