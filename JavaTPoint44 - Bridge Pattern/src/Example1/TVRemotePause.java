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
public class TVRemotePause extends RemoteButton{
	
	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);
	}
	
	public void buttonNinePressed() {
		
		System.out.println("TV was Paused");
		
	}
	
}