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
// Refined Abstraction
// If I decide I want to further extend the remote I can
public class DVDRemote extends RemoteButton {

    private boolean play = false;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        if (play) {
            play = !play;
            System.out.println("DVD is Playing: " + play);

        } else {
            play = !play;
            System.out.println("DVD is stopped: " + play);

        }

    }

}
