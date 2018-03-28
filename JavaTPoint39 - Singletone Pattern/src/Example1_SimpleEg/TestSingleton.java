/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1_SimpleEg;

/**
 *
 * @author omarhamdy
 */
public class TestSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SharedResource sh1= SharedResource.getInstance();
        
        SharedResource sh2=SharedResource.getInstance();
        
        System.out.println(sh1==sh2);
        
    }
    
}
