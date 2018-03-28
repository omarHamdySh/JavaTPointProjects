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

// This is the interface that will be returned from the builder

public interface RobotPlan{
	
	public void setRobotHead(String head);
	
	public void setRobotTorso(String torso);
	
	public void setRobotArms(String arms);
	
	public void setRobotLegs(String legs);
	
}