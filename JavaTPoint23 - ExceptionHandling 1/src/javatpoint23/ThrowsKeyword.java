package javatpoint23;

import java.io.IOException;

/**
 * Checked exceptions are not propagated by default, so to make it propagated we
 * use throws keyword.
 */
public class ThrowsKeyword {

    /**
     * This method throws IOException, or declares IOException (using throws
     * keyword to propagate, the use of throws itself is called declaring, so
     * when a method declares an exception, it means that this method throws
     * that exception).
     */
    private void throwException() throws IOException {
        int x = 10;
        if (x < 100) {
            /**
             * If you didn't handle a checked exception, you have to use
             * "throws" keyword on the method, so it shall throw it to the
             * caller method.
             */
            throw new IOException("Welcome to throws keyword from 'ThrowsKeyword.throwException()'");
        }
    }

    /**
     * The exception was thrown (manually) from "throwException()" to the caller
     * method, which is "firstMethod()", so we have to handle it here or throw
     * it to the caller method using "throws" keyword.
     */
    private void firstMethod() throws IOException {
        throwException();
    }

    /**
     * The exception came down from "firstMethod()" to "secondMethod()" looking
     * for handling, so we have to handle it here or throw it the caller method using
     * "throws" keyword.
     */
    private void secondMethod() throws IOException {
        firstMethod();
    }

    /**
     * The exception came down to "thirdMethod()" it was handled, so nothing
     * happened (no runtime nor compile time exceptions).
     */
    void thirdMethod() {
        try {
            secondMethod();
        } catch (IOException ex) {
            System.out.println("Exception handled in ThrowsKeyword.thirdMethod()");
        }
    }
}
