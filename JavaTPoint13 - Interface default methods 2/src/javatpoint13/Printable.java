package javatpoint13;

/**
 *
 * @author abdo_
 */
public interface Printable {

    void print();

    default void tryDefault() {
        System.out.println("Printable.tryDefault()");
    }
}
