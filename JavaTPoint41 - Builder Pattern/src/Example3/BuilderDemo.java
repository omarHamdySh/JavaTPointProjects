package Example3;


import java.io.IOException;

/**
 * Note: Before going through this Example Kindly see the UML/Component Diagram of it
 * which is located at the design pattern folder itself.
 * 
 * Kindly Maintain this order:
 * 
 * Item interface
 * OrderItems class
 * OrderBuilder class
 * BuilderDemo class
 *
 * Note: This Example3 has almost the same architecture of the Example2
 * But the only difference that there are more complication by having much more levels
 * of abstraction, so need to go through each class in the Example, just see some of it,
 * like:
 * 
 * Pizza abstract class
 * SmallCheesPizza
 * LargeCheesePizza
 * XLargeCheesePizza
 * 
 * Then you can predict what the other classes have or look like.
 * @author Ashwani
 */
public class BuilderDemo {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        OrderBuilder builder=new OrderBuilder();
        
        OrderedItems orderedItems=builder.preparePizza();
        
        orderedItems.showItems();
        
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
        
    }
}
