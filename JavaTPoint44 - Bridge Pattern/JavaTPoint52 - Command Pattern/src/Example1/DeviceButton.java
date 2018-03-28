/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

import java.util.LinkedList;

/**
 *
 * @author omarhamdy
 */
// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called
// The execute method for the Command interface then calls 
// the method assigned in the class that implements the
// Command interface
public class DeviceButton {

    public static LinkedList<CommandCounter> commandsSequnce = new LinkedList<CommandCounter>();
    
    Command theCommand;
    CommandCounter commandCount;
    public DeviceButton(Command newCommand) {

        theCommand = newCommand;
        //I don't know why but there are error called concurrentModification exceptions
        //raises if we used theCommand and added it to the LinkedList directory instead of
        //Encapsulating it in a brand new class (commandCounter) !! :)
        //and ELLy ye5teshy mn bent 3amoh maygebsh menha 3yal
        //Menak lellah law kont 5alst el collections wel threading kan zamany fahem eh by7sl
        commandCount=new CommandCounter();
        commandCount.setCommand(theCommand);

    }

    public void press() {

        theCommand.execute();
        commandsSequnce.add(commandCount);

    }

    // Now the remote can undo past commands
    public void pressUndo() {

        theCommand.undo();
        commandsSequnce.remove(commandCount);
         

    }

}
