package javatpoint05;

/**
 * If you tried to extend from FinalClass, it will give you a compile time
 * error.
 *
 * public class TestFinalMethodsClasses extends FinalClass
 */
public class TestFinalMethodsClasses extends FinalMethods {

    /**
     * Overriding non final method.
     */
    @Override
    void normalMethod() {
        System.out.println("TestFinalMethodsClasses.normalMethod()");
    }

    /**
     * If you tried to override finalMethod() which is "final", a compile time
     * error will be fired in your face :D .
     *
     *
     * void finalMethod() {
     *
     * }
     */
}
