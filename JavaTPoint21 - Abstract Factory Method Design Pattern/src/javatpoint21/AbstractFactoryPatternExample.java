package javatpoint21;

import factory.AbstractFactory;
import factory.FactoryCreator;
import factory.bank.Bank;
import factory.loan.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Abstract Factory Method Design Pattern.
 */
public class AbstractFactoryPatternExample {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.print("\nEnter the type of loan e.g. home loan or business loan or education loan : ");
        String loanName = br.readLine();

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);

        System.out.print("\nEnter the interest rate for " + bank.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("\nEnter the loan amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.print("\nEnter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.println("\nYou are taking a '" + loanName + "' loan from '" + bank.getBankName() + "'");
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
