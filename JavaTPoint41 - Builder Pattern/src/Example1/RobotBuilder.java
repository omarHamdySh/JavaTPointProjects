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
// Defines the methods needed for creating parts 
// for the robot

public interface RobotBuilder {
	
	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();
	
	public Robot getRobot();
	
}