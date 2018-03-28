/*

*/
package javatpoint31.strategy.pattern;

public interface Fly {
    
    String fly();
    
}

class ItFlys implements Fly
{


    public String fly() {
        
        return "I'm flying high ";
    }

}

class CantFly implements Fly
{


    public String fly() {
        
        return "I can't Fly";
    }
    
    
    

}

