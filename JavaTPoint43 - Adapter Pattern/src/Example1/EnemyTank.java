/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
// EnemyTank implements EnemyAttacker perfectly
// Our job is to make classes with different methods
// from EnemyAttacker to work with the EnemyAttacker interface
import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");

    }

    public void driveForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank moves " + movement + " spaces");

    }

    public void assignDriver(String driverName) {

        System.out.println(driverName + " is driving the tank");

    }

}
