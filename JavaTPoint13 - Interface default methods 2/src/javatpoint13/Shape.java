package javatpoint13;

/**
 *
 * @author abdo_
 */
public abstract class Shape implements Printable, Showable {

    /**
     * For "default" methods that cause ambiguity, even abstract classes have to
     * implement them.
     */
    @Override
    public void tryDefault() {
        System.out.println("Shape.tryDefault()");
    }
}
