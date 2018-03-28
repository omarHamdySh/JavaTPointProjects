/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint54.java.reflection;

/**
 *
 * @author omarhamdy
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyship(String newEnemyShip) {
        if (newEnemyShip.equals("U")) {
            return new UFOEnemyShip(this);
        } else if (newEnemyShip.equals("R")) {
            return new RocketEnemyShip();
        }

        return null;

    }

}
