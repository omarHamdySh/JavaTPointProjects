/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    // Could be used to set how many seconds to wait
    // in Thread.sleep() below
    // private int startTime; 
    private Stock stock;
    private double price;

    // Will hold reference to the StockGrabber object
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, Stock newStock, double newPrice) {

        // Store the reference to the stockGrabber object so
        // I can make calls to its methods
        this.stockGrabber = stockGrabber;

        // startTime = newStartTime;  Not used to have variable sleep time
        stock = newStock;
        price = newPrice;


    }

/**
 * Let's discuss the duplication of the notification message problem we have at the output,
 * first at all the thread make accessing the same resources available in very close
 * period of time, one of the users (of the resources) has to drop down the lock of the used
 * resource and the other will pick it up, so when this happens the methods will use 
 * the new values, to set a stock new price, and so on.
 * the point is, when this happens simultaneously, the set"stockName"Price() Method,each
 * time it notifies the observers, then we'd synchronized keyword on the update method
 * within the ObserverWithThreading Class(which is decided by the JVM to be used according
 * to Strategy Pattern), we'd added synchronized to avoid the arbitrary Notification printing
 * and also to avoid duplications, but duplications still occurs, and this happens because of
 * the thread accessing the resources simultaneously and there is a need of the printing 
 * the message each time of changing a stock value, but it confronting a very big obstacle 
 * doing the printing at the time the change happens, which is the synchronized keyword
 * functions at the printing method,it postpones the printing, and this will force
 * the notify() method at the StockGrabber Class to use the old values (Stock stock, 
 * double price, double randNum), //(which at this moment the duplication happens)
 * these old values are pertain one of the running processes of the thread but 
 * one of the later processes won't be able to print its notification and it will be dropped 
 * in between,
 * eventually the data will be true for sure, but at the instance the notification 
 * currently at the instance will be not precise too, and this is very big miss
 * if you calculated final added value to the final price at the final adding 
 * process in the outputs Notification messages comparing to the initial values 
 * of the stock you will notice that the results are true, so the conclusion is try to 
 * avoid using threading with observer because, you won't have the control of the instance 
 * Notifications outputs, which will make a disorder in the function of the observer pattern.
 * while the basic function of the observer pattern to have precise instant outputs on
 * what's going on with another object values, so this will Make the Observer pattern useless.
 */
    @Override
    strictfp  public void run() {
        for (int i = 1; i <= 20; i++) {

            try {

                // Sleep for 2 seconds
                Thread.sleep(2000);

                // Use Thread.sleep(startTime * 1000); to 
                // make sleep time variable
            } catch (InterruptedException e) {
            }

            // Generates a random number between -.03 and .03
            double randNum = ((Math.random()*(0.6))-0.3);

            // Formats decimals to 2 places
//            DecimalFormat df = new DecimalFormat("#.##");
            randNum = Double.valueOf(randNum);
            price = Double.valueOf(price);

            ((StockGrabber) stockGrabber).setStock(stock);
            ((StockGrabber) stockGrabber).setPrice(price);
            ((StockGrabber) stockGrabber).setRandNum(randNum);

            // Change the price and then convert it back into a double
            price = price + randNum;

            if ("IBM".equals(stock.getStockName())) {
                ((StockGrabber) stockGrabber).setIBMPrice(price);
            }
            if ("AAPL".equals(stock.getStockName())) {
                ((StockGrabber) stockGrabber).setAAPLPrice(price);
            }
            if ("GOOG".equals(stock.getStockName())) {
                ((StockGrabber) stockGrabber).setGOOGPrice(price);
            }
        }
    }

}
