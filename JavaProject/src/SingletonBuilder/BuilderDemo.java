package SingletonBuilder;

/**
 * Note: Before going through this Example Kindly see the UML/Component Diagram of it
 * which is located at the design pattern folder itself.
 * 
 * Kindly Maintain this order:
 * 
 * Packing interface
 * CD abstract Class
 * CDType  Abstract Class // No need for it, just branching the tree of inheritance.
 * Company  Abstract Class // No need for it, just branching the tree of inheritance.
 * Samsun Class
 * Sony Class
 * CDBuilder Class
 * BuilderDemo Class
 * 
 * Hence the branching of the tree of an inheritance is called Abstraction.
 * 
 * @author omarhamdy
 */
public class BuilderDemo {

    public static void main(String args[]) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSonyCD();
        cdType2.showItems();
        
        CDType cdType3 = cdBuilder.buildSamsungCD();
        cdType3.showItems();
        
        CDType cdType4= cdBuilder.buildSamsungCD();
        cdType4.showItems();
    }
}
