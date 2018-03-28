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
// Abstraction
// This is an abstract class that will represent numerous
// ways to work with each device
public abstract class RemoteButton {

    // A reference to a generic device using aggregation
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice) {

        theDevice = newDevice;

    }

    public void buttonFivePressed() {

        theDevice.buttonFivePressed();

    }

    public void buttonSixPressed() {

        theDevice.buttonSixPressed();

    }

    public void deviceFeedback() {

        theDevice.deviceFeedback();

    }

    public abstract void buttonNinePressed();

}
