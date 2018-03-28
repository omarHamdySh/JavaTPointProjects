 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_Pattern;

import java.util.Scanner;

public class EnemyShipTesting {
    
    public static void main (String[] args)
    {
        EnemyShipFactory enemyFactory = new EnemyShipFactory();
        
        Scanner userInput = new Scanner(System.in);
        
        EnemyShip theEnemy=null;

        String enemyShipOption= "";
         
        if (userInput.hasNextLine())
        {
            String enemyShipOpion= userInput.nextLine();
            
            enemyFactory.makeEnemyship(enemyShipOpion);
            
            
        }
        
        if (theEnemy!= null)
            doStuffEnemy(theEnemy);

    }
 
    public static void doStuffEnemy(EnemyShip enemyShip)
    {
        
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.shootEnemyShip();
        
    }
    
}
