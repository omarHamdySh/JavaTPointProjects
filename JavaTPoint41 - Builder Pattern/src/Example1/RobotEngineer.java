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

// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    // OldRobotBuilder specification is sent to the engineer
    public RobotEngineer(RobotBuilder robotBuilder) {
        /**
         * Notice that using Up casting at the run time the real type of the
         * robotBuilder Object will be of the type that is passed to the
         * constructor at the initialization time of the RobotEngineerClass.
         */
        this.robotBuilder = robotBuilder;

    }

    // Return the Robot made from the OldRobotBuilder spec
    /**
     * this method is the core method of the Builder pattern which represents the implicit
     * complex creation and the returning of an object.
     * @return 
     */
    public Robot getRobot() {

        /**
         * No matter what was the Robot type, it will be forced to implement the
         * getRobot() method, this method is returning the object being created whatever
         * was its real type.
         */
        return this.robotBuilder.getRobot();

    }

    // Execute the methods specific to the RobotBuilder 
    // that implements RobotBuilder (OldRobotBuilder)
    public void makeRobot() {

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();

    }

}
