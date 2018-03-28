package javatpoint13;

/**
 *
 * @author abdo_
 */
public interface Showable {

    void show();

    default void tryDefault() {
        System.out.println("Showable.tryDefault()");
    }
}
