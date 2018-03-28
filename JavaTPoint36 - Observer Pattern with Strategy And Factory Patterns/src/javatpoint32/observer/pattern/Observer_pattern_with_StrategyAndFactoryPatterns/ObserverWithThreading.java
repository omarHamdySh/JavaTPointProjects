/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

import java.text.DecimalFormat;

/**
 *
 * @author omarhamdy
 */
public class ObserverWithThreading extends StockObserver implements Observer {

    private int changeCounter = 0;

    public ObserverWithThreading(Subject stockGrabber) {
        super(stockGrabber);

        // Add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    /**
     * the next Implementation of the update() Method will just be applied once
     * at a time When a change occurs for one of the stocks.
     *
     * there are the two purposes of using synchronized here.
     * 
     * 1st: off course its synchronized to be executed in order when a change occur
     * to a stock, if we removed synchronized keyword here, the actions will be
     * printed in arbitrary order, you must understand that synchronized is not
     * affecting anything of the life cycle of this whole project but the printing of
     * the changes, also it doesn't prevent the duplication of printing the changes,
     * but its better than without using it.
     * 
     * Note that using threads with observer pattern is not recommended, firstly because it
     * adds more complexity which is very hard to maintain  and secondly is that
     * no need for it because the observer pattern itself can do the job perfectly.
     * 
     *
     * 2nd: because without it the Notification will be printed as much as the numbers of
     * the stocks, but when using it, it minimize the duplication number, the problem is
     * discussed at the getTheStock Class before the run() method,avoid using 
     * threads with observer pattern as much as you can.
     * 
     */
    @Override
    synchronized public void update(double ibmPrice, double applPrice, double gglePrice, Stock stock, double price, double randNum,int observerNum) {

        changeCounter++;

        DecimalFormat df = new DecimalFormat("#.##");
       
        System.out.println("\n----------- Notification Number: " + changeCounter + " Observer Number: "+observerNum+" -----------");

        System.out.println(stock.getStockName() + ": " + (df.format(price+randNum))
                + " " + (randNum > 0 ? "+" : "") +df.format(randNum));

        System.out.println("------------------------------------\n");

    }

}
