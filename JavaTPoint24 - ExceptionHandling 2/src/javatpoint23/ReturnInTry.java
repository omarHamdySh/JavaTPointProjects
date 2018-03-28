package javatpoint23;

/**
 * This class will discuss returning values inside "try", "catch" and "finally";
 * There are two rules for that:
 *
 * - If finally block returns a value then try and catch blocks may or may not
 * return a value
 *
 * - If finally block does not return a value then both try and catch blocks
 * must return a value.
 */
public class ReturnInTry {

    /**
     * For try and catch, this is easily understandable and normal.
     */
    int tryCatch() {
        try {
            return 0;
        } catch (Exception ex) {
            return 1;
        }
    }

    /**
     * But when "finally" exists, you have two options, whether to (use return
     * statement in "try" or "catch" or both), or to use return statement in
     * "finally"
     *
     * Of course you can use return statement everywhere, but finally return
     * statement always override other return statements
     *
     * Know that using return statement in "finally" block, will ignore
     * unhandled exceptions.
     */
    int tryCatchFinally1() {
        try {
            //Return nth here
        } catch (Exception ex) {
            //Return nth here
        } finally {
            return 2;
        }
    }

    /**
     * Return statement in both "try and "catch".
     */
    int tryCatchFinally2() throws ArithmeticException {
        try {
            return 0;
        } catch (Exception ex) {
            return 1;
        } finally {
            //Return nth here
            System.out.println("tryCatchFinally2.finally after return statement");
        }
    }

    /**
     * Return statement in "try and "catch" and "finally" (useless, will return
     * finally's return statement).
     */
    int tryCatchFinally3() {
        try {
            return 0;
        } catch (Exception ex) {
            return 1;
        } finally {
            return 2;
        }
    }

    /**
     * Return statement in both "catch" and "finally" (useless, will return
     * finally's return statement).
     */
    int tryCatchFinally4() {
        try {
            //Return nth here
        } catch (Exception ex) {
            return 1; //Useless
        } finally {
            return 2;
        }
    }

    /**
     * Return statement in both "try and "finally" (useless, will return
     * finally's return statement).
     */
    int tryCatchFinally5() {
        try {
            return 0; //Useless
        } catch (Exception ex) {
            //Return nth here
        } finally {
            return 2;
        }
    }
}
