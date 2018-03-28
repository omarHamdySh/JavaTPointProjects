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
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice) {

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()
    public void undo() {

        theDevice.on();

    }

}
