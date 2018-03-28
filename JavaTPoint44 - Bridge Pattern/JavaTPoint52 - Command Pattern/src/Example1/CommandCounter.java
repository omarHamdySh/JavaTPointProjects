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
public class CommandCounter {
    
    private  Command command;
    private  int    clicksNumber;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public int getClicksNumber() {
        return clicksNumber;
    }

    public void setClicksNumber(int clicksNumber) {
        this.clicksNumber = clicksNumber;
    }
    
}
