/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint31.strategy.pattern;


/**
 *
 * @author omarhamdy
 */
public class Bird extends Animal {
    
    public Bird()
    {
        super();
        setSound("Tweet");
        flyingType= new ItFlys();
        
        
    
    }
    
}
