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
// Represents each Observer that is monitoring changes in the subject

public class StockObserver {
	
	protected double ibmPrice;
	protected double aaplPrice;
	protected double googPrice;
	
	// Static used as a counter
	
	protected static int observerIDTracker = 0;
	
	// Used to track the observers
	
	protected int observerID;
	
	// Will hold reference to the StockGrabber object
	
	protected Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		
		// Store the reference to the stockGrabber object so
		// I can make calls to its methods
		
		this.stockGrabber = stockGrabber;
		
		// Assign an observer ID and increment the static counter
		
		this.observerID = ++observerIDTracker;
		
		// Message notifies user of new observer
		
		System.out.println("New Observer " + this.observerID);
		

		
		
	}

	

	
}