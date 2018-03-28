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
// The concrete builder class that assembles the parts 
// of the finished Robot object

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		
		this.robot = new Robot();
		
	}
	
	public void buildRobotHead() {
		
		robot.setRobotHead("Tin Head");
		
	}

	public void buildRobotTorso() {
		
		robot.setRobotTorso("Tin Torso");
		
	}

	public void buildRobotArms() {
		
		robot.setRobotArms("Blowtorch Arms");
		
	}

	public void buildRobotLegs() {
		
		robot.setRobotLegs("Rollar Skates");
		
	}

	public Robot getRobot() {
		
		return this.robot;
	}
	
	
	
}