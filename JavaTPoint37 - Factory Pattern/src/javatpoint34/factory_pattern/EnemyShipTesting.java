/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint34.factory_pattern;
/**
 * Kindly maintain this order:
 * - EnemyShip abstract class
 * - BigUFOEnemyShip class
 * - RocketEnemyShip class
 * - UFOEnemyShip class
 * - EnemyShipFactory class
 * - EnemyShipTesting class
 */
import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation
      
        EnemyShipFactory enemyFactory = new EnemyShipFactory();

        Scanner userInput = new Scanner(System.in);
        EnemyShip theEnemy = null;

        String enemyShipOption = "";

        System.out.println("Please Enter The Enemy Type:\n");
                
        if (userInput.hasNextLine()) {
            String enemyShipOpion = userInput.nextLine();

            enemyFactory.makeEnemyship(enemyShipOpion);

        }

        if (theEnemy != null) {
            
            doStuffEnemy(theEnemy);
        }

    }

    public static void doStuffEnemy(EnemyShip enemyShip) {

        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.shootEnemyShip();

    }

}
