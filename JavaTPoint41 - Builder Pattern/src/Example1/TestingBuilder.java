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
public class TestingBuilder {

    /**
     * Note: Before going through this Example Kindly see the UML/Component Diagram of it
     * which is located at the design pattern folder itself.
     * 
     * Kindly Maintain this order: 
     * 
     * RobotPlan interface 
     * Robot Class 
     * RobotBuilder interface 
     * OldRobotBuilder class 
     * RobotEngineer class 
     * TestingBuilder class (Main)
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Get a RobotBuilder of type OldRobotBuilder
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // Pass the OldRobotBuilder specification to the engineer
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        // Tell the engineer to make the Robot using the specifications
        // of the OldRobotBuilder class
        robotEngineer.makeRobot();

        // The engineer returns the right robot based off of the spec
        // sent to it on line 11
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());

        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());

        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());

    }

}
