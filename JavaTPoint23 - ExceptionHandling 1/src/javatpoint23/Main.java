package javatpoint23;

/**
 * - Checked Exceptions are the exceptions known or thrown during compile time,
 * they are checked during compile time, they are also called compile time
 * exceptions; All exceptions which extend "Exception" and don't extend
 * "RuntimeException" are checked exceptions
 *
 * - Unchecked Exceptions are the exceptions known or thrown during runtime,
 * they are checked during runtime, they are also called runtime exceptions; All
 * exceptions which extend "Exception" and don't extends "RuntimeException" are
 * unchecked exceptions
 *
 * - Errors are unchecked, they're usually caused by the environment which the
 * application is running in, it's impossible to recover from errors, even if
 * you tried to try and catch them, the application itself will stop execution,
 * like "StackOverflowError".
 * 
 * Maintain this order, Exceptioning, ThrowKeyword, ThrowsKeyword
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testThrowing();
        System.out.println("------------------------");
        testExceptioning();
      
    }
    static void testExceptioning() {
        new Exceptioning().tryCatch();
        new Exceptioning().tryCatchFinally();
        new Exceptioning().nestedTries();
        new Exceptioning().tryFinally();
    }
    
    static void testThrowing(){
        new ThrowKeyword().thirdMethod();
        new ThrowsKeyword().thirdMethod();
    }
}
