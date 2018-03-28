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
// Concrete Implementor
// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices
public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting) {

        deviceState = newDeviceState;

        maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("Channel Down");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("Channel Up");

        deviceState++;

    }

}
