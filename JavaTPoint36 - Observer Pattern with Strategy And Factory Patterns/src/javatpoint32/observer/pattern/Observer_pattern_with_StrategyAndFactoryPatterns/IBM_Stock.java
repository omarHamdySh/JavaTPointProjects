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
public class IBM_Stock extends Stock{
    
public IBM_Stock(){
    this.setStockName("IBM");
}


    @Override
    public void observeStock(StockGrabber stockGrabber) {
        
        System.out.println("Initial stock value: \nIBM: " + 197.00  );

        StockObserver observerWithThread1 = new ObserverWithThreading(stockGrabber);
        Runnable getIBM = new GetTheStock(stockGrabber, 2, new IBM_Stock(), 197.00);
        
        StockObserver observerWithThread2= new ObserverWithThreading(stockGrabber);
        
        // Call for the code in run to execute 
        new Thread(getIBM).start();

    }
    

    
}
