package javatpoint23;

/**
 * There is a rule for exceptions, when an exception is thrown, and it's not
 * handled, program stops execution, but if it was handled, it skips the rest of
 * the current "try" only, continuing to the catch statement, then to the rest
 * of the code.
 */
public class Exceptioning {

    /**
     * Finally block implies that this code (inside finally) must be executed,
     * whether an exception thrown or not, even if an exception was thrown and
     * wasn't handled, this block of code must be executed
     *
     * The only two thing that can stop finally from execution are: <br>
     * - ("System.exit()" or "Runtime.getRuntime().exit();") the exit method
     * terminates the JVM itself, which execute the finally <br>
     * - A fatal error.
     */
    void tryFinally() {
        System.out.println("tryFinally:");
        System.out.println("step 1");
        try {
            System.out.println("step 2");
            int x = 10 / 0;
            System.out.println("step 3");
        } finally {
            System.out.println("step 4 - Finally");
        }
        System.out.println("step 5\n");
    }

    /**
     * There is a rule for catches, all catch blocks must be ordered from most
     * specific to most general, or you will receive a compile time error.
     */
    void tryCatch() {
        System.out.println("tryCatch:");
        System.out.println("step 1");
        try {
            System.out.println("step 2");
            int x = 10 / 0;
            System.out.println("step 3");
            Class.forName("SomeClass");
            System.out.println("step 4");
        } catch (ArithmeticException ex) {
            System.out.println("step 5 - FirstCatch");
        } catch (ClassNotFoundException ex) {
            System.out.println("step 5 - SecondCatch");
        } catch (Exception ex) {
            System.out.println("step 5 - ThirdCatch");
        }
        System.out.println("step 6\n");
    }

    /**
     * Try, catch and finally
     */
    void tryCatchFinally() {
        System.out.println("tryCatchFinally:");
        System.out.println("step 1");
        try {
            System.out.println("step 2");
            int x = 10 / 0;
            System.out.println("step 3");
            Class.forName("SomeClass");
            System.out.println("step 4");
        } catch (ArithmeticException ex) {
            System.out.println("step 5 - FirstCatch");
        } catch (ClassNotFoundException ex) {
            System.out.println("step 5 - SecondCatch");
        } finally {
            System.out.println("step 6 - Finally");
        }
        System.out.println("step 7\n");
    }

    /**
     * Nested tries allows you to continue the try block itself, by another
     * inner try block, see the example.
     */
    void nestedTries() {
        System.out.println("nestedTries:");
        System.out.println("step 1");
        try {
            System.out.println("step 2");
            try {
                System.out.println("step 3");
                int x = 10 / 0;
                System.out.println("step 4");
            } catch (ArithmeticException ex) {
                System.out.println("step 5 - FirstInner.FirstCatch");
            }

            System.out.println("step 6");
            try {
                System.out.println("step 7");
                Class.forName("SomeClass");
                System.out.println("step 8");
            } catch (ClassNotFoundException ex) {
                System.out.println("step 9 - SecondInner.FirstCatch");
            }
            System.out.println("step 10");
        } catch (Exception ex) {
            System.out.println("step 11 - Outer.FirstCatch");
        } finally {
            System.out.println("step 12 - Finally");
        }
        System.out.println("step 13\n");
    }
}
