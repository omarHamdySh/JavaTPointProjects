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
import java.util.List;

public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    public void execute() {

        for (ElectronicDevice device : theDevices) {
            device.off();
        }

    }

    public void undo() {

        for (ElectronicDevice device : theDevices) {
            device.on();
        }

    }
}
