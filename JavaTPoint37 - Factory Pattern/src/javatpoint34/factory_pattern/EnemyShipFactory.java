/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint34.factory_pattern;

/**
 *
 * @author omarhamdy
 */
public class EnemyShipFactory {
    
    public EnemyShip makeEnemyship(String newEnemyShip)
    {
        if (newEnemyShip.equals("U"))
            return new UFOEnemyShip();
        else if (newEnemyShip.equals("R"))
            return new RocketEnemyShip();
        else if (newEnemyShip.equals("B"))
            return new BigUFOEnemyShip();
        else
            return null;
            
    }
    
}
