/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

/**
 *
 * @author omarhamdy
 */
public class ObserverWithoutThreading extends StockObserver implements Observer {

    public ObserverWithoutThreading(Subject stockGrabber) {
        super(stockGrabber);

        // Add the observer to the Subjects ArrayList
        stockGrabber.register(this);

    }

    // Called to update all observers
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice, Stock stock, double price, double randNum, int observerNum) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    public void printThePrices() {

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: "
                + aaplPrice + "\nGOOG: " + googPrice + "\n");

    }

}
