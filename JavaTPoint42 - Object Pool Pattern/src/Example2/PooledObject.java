/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author omarhamdy
 */
public class PooledObject {
    public String objectName;
    public static int objectsCounter=0;
    private static PooledObject pooledObject=null;
    
    public PooledObject(){
        objectName="Object "+objectsCounter;
    }
    
    public static PooledObject getPooledObjInstance(ObjectPool objPool){
        
        if (objPool instanceof ObjectPool)
        {
            pooledObject= new PooledObject();
        }
        return pooledObject;
    }
    
    
    
}
