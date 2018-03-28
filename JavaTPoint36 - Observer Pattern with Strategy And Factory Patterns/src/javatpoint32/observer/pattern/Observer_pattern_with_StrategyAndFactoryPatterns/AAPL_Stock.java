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
public class AAPL_Stock extends Stock {

    public AAPL_Stock() {
        this.setStockName("APPLE");
                
    }

    @Override
    public void observeStock(StockGrabber stockGrabber) {
        System.out.println("Initial stock value: \nAAPL: "
                + 477.60);

        StockObserver observerWithThread1 = new ObserverWithThreading(stockGrabber);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, new AAPL_Stock(), 477.60);

        // Call for the code in run to execute 
        new Thread(getAAPL).start();

    }
}
