/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern;

// This interface handles adding, deleting and updating
// all observers 

public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}
