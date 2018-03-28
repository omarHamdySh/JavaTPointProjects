/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exmaple2_MultiThreadingSingletone;

import Example1_SimpleEg.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omarhamdy
 */
public class SharedResource {

    private static SharedResource sharedResource = null;
    
    private String warPlan;

    private SharedResource() {
    }
    /**
     * 
     * Here we are using Synchronized Block instead of using Synchronized Method,
     * Because its been proofed that its faster, any ways Synchronized keyword push
     * the program executing to be slower because with the synchronized method
     * the object that will attempt to use a this method will be forced to wait the other
     * object that is using it currently to finish using the resource itself and drop 
     * its lock to pick it up, but when using with using Synchronized block it will wait
     * just a specific piece of code not the entire method, as we know so at the moment.
     * @return 
     */
    public static SharedResource getInstance() {

        if (sharedResource == null) {
            
            Thread.currentThread();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SharedResource.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            synchronized (SharedResource.class) {
                if (sharedResource == null) {
                    sharedResource = new SharedResource();
                }
            }
        }
        return sharedResource;
    }

    public String getWarPlan() {
        return warPlan;
    }

    public void setWarPlan(String warPlan) {
        this.warPlan = warPlan;
    }
    
}
