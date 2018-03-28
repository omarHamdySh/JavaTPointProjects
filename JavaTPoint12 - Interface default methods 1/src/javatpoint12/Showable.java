package javatpoint12;

/**
 *
 * @author abdo_
 */
public interface Showable {

    void show();

    /**
     * Since java 8, an interface can have default methods, default method are
     * normally implemented method, but the compiler still adds "public" keyword
     * to it.
     */
    default void tryDefault() {
        System.out.println("Showable.tryDefault()");
    }
}
