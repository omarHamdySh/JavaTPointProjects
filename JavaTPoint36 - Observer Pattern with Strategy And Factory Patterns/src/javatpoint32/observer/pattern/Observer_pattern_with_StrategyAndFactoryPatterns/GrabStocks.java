/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

import java.util.Scanner;

/**
 * Kindly Maintain this Order: 
 * 
 * Factory Pattern: AKA (Stocks Factory)
 * - Stock class
 * - IBM_Stock class
 * - AAPL_Stock class 
 * - GOOG_Stock class
 * - StockFactory Class
 *
 * Strategy Pattern: AKA (Observing Strategy Determiner)
 * - Observer Interface 
 * - ObserverWithoutThreading Class
 * - ObserverWithThreading Class
 *
 * Observer Pattern: AKA (Multi-Threading Observer)
 * - Subject Interface 
 * - StockGrabber Class 
 * - StockObserver Class 
 * - Main Method (stop at the beginning of the threading part) 
 * - GetTheStock Class 
 * - Main Method (start from the Threading Part)
 *
 * We took the chance of the existence of the threads here to make branching in
 * the behavior of the update method in the Observer interface using "Strategy
 * pattern", there are two ways to implement the update() method: 1st: is to
 * print out all the stock values once a change happens to any of it, this
 * happens if we aren't using the threads with observer pattern. 2nd:if we are
 * using threads with observer pattern, the implementation of the update()
 * method will be as the following: each change will lead to one notification
 * with the change that occurred for the just the current changed stock price
 * (unfortunately because of threads this didn't happen).
 *
 * We used "FactoryPattern" to hide stock types classes (IBM,) from the user
 * when he intend to Observe change of any, we gave him a bunch of choice to choose from
 * weather he wants to observe (IBM-APPLE-GOOLE-ALL of them) when he chooses
 * the factory pattern to the magic and apply polymorphism on each single choice he do,
 * but when using the choice of "all the above", all of it are initialized and used,
 * which is not to much the behavior of the factory pattern.
 *
 * Note: as we discussed before the Notification Messages duplication problem
 * because of using the threading with the observer pattern, but it won't happen
 * any duplication if the user decided to choose to observe just one stock 
 * at the threading part.
 *
 */
public class GrabStocks {

    public static void main(String[] args) {

        /**
         * the up coming part will make the user able to observe and get notified
         * with all the prices of all stocks if any of it got changed.
         * and thus we can see only the observer pattern application and behavior,
         * despite that the other two patterns (Factory and Strategy patterns)
         * are not applied to this part, we won't see their effect here,
         * but will see it later on at the threading part.
         */
        // Create the Subject object
        // It will handle updating all observers 
        // as well as deleting and adding them
        Stock stock;
       
        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject
        Observer observer1 = new ObserverWithoutThreading(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        Observer observer2 = new ObserverWithoutThreading(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(1000.60);
        stockGrabber.setGOOGPrice(2000.40);

        // Delete one of the observers
        // stockGrabber.unregister(observer2);
        stockGrabber.setIBMPrice(500.00);
        stockGrabber.setAAPLPrice(750.60);
        stockGrabber.setGOOGPrice(340.40);

        System.out.println("_____________________________");
        /*
        *Frist We will remove the Observer who can't deal perfectly with the 
        * MultiThreading stock Changing.
         */
        stockGrabber.unregister(observer1);
        stockGrabber.unregister(observer2);

        System.out.println("Observers with Threading");
//        StockGrabber stockGrabber1 = new StockGrabber();

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste 
        // its one extendable class option 
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Indicate the stockes you want to observe:\n"
                + "Choose from the next options:\n"
                + "IBM Stocks -> 1\n"
                + "Apple Stocks -> 2\n"
                + "Google Stocks ->3\n"
                + "All the above ->4");
        System.out.print("Enter your Choice: ...");
        int choice = Integer.parseInt(scn.next());
        System.out.println("");
        
        if(choice!=4){
        //factory pattern who decides which stock to be observed according to the user input
            stock = new StockFactory().getStockToObserve(choice);
            stock.observeStock(stockGrabber);
        }
        else {
            observeAll(stockGrabber);
        }
   
    }

    public static void observeAll(StockGrabber stockGrabber) {
        System.err.println("Notice a duplication will happen somewhere in the following results"
                + " but the final results are true!");
        System.out.println("Initial stock values: \nIBM: " + 197.00 + "\nAAPL: "
                + 477.60 + "\nGOOG: " + 776.40 + "\n");

        StockObserver observerWithThread1 = new ObserverWithThreading(stockGrabber);
        
        Runnable getIBM = new GetTheStock(stockGrabber, 2, new IBM_Stock(), 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, new AAPL_Stock(), 477.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, new GOOG_Stock(), 776.40);

        // Call for the code in run to execute 
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }





}
