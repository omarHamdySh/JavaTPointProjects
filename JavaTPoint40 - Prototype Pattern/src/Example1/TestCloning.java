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
public class TestCloning {

    /**
     * Kindly Maintain This Order:
     * Animal interface
     * Sheep Class
     * Dog Class
     * CloneFactory class
     * TestClone class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CloneFactory cloneFactory= new CloneFactory();
        
        Sheep sheep= new Sheep();
        Animal identicalSheep=cloneFactory.getClone(sheep);
           
        System.out.println(sheep);
        
        System.out.println(identicalSheep);
        
        System.out.println("Sheep: "+ System.identityHashCode(System.identityHashCode(sheep)));
        
        System.out.println("identical Sheep: "+ System.identityHashCode(System.identityHashCode(identicalSheep)));

    }
    
}
