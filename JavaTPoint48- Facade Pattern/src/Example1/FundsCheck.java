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
public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if (cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());

    }

}
