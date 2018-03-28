/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author omarhamdy
 */
public class ObjectPool {

    ArrayList<PooledObject> free = new ArrayList<PooledObject>();
    ArrayList<PooledObject> used = new ArrayList<PooledObject>();

    private static ObjectPool objectPool = null;

    private ObjectPool() {
    }

    public static ObjectPool getObjPoolInstance() {
        if (objectPool == null) {

            synchronized (ObjectPool.class) {
                if (objectPool == null) {
                    objectPool = new ObjectPool();
                }
            }
        }
        return objectPool;
    }

    public PooledObject getPoolObject() {
        PooledObject pooledObject = null;
        if (free.isEmpty()) {
            if (used.isEmpty() && PooledObject.objectsCounter < 2 ) {

                pooledObject = new PooledObject();
                free.add(pooledObject);
                PooledObject.objectsCounter++;
            
            } else if ((!used.isEmpty()) && PooledObject.objectsCounter == 2) {
                if(used.get(0)!=null){
                pooledObject = used.get(0);
                }else 
                {
                    pooledObject = used.get(1);
                }
                used.remove(pooledObject);
                free.add(pooledObject);

            }else if ((!used.isEmpty()) && (PooledObject.objectsCounter < 2)){
        
                pooledObject = new PooledObject();
                free.add(pooledObject);
                PooledObject.objectsCounter++;
        }

        } else {
            pooledObject = free.get(0);

        }
        return pooledObject;
    }

    public PooledObject acquireObject() {

        PooledObject pooledObject = getPoolObject();
        used.add(pooledObject);
        free.remove(pooledObject);
        return pooledObject;
    }

    public PooledObject releaseObject(PooledObject pooledObject) {
        used.remove(pooledObject);
        free.add(pooledObject);
        return pooledObject;
    }

}
