/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private Stock stock;
    private double price;
    private double randNum;

    public StockGrabber() {

        // Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        // Adds a new observer to the ArrayList
        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {

        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex + 1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);

    }

     public void notifyObserver() {

        /* Cycle through all observers and notifies them of prices changes
        this means it will notify all the observers.
        */
        for (Observer observer : observers) {
            int observerIndex= observers.indexOf(observer);
            observer.update(ibmPrice, aaplPrice, googPrice, stock, price, randNum,(observerIndex+1) );
            System.out.println("Total observers Number: "+observers.size());
        }
        
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice) {

        this.ibmPrice = newIBMPrice;

        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice) {

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice) {

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRandNum(double randNum) {
        this.randNum = randNum;
    }

}
