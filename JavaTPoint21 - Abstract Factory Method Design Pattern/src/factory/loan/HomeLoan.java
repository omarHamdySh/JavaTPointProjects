package factory.loan;

/**
 *
 * @author abdo_
 */
public class HomeLoan extends Loan {

    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
