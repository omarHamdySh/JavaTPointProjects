package javatpoint23;

/**
 * When an Unchecked exception is thrown and not handled, it drops down in the
 * methods call stack, to the previous method, if it wasn't handled there, it
 * drops down again to the previous method, and so on until it reaches a method
 * that it is handled in, or until it reaches the very bottom of the stack (main
 * method) and explode :D, this is called Exception Propagation
 *
 * As we just said, it happens automatically to Unchecked exceptions, and if you
 * want to apply this concept on Checked exceptions, you have to use "throws"
 * keyword, see "ThrowsKeyword" class.
 */
public class ThrowKeyword {

    /**
     * There's a trigger for any exception that make it to be thrown, but you
     * can still throw exceptions manually.
     */
    void throwException() {
        int x = 10;
        if (x < 100) {
            /**
             * Like here, there is no (real) "ArithmeticException" happening
             * here, but using "throw" keyword forces the exception to be
             * thrown.
             */
            throw new ArithmeticException("Welcome to throw keyword from 'ThrowKeyword.throwException()'");
        }
    }

    /**
     * When the exception was thrown in "throwException()" and not handled, it
     * came down to "firstMethod()" looking for handling.
     */
    private void firstMethod() {
        throwException();
    }

    /**
     * When it came down to "firstMethod()" and didn't find a handling, it came
     * down to "secondMethod()" looking for handling.
     */
    private void secondMethod() {
        firstMethod();
    }

    /**
     * When it came down to "thirdMethod()" it was handled, so nothing happened
     * (no runtime nor compile time exceptions).
     */
    void thirdMethod() {
        try {
            secondMethod();
        } catch (Exception ex) {
            System.out.println("Exception handled in ThrowKeyword.thirdMethod()");
        }
    }
}
