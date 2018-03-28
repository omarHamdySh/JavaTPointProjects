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
public class GOOG_Stock extends Stock {

    public GOOG_Stock() {
        this.setStockName("GOOG");
    }

    @Override
    public void observeStock(StockGrabber stockGrabber) {
        System.out.println("Initial stock values:\nGOOG: " + 776.40 + "\n");

        StockObserver observerWithThread1 = new ObserverWithThreading(stockGrabber);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, new GOOG_Stock(), 776.40);

        // Call for the code in run to execute 
        new Thread(getGOOG).start();
    }
}
