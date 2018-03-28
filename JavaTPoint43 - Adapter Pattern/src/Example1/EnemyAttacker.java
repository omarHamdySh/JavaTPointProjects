package Example1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author omarhamdy
 */
// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new 
// classes compatible with this one.
public interface EnemyAttacker {

    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);

}
