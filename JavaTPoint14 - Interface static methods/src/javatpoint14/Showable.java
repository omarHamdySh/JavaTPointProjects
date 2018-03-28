package javatpoint14;

/**
 *
 * @author abdo_
 */
public interface Showable {

    void show();

    /**
     * Since Java 8, interfaces can have static methods and also compiler adds
     * "public" keyword to them.
     */
    static void tryStatic() {
        System.out.println("Showable.tryStatic()");
    }
}
