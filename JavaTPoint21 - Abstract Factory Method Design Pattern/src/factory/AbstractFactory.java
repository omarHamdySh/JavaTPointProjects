package factory;

import factory.loan.Loan;
import factory.bank.Bank;

/**
 *
 * @author abdo_
 */
public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
