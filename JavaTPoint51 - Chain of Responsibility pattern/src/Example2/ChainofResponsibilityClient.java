package Example2;
/**
 * Kindly Maintain this Order:
 * 
 * ChainofResponsibilityClient class; => doChaining();
 * Logger Abstract class;
 * ConsoleBasedLogger class;
 * ErrorBasedLogger class
 * DebugBasedLogger class;
 * ChainofResponsibilityClient class; => main();
 * 
 * @author omarhamdy
 */
public  class ChainofResponsibilityClient {

    private static Logger doChaining() {
        /**
         * This Example2, is one of the most powerful proof on how much useful the deep study
         * of the OOP was, which without it, you may not understand what's going on here in this
         * Example so pay attention to it.
         * 
         *Using the Up-casting, we will create the chain of the responsibility through 
         * doChaining() Method, each reference/Object 's real type will be different,
         * But here the Up-casting means nothing but saving a bit of memory.
         * 
         * The Core Function of the method is, creating three objects those are arranged
         * using a variable (levels), which will hold a values in an ascending order,
         * those values are saved in static variables in the Logger abstract class.
         * static int OUTPUTINFO = 1;
         * static int ERRORINFO = 2;
         * static int DEBUGINFO = 3;
         * 
         * Those three values will be put as a hard coded marks for each of the variables;
         * consoleLogger.levels -> 1
         * errorLogger.levels -> 2
         * debugLogger.levels -> 3
         * 
         * All the Three object were created, and ALL has a reference called nextLevelLogger
         * which will be used to connect all the chain members, so each will refer to another:
         * consolLogger.nextLevelLogger -> errorLogger.
         * errorLogger.nextLevelLogger -> debugLogger.
         * 
         * So the chain will look as the following;
         * consoleLogger -> errorLogger -> debugLogger
         * 
         * The program is designed to display some info on the screen, based on the levels 
         * variable value and the nextLevelLogger reference real object.
         * 
         * See the Logger Abstract class;
         * 
         */
        // Create the chaining
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO/*1*/);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO/*2*/);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO/*3*/);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String args[]) {

        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO/*1*/, "Enter the sequence of values ");

        chainLogger.logMessage(Logger.ERRORINFO/*2*/, "An error is occured now");

        chainLogger.logMessage(Logger.DEBUGINFO/*3*/, "This was the error now debugging is compeled");

    }

}
