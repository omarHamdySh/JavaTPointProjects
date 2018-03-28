/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint35.abastractfactorypattern;

import EnemyShip.EnemyShip;
import EnemyShipBuilding.EnemyShipBuilding;
import EnemyShipBuilding.UFOEnemyShipBuilding;

/**
 * @author omarhamdy
 */

/**
 * Summary and components orders: 
 * 
 * - The abstract factory pattern is used within this project for creating a 
 * family of Enemy ships each EnemyShip has basic properties and actions:
 *      - EnemyShip Must have Engine, have a look on classes within ESEngine Package.
 *      - EnemyShip Must Have weapon/Gun,have a look on classes within ESWeapon Package.
 * 
 * - All Members are declared at the EnemyShip abstract class and inherited at the extended
 * classes of all the EnemyShip types,one method is abstract which differs in behavior
 * from one Enemy ship type to another, have a look on classes within EnemyShip Package.
 * 
 * - Both of the Engine and Weapon of an EnemyShip it differs from one enemy ship type
 * to another, so we use EnemyShipFactory abstract class and its sub-classes (that pertains
 * the types of EnemyShips) to have the proper implementation of an EnemyShip type,
 * according to its special specification, have a look on classes within EnemyShipFactory
 * Package.
 * 
 * - In order to put all of these components together we use "FactoryBuilding" abstract class
 * to define the integration and the implementation of all the components, have a look on
 * classes within EnemyShipBuilding Package, hence that at this package the abstract factory
 * class is located and represented in the UFOEnemyShipBuilding.
 * 
 * Finally at the EnemyShipTesting we use our program to see the magic of the abstract
 * factory pattern.
 * - 
 * @author omarhamdy
 */

public class EnemyShipTesting {
    public static void main(String[] args) {
		
		// EnemyShipBuilding handles orders for new EnemyShips
		// You send it a code using the orderTheShip method &
		// it sends the order to the right factory for creation
	
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
 
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
 
	}
}
