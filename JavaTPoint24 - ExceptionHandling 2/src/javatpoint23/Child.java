package javatpoint23;

/**
 * There are some rules for declaring exceptions in method overriding, and we
 * will discuss them in this class.
 */
public class Child extends Parent {

    /**
     * If the superclass method doesn't declare an exception, subclass
     * overriding method can declare unchecked exceptions, but it cannot declare
     * checked exception.
     *
     * So the next code method signature fires a compile time error:
     *
     * void talk() throws IOException {
     *
     * }
     */
    @Override
    void talk() throws ArithmeticException {
        System.out.println("Child.talk()");
    }

    /**
     * If the superclass method declares an exception, subclass overriding
     * method may or may not declare an exception, but if it declared and
     * exception, it must be one of two: <br>
     * - Same overridden method exception <br>
     * - Child to overridden method exception.
     *
     * Declaring no exceptions:
     */
    @Override
    void tell() {
        System.out.println("Child.tell()");
    }

    /**
     * Same overridden method exception:
     */
    @Override
    void make() throws RuntimeException {
        System.out.println("Child.make()");
    }

    /**
     * Child to overridden method exception:
     */
    @Override
    void fart() throws ArithmeticException {
        System.out.println("Child.fart()");
    }

    /**
     * Such signature will fire a compile time error, because "Exception" is a
     * parent to "RuntimeException":
     *
     * void fart() throws Exception {
     *
     * }
     */
}
