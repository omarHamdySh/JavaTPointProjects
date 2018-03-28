package javatpoint14;

/**
 *
 * @author abdo_
 */
public interface Printable {

    void print();

    /**
     * Since Java 8, interfaces can have static methods and also compiler adds
     * "public" keyword to them.
     */
    static void tryStatic() {
        System.out.println("Printable.tryStatic()");
    }
}
