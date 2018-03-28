package javatpoint03;

/**
 *
 * @author abdo_
 */
public class Engineer extends Human {

    float Salary;

    /**
     * Overriding.
     */
    @Override
    void identify() {
        System.out.println("I'm an Engineer");
    }

    /**
     * Covariance overriding says, you can override a method with changing it's
     * return type, if and only if the return type of the overriding method is a
     * child or subclass to the return type of the overridden method
     *
     * Here the parent "get()" method returns Exception, and the child "get()"
     * method returns ArithmeticException which is a child of Exception.
     */
    @Override
    ArithmeticException get() {
        return new ArithmeticException();
    }

    /**
     * You cannot override static methods:
     *
     * void shout() {
     *
     * }
     *
     * This would give you a compile time error, because static methods belong
     * to the class in class area (in memory), and overriding is recognized
     * during the runtime (that's why they call it runtime polymorphism), so the
     * binding between method "call" and "body" happens in the runtime, while in
     * static methods it happens in the compile time so that, static methods can
     * be called without object creation.
     *
     * But actually you can do this ->
     */
    static void shout() {
        System.out.println("Engineer is shouting");
    }
    /**
     * This is called "hiding", what is happening here is that you are creating
     * a new static method that (by coincidence) have the same name of an
     * inherited static method, so the inherited static method now is hidden
     * behind the new static method in this class (only)
     *
     * You have to know that there is no relation by any mean between the
     * inherited static method and the newly created static method, and
     * determining which one have to be called depends on the REFERENCE TYPE of
     * the object.
     */
}
