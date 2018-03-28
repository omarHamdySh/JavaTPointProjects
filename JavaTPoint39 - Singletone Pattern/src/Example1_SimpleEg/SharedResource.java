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
public class SharedResource {

    private static SharedResource sharedResource = null;

    private SharedResource() {
    }

    public static SharedResource getInstance() {

        if (sharedResource == null) {
            
            synchronized (SharedResource.class) {
                if (sharedResource == null) {
                    sharedResource = new SharedResource();
                }
            }
        }
        return sharedResource;
    }
}
