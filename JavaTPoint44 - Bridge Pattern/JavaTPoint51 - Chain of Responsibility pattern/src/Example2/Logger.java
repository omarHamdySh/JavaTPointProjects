package Example2;
/**
 * 
 * @author omarhamdy
 */
public abstract class Logger {

//----------------------Level Marks Initialization: Starts----------------------
    public static int OUTPUTINFO = 1;

    public static int ERRORINFO = 2;

    public static int DEBUGINFO = 3;
//----------------------Level Marks Initialization: Ends----------------------

    //Each Object will have a unique sequenced levels value, which will determine,
    //its order in the chain.
    protected int levels;

    //the reference type that will refer to the next member in the chain.
    protected Logger nextLevelLogger;

    //the setter method which will be used to determine the next level object in the chain
    //towards another object.
    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    /**
    * This method will be sort of recursive or have a behavior close to the recursive
    * behavior.
    * Lets see what will happen after executing the program.
    * first have a look on the three sub-classes of the abstract class Logger,
    * and then come back again. Note: don't continue reading unless you had a look.
    * 
    * Welcome again, as you so each sub-class will determine its levels variable value
    * at the instantiation time, also each of it has a different implementation 
    * of displayLogInfo(String msg) method.
    * 
    * well after execution: 
    * One of the members of the chain will be used to implement the code inside each and all
    * of the chain members depends on which object reference will be used to access the chain
    * but logically it must be the very first member in the tree, as you see inside first
    * condition of the logMessage() method, it determines the shape of the tree, by
    * letting the objects or the chain members those have the level smaller than the input
    * level while invoking the logMessage() method, those objects that will have smaller
    * than or equal values of levels variable can execute the displayLogInfo() method
    * implicitly, and thus at the second condition, if the nextLevelLogger reference is not
    * equal to null value which mean if there are next member of the chain and this current
    * class object is not the leaf node in the tree, so this next Level chain member could
    * execute its method so, lets invoke it, and thus the logMessage has sort of recursive 
    * behavior but each time its not calling the same class method but it calls the next
    * level member's logMessage() method, which mean at any time the logMessage() is called
    * it will be called as many as the chain members are, but the executing of the
    * displayLogInfo() method it will depend on the levels variable value at each object or
    * chain member.
    * 
    * this complexity of code, its not useless, it gives us a very powerful way of
    * using objects and methods of different object dynamically.
    * 
    * you can do magic with this design pattern, more than you can imagine.
    * 
    */
    public void logMessage(int levels, String msg) {

        if (this.levels <= levels) {

            displayLogInfo(msg);

        }
        if (nextLevelLogger != null) {

            nextLevelLogger.logMessage(levels, msg);

        }

    }

    protected abstract void displayLogInfo(String msg);

}
