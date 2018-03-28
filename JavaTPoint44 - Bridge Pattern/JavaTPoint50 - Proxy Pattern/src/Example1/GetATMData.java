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
// This interface will contain just those methods
// that you want the proxy to provide access to
public interface GetATMData {

    public ATMState getATMState();

    public int getCashInMachine();
}
