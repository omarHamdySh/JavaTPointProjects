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
public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumenDown();

    }

}
