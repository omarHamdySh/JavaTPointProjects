/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern;

import java.util.Scanner;

/**
 *Kindly Maintain this Order:
 * Subject Interface
 * Observer Interface
 * StockGrabber Class
 * StockObserver Class
 * Main Method (stop at the beginning of the threading part)
 * getTheStock Class
 * Main Method (start from the Threading Part) 
 * 
 */
public class GrabStocks {

    public static void main(String[] args) {

        // Create the Subject object
        // It will handle updating all observers 
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        // Delete one of the observers
        // stockGrabber.unregister(observer2);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40); 
        
        
        
        
        /**
         * Threading Part:
         * Note that you won't fully understand the difference between using the threading
         * the part at this project, the next project you will see the difference.
         * Next Project: Observer Pattern with factory and Strategy patterns
         *
         */
        
        System.out.println("_____________________________");
        System.out.println("Observers with Threading ");
//        StockGrabber stockGrabber1 = new StockGrabber();
        
        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste 
        // its one extendable class option

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

        // Call for the code in run to execute 
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();

    }

}
