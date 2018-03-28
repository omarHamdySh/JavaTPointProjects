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
public class Client3 {

    ObjectPool objPool = ObjectPool.getObjPoolInstance();
    PooledObject pooledObject = objPool.acquireObject();

    public void whatObjectYouUse() {
        System.out.println("Client3 says: I'm using \n" + pooledObject.objectName);
    }

}
