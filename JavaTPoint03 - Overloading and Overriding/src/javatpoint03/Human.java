package javatpoint03;

/**
 *
 * @author abdo_
 */
public class Human {

    int id;
    String name;
    int age;
    String nationality;

    /**
     * Normal inheritance.
     */
    void fart() {
        System.out.println("farting");
    }

    /**
     * Testing overriding.
     */
    void identify() {
        System.out.println("I'm a human");
    }

    /**
     * Static methods are inherited, but they cannot be overridden.
     */
    static void shout() {
        System.out.println("Human is shouting");
    }

    /**
     * Testing covariance overriding.
     */
    Exception get() {
        return new Exception();
    }

}
