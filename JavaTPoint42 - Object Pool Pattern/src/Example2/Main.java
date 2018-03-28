/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 * Kindly Maintain this Order:
 * PooledObject class;
 * ObjectPool class;
 * Client1 class;
 * Client2 class;
 * Client3 class;
 * Main class;
 * 
 * @author omarhamdy
 */
public class Main {
    
    public static void main(String args[]){
    
        Client1 c1= new Client1();
        c1.whatObjectYouUse();
        
        Client2 c2= new Client2();
        c2.whatObjectYouUse();
        
        Client3 c3 = new Client3();
        c3.whatObjectYouUse();
        
    }
}
