/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
// Blueprint for classes that will have decorators
public interface Pizza {

    public String getDescription();

    public double getCost();

}


/* 
public abstract class Pizza{

	
	public abstract void setDescription(String newDescription);
	public abstract String getDescription();
	
	public abstract void setCost(double newCost);
	public abstract double getCost();
	
	// I could use getter and setter methods for every 
	// potential Pizza topping
	
}
 */
