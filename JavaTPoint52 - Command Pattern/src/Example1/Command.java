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
// Each command you want to issue will implement 
// the Command interface
public interface Command {

    public void execute();

    // You may want to offer the option to undo a command
    public void undo();

}
